import java.util.*;  
class UserInput   
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);     
System.out.print("Enter first number : ");  
int a= sc.nextInt();  
System.out.print("Enter second number : ");  
int b= sc.nextInt();  
System.out.print("Enter third number : ");  
int c= sc.nextInt(); 
System.out.print("Enter fourth number : ");  
int d= sc.nextInt(); 
int e=a+b+c+d;  
System.out.println("Total = " +e);  
}  
} 