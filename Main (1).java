class finalkeyword2
 
{
    public final void display(){
     System.out.println("This is a final method.");   
    }
    
}
class main extends finalkeyword2{
     public final void display(){
        System.out.println("This final method is overridden.");   
}
	public static void main(String[] args) 
	{
	   main obj = new main();
	   obj.display();
	}
}

