import java.util.Scanner;
public class GCD{
    public static void main (String args[]) {
        int n1=30;
        int n2=45;
        int gcd=0;
        for(int i=1;i<=n1&&i<=n2;i++)
        {
            if(i%n1==0&&i%n2==0)
            gcd=i;
              
        }
        System.out.println("gcd of " +n1+ " and "+n2+" is "+gcd); 
     }
	}

