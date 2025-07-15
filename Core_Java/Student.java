class Student{

	int id;
	String name;
	int mark;

	Student(int sid,String sname, int smark){

	System.out.println("Students three args constructor is called");

	this.id = sid;
	this.name = sname;
	this.mark = smark;

	System.out.println("ID : " + this.id + "\n" +"Name : " + 
this.name + "\n" +"Marks : " + this.mark);
}

public static void main(String[] args){
Student s1=new Student(52,"sarthak Ahir",90); // s1 is ref variable

System.out.println(s1);
	
	}
}
