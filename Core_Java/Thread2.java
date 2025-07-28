class Thread2 extends Thread1{
public void run(){

for(int i=0;i<=10;i++){
System.out.println(Thread.currentThread().getName());

}

}
public static void main(String[] args){
Thread2 t1=new Thread2();
t1.start();

Thread2 t2=new Thread2();
t2.start();

}
}