class Array2 {
	
	static int sumofArray(int[] myarray) {
		
		int sum =0;
		
		for(int i=0;i<myarray.length;i++) {
			
			sum +=myarray[i];
			
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] marks = {100,90,85,60,70};
		
		int sum = sumofArray(marks);
		
		System.out.println(sum);
		
	}
}