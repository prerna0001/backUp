
/*Write a Java method to check if a given number is power of 4*/

public class Q2Power4 {
    public boolean power(int n)
    {
        if(n == 0)
            return false;
        while(n != 1)
        {
            if(n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true;
    }

    public boolean powernot(int n)
    {
        if(n == 0)
            return false;
        while(n != 1)
        {
            if(n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true;
    }
    public boolean checkfornegative(int n)
    {
        return n<0;//boolean will ret true for this as boolean by deafault true
    }

}
