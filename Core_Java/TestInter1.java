interface Inter1{

void add(int a,int b); //public abstract

}

interface Inter2{
public abstract void sub(int a,int b);
}

class TestInter1 implements Inter1,Inter2{

public void add(int a,int b){
System.out.println(a+b);
}

public void sub(int a,int b){
System.out.println(a-b);
}


public static void main(String[] args){

Inter1 i1 = new TestInter1();
i1.add(12,23);

Inter2 i2 = new TestInter1();
i2.sub(12,23);
}
}