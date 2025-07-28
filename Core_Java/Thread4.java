class Thread4 implements Runnable{
public void run(){

System.out.println(Thread.currentThread().getName());
}

public static void main(String[] args){
Thread4 tt1=new Thread4();
Thread t1 = new Thread(tt1, "one");
t1.start();

Thread t2=new Thread(tt1,"two");
t2.start();
}
}