
import java.util.Hashtable;

class TestHashtable1 {
	public static void main(String[] args) {
		
		Hashtable ht=new Hashtable();
		
		System.out.println(ht);
		ht.put("1001", new Integer(100));
		ht.put("1002", new Integer(99));
		ht.put("1003", new Integer(98));
		
		System.out.println("=============================================s");
		
		System.out.println(ht);
		ht.put("1001", new Integer(80));
		
		System.out.println("=============================================s");
		
		System.out.println(ht);
		System.out.println(ht.get("1001"));
		
		Enumeration e =ht.key();
	while(e.hasMoreElement()){

System.out.println(ht.get(e.nextElement()));
		
	}
}
}
