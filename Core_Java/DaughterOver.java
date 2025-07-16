//Attributes cant be Overrided  Only non private methodes can be overridden

class MotherOver{

int age = 45;
void tour(){

System.out.println("any temple");
}
}
class DaughterOver extends MotherOver{

int age =20;
void tour(){

System.out.println("any hill station");
}
public static void main(String[] args){

MotherOver m=new DaughterOver();
m.tour();
System.out.println(m.age);
}
}