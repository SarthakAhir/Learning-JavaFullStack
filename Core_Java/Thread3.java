class Thread3 extends Thread{
public void run(){

try{
for(int i=0;i<=5;i++){
System.out.println(Thread.currentThread().getName());
Thread.sleep(2000);
}
}catch(InterruptedException e){

System.out.println(e);
}

}
public static void main(String[] args){
Thread3 t1=new Thread3();
t1.start();

Thread3 t2=new Thread3();
t2.start();//sleep method -checked exception

}
}