package com.stackroute.datamunger;

/*There are total 5 DataMungertest files:
 * 
 * 1)DataMungerTestTask1.java file is for testing following 3 methods
 * a)getSplitStrings()  b) getFileName()  c) getBaseQuery()
 * 
 * Once you implement the above 3 methods,run DataMungerTestTask1.java
 * 
 * 2)DataMungerTestTask2.java file is for testing following 3 methods
 * a)getFields() b) getConditionsPartQuery() c) getConditions()
 * 
 * Once you implement the above 3 methods,run DataMungerTestTask2.java
 * 
 * 3)DataMungerTestTask3.java file is for testing following 2 methods
 * a)getLogicalOperators() b) getOrderByFields()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask3.java
 * 
 * 4)DataMungerTestTask4.java file is for testing following 2 methods
 * a)getGroupByFields()  b) getAggregateFunctions()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask4.java
 * 
 * Once you implement all the methods run DataMungerTest.java.This test case consist of all
 * the test cases together.
 */

import java.util.ArrayList;

public class DataMunger {

	/*
	 * This method will split the query string based on space into an array of words
	 * and display it on console
	 */

	public String[] getSplitStrings(String queryString) {
		String[] words=queryString.toLowerCase().split("\\s");
		for(String s:words)
		{
			System.out.println(s);
		}
		return words;
	}

	/*
	 * Extract the name of the file from the query. File name can be found after a
	 * space after "from" clause. Note: ----- CSV file can contain a field that
	 * contains from as a part of the column name. For eg: from_date,from_hrs etc.
	 * 
	 * Please consider this while extracting the file name in this method.
	 */

	public String getFileName(String queryString) {
		int p1 = queryString.indexOf("from") +5;
		int p2 = queryString.indexOf("csv") +3;
		queryString= queryString.substring(p1,p2);
		return queryString;
	}

	/*
	 * This method is used to extract the baseQuery from the query string. BaseQuery
	 * contains from the beginning of the query till the where clause
	 * 
	 * Note: ------- 1. The query might not contain where clause but contain order
	 * by or group by clause 2. The query might not contain where, order by or group
	 * by clause 3. The query might not contain where, but can contain both group by
	 * and order by clause
	 */
	
	public String getBaseQuery(String queryString) {
		int p1 = queryString.indexOf("from") + 5;
		int p2 = queryString.indexOf(" ",p1);
		if(p2 == -1)
			p2 = queryString.length();


		queryString = queryString.substring(0,p2);


		return queryString;

	}

	/*
	 * This method will extract the fields to be selected from the query string. The
	 * query string can have multiple fields separated by comma. The extracted
	 * fields will be stored in a String array which is to be printed in console as
	 * well as to be returned by the method
	 * 
	 * Note: 1. The field name or value in the condition can contain keywords
	 * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The field
	 * name can contain '*'
	 * 
	 */
	
	public String[] getFields(String queryString) {
		queryString = queryString.toLowerCase();
		String [] arrofStr = queryString.split(" ")[1].split(",");
		return arrofStr;

	}

	/*
	 * This method is used to extract the conditions part from the query string. The
	 * conditions part contains starting from where keyword till the next keyword,
	 * which is either group by or order by clause. In case of absence of both group
	 * by and order by clause, it will contain till the end of the query string.
	 * Note:  1. The field name or value in the condition can contain keywords
	 * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The query
	 * might not contain where clause at all.
	 */
	
	public String getConditionsPartQuery(String queryString) {
		queryString = queryString.toLowerCase();
		String arr[]=getSplitStrings(queryString);
		if(!queryString.contains("where"))
		{
			return null;
		}


		String sath="";
		for (int i=0;i<arr.length;i++)
		{

			if (arr[i].equals("where"))
			{
				for (int j=i+1;j<arr.length;j++)
				{
					if (arr[j].equals("order")||arr[j].equals("group"))
					{
						break;
					}
					else
					{
						sath=sath.concat(" "+arr[j]);
					}

				}
				break;
			}
		}
		return sath.trim();

	}

