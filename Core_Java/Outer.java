class Outer{
int y=100;
void callInner(){
Inner i1=new Inner();
i1.add(1000);
}

	class Inner{
		int x=1;//not visible outside
		void add(int a){
		a++;
		System.out.println(a);
		}
}
public static void main(String[] args){

Outer o = new Outer();
o.callInner();
new Outer().callInner();
Outer.Inner o1 = o.new Inner();
o1.add(1);

	}
}

