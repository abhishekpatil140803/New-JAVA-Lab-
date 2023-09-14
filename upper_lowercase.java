import java.util.*;    
public class upper_lowercase
 {
 	public static void main(String[] args) 
 	{
 	    String name="Abhishek";
 	    System.out.println(name);
 	    Scanner sc=new Scanner(System.in);
 	    System.out.println("Enter the choice 0/1");
 	    int choice=sc.nextInt();
 	    switch(choice)
 	    {
 	        case 0:
 	        System.out.println(name.toLowerCase());
 	        break;
 	        case 1:
 	            System.out.println(name.toUpperCase());
 	            break;
 	            default:
 	            System.out.println("no case");
 	    }
 	    
 	}
 }