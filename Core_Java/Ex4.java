class Ex4{
static void div(int x,int y){
System.out.println(x/y);
}

public static void main(String[] args){
int a=0;
int b=0;
try{

String s1 = args[0];
String s2 = args[1];
System.out.println(s1 + s2);
a=Integer.parseInt(s1);
b=Integer.parseInt(s2);

System.out.println(a+b);
System.out.println(a/b);

}
catch(ArrayIndexOutOfBoundsException e1){

System.out.println("Please enter any two values");
System.out.println(e1);

}
catch(NumberFormatException e2){
System.out.println("please enter only number");
System.out.println(e2);
}
catch(ArithmeticException e3){
System.out.println("2nd value must be a non zero number");
System.out.println(e3);
}
}
}
