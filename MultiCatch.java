class MultiCatch{
    public static void main(String[] args)
    {
        String s=null;
        int arr[]={10,20,30};
        try{
            System.out.println(arr[2]);
            System.out.println(s.length());



    }

    catch(ArrayIndexOutOfBoundsException e1){

        System.out.println("Exception Index Out Of Bounds"+e1);
    }
    catch(NullPointerException e2)
    {
         System.out.println("Exception NullPointer"+e2);
    }
    }
}