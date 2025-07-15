class TestOverLoad{

static void addTwo(int a, int b){
System.out.println(a+b);
}

static void addTwo(int a){
a++;
System.out.println(a);

}

static void addTwo(int a, int b,int c){
System.out.println(a+(b+c));
}

public static void main(String[] args){

addTwo(12,23);
TestOverLoad.addTwo(1);

}
}




