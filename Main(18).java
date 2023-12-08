class Print{
    public void print(int n1,int n2,int n3){
        if(n3==0){
            for(int i=n1;i<=n2;i++){
                if(i%2==0){
            System.out.println(i+"\t");
        }
        }    
        }
        else if(n3==1){
            for(int i=n1;i<=n2;i++){
                if(i%2!=0){
            System.out.println(i+"\t");
        }
            }
        }
    }
}
class Thread1 extends Thread{
    Print t1=new Print();
    public void run(){
        t1.print(1,40,0);
    }
}
class Thread2 extends Thread{
    Print t2=new Print();
    public void run(){
        t2.print(1,40,1);
    }
}
public class ThreadN {
public static void main(String[] args) {

Thread1 t1=new Thread1();
Thread2 t2=new Thread2();
t1.start();
t2.start();
}
}