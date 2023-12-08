//finally block
class Main{
    public static void main(String[] args)
    {
    try{
        int divideByzero=5/1;
    }

    catch(ArithmeticException e){
        System.out.println("ArithmeticException=>"+e.getMessage());
    }
    finally{
         System.out.println("This is final block");
    }
    }
}