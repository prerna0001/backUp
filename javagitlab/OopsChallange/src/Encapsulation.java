/*Encapsulation Challenge
Create a class and demonstrate proper encapsulation techniques. The class will be called Printer and it will simulate a real Computer Printer.
It should have fields for the toner Level, number of pages printed, and also whether it’s a duplex printer (capable of printing on both sides of the paper).
Add methods to fill up the toner (up to a maximum of 100%), another method to simulate printing a page (which should increase the number of pages printed).
Decide on the scope, whether to use constructors, and anything else you think is needed.*/
import java.util.Scanner;

public class Encapsulation {
    Scanner input= new Scanner(System.in);
     protected static class Printer
    {
       private int tonnerLevel, pagesPrinted;
       private boolean isDuplex;

        public int getTonnerLevel() {

            return tonnerLevel;
        }

        public int getPagesPrinted() {

            return pagesPrinted;
        }

        public boolean getIsDuplex() {

            return isDuplex;
        }

        public void setTonnerLevel(int tonnerLevel) {
            this.tonnerLevel = tonnerLevel;
        }

        public void setPagesPrinted(int pagesPrinted) {
            this.pagesPrinted = pagesPrinted;
        }

        public void setDuplex(boolean duplex) {
            isDuplex = duplex;
        }
    }
    public static class AccessPrinter extends Printer
    {
        public void values()
        {
            Printer objOfPrinter=new Printer();
            objOfPrinter.setTonnerLevel(58);
            System.out.println(" tonner value is "+ objOfPrinter.getTonnerLevel());
            objOfPrinter.setPagesPrinted(300);
            System.out.println(" \n pages printed are "+ objOfPrinter.getPagesPrinted());
            objOfPrinter.setDuplex(true);
            System.out.println(" \n is printer Duplex "+ objOfPrinter.getIsDuplex());


        }
    }
    public static void main(String[] args)
    {
        AccessPrinter objOfAccess=new AccessPrinter();
        objOfAccess.values();


    }



}
