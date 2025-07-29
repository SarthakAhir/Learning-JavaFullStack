interface Calculate1{

void result(int x,int y);
}

class lambda1{

public static void main(String[] args){

Calculate1 add = (x,y) -> System.out.println(x+y);

add.result(12,23);
}
}