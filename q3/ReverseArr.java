class ReverseArr{
	public static void main(String[] args){
		char normalarr[] = {'t','h','u','v','a'};
		System.out.print("Normal array :");
		for(int i=0;i<normalarr.length;i++){
			System.out.print(normalarr[i]);
		}

		System.out.print("\nReverse array :");
		for(int i=normalarr.length-1;i>=0;i--){
			System.out.print(normalarr[i]);
		}
	}	
}
