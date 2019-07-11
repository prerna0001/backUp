package com.stackroute;

import com.stackroute.db.CrudOperation;
import com.stackroute.db.DatabaseMetadataDemo;
import com.stackroute.db.JDBCBatchProcessingDemo;
import com.stackroute.db.ResultsetMetadataDemo;
//import com.stackroute.db.RowSetDemo;

public class Main {
    public static void main(String[] args) {
        CrudOperation crudOperation = new CrudOperation();
        crudOperation.displayData();
//        crudOperation.deleteCustomer(3);
//        crudOperation.displayData();
        crudOperation.insertCustomer();
//        crudOperation.updateCustomer();
//        crudOperation.displayCustomrerByName("Prerna","F");
//        RowSetDemo rowSetDemo= new RowSetDemo();
//        rowSetDemo.rowSetDemo();

//        DatabaseMetadataDemo databaseMetadataDemo=new DatabaseMetadataDemo();
//        databaseMetadataDemo.getDatabaseMetadataInformation();

//        JDBCBatchProcessingDemo jdbcBatchProcessingDemoObject=new JDBCBatchProcessingDemo();
//        jdbcBatchProcessingDemoObject.jDBCBatchProcessing();

        ResultsetMetadataDemo resultsetMetadataDemo=new ResultsetMetadataDemo();
        resultsetMetadataDemo.displayData();
    }
}
