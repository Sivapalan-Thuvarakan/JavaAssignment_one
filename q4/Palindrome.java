class Palindrome{
	public static void main(String[] args){
		String word="levewl";
		String reverse="";
		int length=word.length();
		for(int i=(length-1);i>=0;i--)
		{
			reverse=reverse + word.charAt(i);
		}
		if(word.equals(reverse)){
			System.out.println("Given Word is Palindrome");
		}
		else{
			System.out.println("Given Word is not a Palindrome");
		}
	}	
}
