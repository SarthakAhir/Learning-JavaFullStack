class Ex5{
static void div(int x,int y){

try{
System.out.println(x/y);
}catch(ArithmeticException e){

System.out.println("div() please check 2nd value must be a non zero"+e);
}
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

finally{
System.out.println("finally block reached");
}
div(a,b);
}
}
