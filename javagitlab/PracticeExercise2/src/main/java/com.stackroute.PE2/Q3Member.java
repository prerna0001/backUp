/*Create a class named Member with Name, age, Salary as its variable, write an other
class named Member Variable that creates an instance of the Member class, initialises its
member variables, and then displays the value of each member variable.
Output:
Members Name: Harry Potter
Members Age: 30
Members Salary: 2500.3*/



import java.util.Scanner;

public class Q3Member {

    public static class Member
    {
        Scanner input= new Scanner(System.in);
        String name;
        int age;
        int salary;

        public void setName(String n)
        {
            name= n;

        }

        public void setAge(int a)
        {
            age=a;

        }

        public void setSal(int s)
        {
            salary= s;

        }


        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        public int getSal()
        {
            return salary;
        }

    }

    public static class MemberVar extends Member
    {
        public void acc() {
            Member m = new Member();

            m.setName("Rama");
            m.setAge(40);
            m.setSal(50000);

            System.out.print("Member's name- "+m.getName());
            System.out.print("\nMember's age- "+m.getAge());
            System.out.print("\nMember's Salary- "+m.getSal());
        }

    }
    public static void main(String[] args)
    {
        MemberVar a=new MemberVar();
        a.acc();
    }

}
