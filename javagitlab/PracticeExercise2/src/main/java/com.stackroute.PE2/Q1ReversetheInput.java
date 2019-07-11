
/*Write a Java method to Reverse the given input & Check if it is a Palindrome.*/

public class Q1ReversetheInput {

    String s1 = "its a palindrome", s2 = "its not a palindrome";

    public String palindrom(int num) {
        int revnumber = 0;
        int remainder;
        int temp = 0;


        temp = num;

        while (temp != 0) {

            remainder = temp % 10;  // Find the last digit
            revnumber = (revnumber * 10) + remainder; // To reverse the number
            temp = temp / 10;

        }


        if (num == revnumber) {
            return s1;
        } else {
            return s2;
        }

    }
    public String palindromNot(int num) {
        int revnumber = 0;
        int remainder;
        int temp = 0;


        temp = num;

        while (temp != 0) {

            remainder = temp % 10;  // Find the last digit
            revnumber = (revnumber * 10) + remainder; // To reverse the number
            temp = temp / 10;

        }


        if (num == revnumber) {
            return s1;
        } else {
            return s2;
        }

    }
}