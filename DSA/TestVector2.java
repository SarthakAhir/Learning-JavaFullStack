import java.util.Enumeration;
import java.util.Vector;

class TestVector2 {
	public static void main(String[] args) {
		
		Vector marks = new Vector();
		
		marks.addElement(new Integer(98));
		marks.addElement(new Integer(99));
		marks.addElement(new Integer(97));
		
		System.out.println(marks);
		
		Enumeration e = marks.elements();
		int sum = 0;
		
		while(e.hasMoreElements()) {
			
			sum +=(int)e.nextElement();
		}
		
		System.out.println(sum);
		
	}

}
