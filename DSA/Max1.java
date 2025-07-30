class Max1 {
	
	static int minofArray(int[] arr) {
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}

	static int maxofArray(int[] arr) {
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

	
	public static void main(String[] args) {
		
		int[] value= {2,4,3,6,5,7};

		int max = maxofArray(value);

		System.out.println("maximum value: "+ max);
		
		int min = minofArray(value);
		
		System.out.println("minimum value: "+ min);
	}

}
