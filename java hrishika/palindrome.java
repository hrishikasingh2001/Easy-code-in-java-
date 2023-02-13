import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int sum = 0;
        int a,temp;
        System.out.println("Enter the number");
        int x = sc.nextInt();
        temp=x;
        while(x>0)
        {
            a=x%10;
            sum=(sum*10)+a;
            x=x/10;
        }
        if(temp==sum)
        {
            System.out.println("the number is palindrome");
        }
        else
        {
            System.out.println("the number is not palindrome");
        }
    }
}

