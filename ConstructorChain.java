public class ConstructorChain
{
    ConstructorChain()
    {
        this("Hello");
        System.out.println("Default constructor is");
        
    }
    ConstructorChain(String str)
    {
        System.out.println("Parameterized constructor is");
        
        }
        public static void main(String[]args)
        {
            ConstructorChain cc= new ConstructorChain();
        }
	


}