	/*
	 * This method will extract condition(s) from the query string. The query can
	 * contain one or multiple conditions. In case of multiple conditions, the
	 * conditions will be separated by AND/OR keywords. for eg: Input: select
	 * city,winner,player_match from ipl.csv where season > 2014 and city
	 * ='Bangalore'
	 * 
	 * This method will return a string array ["season > 2014","city ='bangalore'"]
	 * and print the array
	 * 
	 * Note: ----- 1. The field name or value in the condition can contain keywords
	 * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The query
	 * might not contain where clause at all.
	 */

	public String[] getConditions(String queryString) {
		queryString = queryString.toLowerCase();
		int p1 = queryString.indexOf("where");
		if (p1 == -1) {
			return null;
		}
		String [] arrofStr = queryString.split("where")[1].trim().split("group by | order by")[0].trim().split(" and | or ");
		//System.out.println(Arrays.toString(arrofStr));
		return arrofStr;
	}

	/*
	 * This method will extract logical operators(AND/OR) from the query string. The
	 * extracted logical operators will be stored in a String array which will be
	 * returned by the method and the same will be printed Note:  1. AND/OR
	 * keyword will exist in the query only if where conditions exists and it
	 * contains multiple conditions. 2. AND/OR can exist as a substring in the
	 * conditions as well. For eg: name='Alexander',color='Red' etc. Please consider
	 * these as well when extracting the logical operators.
	 * 
	 */

	public String[] getLogicalOperators(String queryString) {
		int p1 = queryString.indexOf("where");
		if (p1 == -1) {
			return null;
		}


		String [] arrofStr = queryString.split("where")[1].trim().split(" ");
		int i,count=0,j;
		for (i=0;i<arrofStr.length;i++) {
			if (arrofStr[i].equals("and") || arrofStr[i].equals("or")) {
				count++;
			}
		}
		String[] ray = new String[count] ;
		for (i=0,j=0 ;i<arrofStr.length;i++) {
			if (arrofStr[i].equals("and")) {
				ray[j] = arrofStr[i];
				j++;
			}
			else if (arrofStr[i].equals("or")) {
				ray[j] = arrofStr[i];
				j++;
			}
			else {
				continue;
			}
		}


		return ray;
	}

	/*
	 * This method extracts the order by fields from the query string. Note: 
	 * 1. The query string can contain more than one order by fields. 2. The query
	 * string might not contain order by clause at all. 3. The field names,condition
	 * values might contain "order" as a substring. For eg:order_number,job_order
	 * Consider this while extracting the order by fields
	 */

	public String[] getOrderByFields(String queryString) {
		if (!queryString.contains("order by")) {
			return null;
		}
		String [] arrofStr = queryString.split("order by")[1].trim().split(" ");

		return arrofStr ;
	}

	/*
	 * This method extracts the group by fields from the query string. Note:
	 * 1. The query string can contain more than one group by fields. 2. The query
	 * string might not contain group by clause at all. 3. The field names,condition
	 * values might contain "group" as a substring. For eg: newsgroup_name
	 * 
	 * Consider this while extracting the group by fields
	 */

	public String[] getGroupByFields(String queryString) {
		if (!queryString.contains("group by")) {
			return null;
		}
		String [] arrofStr = queryString.split("group by")[1].trim().split(" ");
		return arrofStr ;
	}

	/*
	 * This method extracts the aggregate functions from the query string. Note:
	 *  1. aggregate functions will start with "sum"/"count"/"min"/"max"/"avg"
	 * followed by "(" 2. The field names might
	 * contain"sum"/"count"/"min"/"max"/"avg" as a substring. For eg:
	 * account_number,consumed_qty,nominee_name
	 * 
	 * Consider this while extracting the aggregate functions
	 */

	public String[] getAggregateFunctions(String queryString) {
		if(queryString.contains("count") || queryString.contains("sum") || queryString.contains("min") || queryString.contains("max")
				|| queryString.contains("avg"))
		{
			ArrayList<String> list = new ArrayList<String>();
			String [] arrofStr = queryString.split(" ");
			String [] arrofStr1 = arrofStr[1].trim().split(",");
			for (int i=0;i < arrofStr1.length;i++) {
				if (arrofStr1[i].contains("(")) {
					list.add(arrofStr1[i]);

				}
			}
			return list.toArray(new String[list.size()]);

		}
		return null;

	}

}