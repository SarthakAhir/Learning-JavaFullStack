class Th1{
static{
System.out.println("inside static block");
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());

}
public static void main(String[] args){

System.out.println("inside main");
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());

}
}