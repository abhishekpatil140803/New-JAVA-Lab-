
//java Program to convert all prinmitives into its corresponding 
//wrapper objects and vice-verse
public class WrapperExample2{
    public static void main(String []args){
        Integer a=new Integer(3);
        int i=a.intValue();
        int j=a;
        System.out.println(a+""+i+""+j);
    }
}