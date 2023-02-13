import java.util.*;
class swap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers");
        int x = 9;
        int y = 7;
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("the numbers after swapping is =\n"+x+" \n"+y);
        
        
    }
}

