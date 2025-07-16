class Calculator{

void add(int a){
a++;
System.out.println(a);
}
void add(int a,int b){
System.out.println(a+b);
}

}
class TestCalculator{

void result(Calculator c){
c.add(1);
}
public static void main(String[] args){

TestCalculator t=new TestCalculator();
Calculator cc = new Calculator();
t.result(cc);

//2nd step

t.result(new Calculator());

//3rd step

new TestCalculator().result(new Calculator());
}
}