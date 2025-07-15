abstract class Abs{
 abstract void add(int a,int b);

void sub(int a,int b){

System.out.println(a-b);
}
}

class Myabs extends Abs{
void add(int a,int b){

System.out.println(a+b);

}

public static void main(String[] args){

Abs a=new Myabs();
a.add(12,23);
a.sub(12,2);
}

}