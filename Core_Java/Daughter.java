class Mother {
	
	void job() {
		System.out.println("Working at Bank");
	}
	
	public String toString() {
		return "This is an object of Daughter class";
	}

}

class Daughter extends Mother {
	
	void job() {
		System.out.println("Software");
	}
	
	public static void main(String[] args) {
		
		Daughter d1 = new Daughter();
		System.out.println(d1);
		d1.job();
		
		Daughter d2= new Daughter();
		System.out.println("\n" + d2);
		d2.job();
		
		Mother m1 = new Mother();
		m1.job();
		
		Mother m2 = new Mother();
		m2.job();
	}
}