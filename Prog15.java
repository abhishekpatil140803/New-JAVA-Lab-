//15.	Demonstrate the java class using getter setter method for accessing private data members
	public class Prog15{ 
    static int x;
    Prog15(int i){ //setter
        x=i;
    }
    public static void get(){ //Getter
        System.out.println(x);
    }
    public static void main(String[] args) {
        Prog15 obj=new Prog15(100);
        Prog15.get();
    }
}

