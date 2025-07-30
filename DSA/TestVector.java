
import java.util.Vector;

class TestVector {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		System.out.println(v);
		System.out.println("capacity: "+v.capacity());
		System.out.println("Size: "+ v.size());
		
		System.out.println("======================");
		
		v.addElement("hello");
		v.addElement(new StringBuffer("sb"));
		v.addElement(new Integer(100));
		
		System.out.println(v);
		System.out.println("capacity: "+v.capacity());
		System.out.println("Size: "+ v.size());
		System.out.println(v.contains("hello1"));
				
		
	}

}
