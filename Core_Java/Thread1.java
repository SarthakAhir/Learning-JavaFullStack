class Thread1 extends Thread{
public void run(){

System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());

}
public static void main(String[] args){
Thread1 t1=new Thread1();
t1.start();

Thread1 t2=new Thread1();
t2.start();

}
}