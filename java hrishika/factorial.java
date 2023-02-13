import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int c =1;
        System.out.println("The factorial of number is");
        int n = sc.nextInt();
        for (int i =1;i<=n;i++)
        {
         c = c*i;
        }
        System.out.println(c);
    }
}

