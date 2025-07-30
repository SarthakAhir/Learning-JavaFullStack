class Array1 {
	public static void main(String[] args) {
		//array of primitive
		
		int[] marks = {100,90,85,60,70};
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("=====================================================");
		//array objects
		String[] it_cities= {"Bangaluru","Chennai","Nagpur","Mumbai"};
		
		for(int i=0;i<it_cities.length;i++) {
			System.out.println(it_cities[i]);
		}
		
		System.out.println("=====================================================");
		
		//enhanced for loop
		
		for(String city:it_cities) {
			System.out.println(city);
		}
	}

}