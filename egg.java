class Name{
    String name;
    String surname;
    Name(String name,String surname) 
    {
        this.name=name;
        this.surname=surname;
    }
   
    
    
    public static Name function(Name n1,Name n2)
    {
        return new Name(n1.name+n1.surname+n2.surname,n2.name+n2.surname);
    }
}

class egg{
    public static void main(String args[])
    {
        Name n1=new Name("Aishwariya","Rai");
        Name n2=new Name("Abhishek","Bacchan");
        Name n3=Name.function(n1,n2);
        System.out.println(n3.name+"+"+n3.surname+" ");
    }
   
}