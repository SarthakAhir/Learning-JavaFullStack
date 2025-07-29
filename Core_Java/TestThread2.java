class TestThread2 implements Runnable{
public void run(){
System.out.println(Thread.currentThread().getName());
}

public static void main(String[] args){

TestThread2 t = new TestThread2();

Thread tt = new Thread(t);

tt.start();

}
}