class Data 
{
    private String name;
    public void setter(String s)
    {
        name=s;
    }
    public void getter()
    {
    System.out.println(name);
    System.out.println("java");
    }
}
public class Main
{
	public static void main(String[] args)
	{
	Data d= new Data();
	d.setter("programiz");
	d.getter();
	}
}