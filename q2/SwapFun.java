class ReverseArr{
	public static void main(String[] args){
		String char = {'t','h','u','v','a'};
		System.out.print("Normal array :");
		for(int i=0;i<char.length();i++){
			System.out.print(char[i]);
		}

		System.out.print("Reverse array :");
		for(int i=char.length()-1;i>=0;i--){
			System.out.print(char[i]);
		}
	}	
}
}