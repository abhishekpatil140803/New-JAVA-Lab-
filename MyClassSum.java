//commandline Argument
public class MyClassSum
{
    static int sum=0;
	public static void main(String[] args) {
	for(int i=0;i<args.length;i++){
	    sum=sum+Integer.parseInt(args[i]);
	}
	System.out.println(sum);
	}
}
