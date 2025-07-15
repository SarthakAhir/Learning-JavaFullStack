class Five{

static int addTwo(int a,int b){

System.out.println(a+b);
return a+b;
}

public static void main(String[] args){

int sum = addTwo(12, 23);
System.out.println(sum);
int result = Five.addTwo(1, 2);
System.out.println(result);

}
}