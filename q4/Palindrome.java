class SameChar{
	public static void main(String[] args){
		String word1="Thuva",word2="Thivi";
		if(word1.length()==word2.length()){
		   char wordarr1[word1.length()];
		   char wordarr2[word1.length()];
	           for(int i=0;i<word1.length();i++){
		     if(word1.charAt(i) != word2.charAt(i)){
		     	System.out.println("word 1 and word 2 are not same");
       			break;
		     }
		     else{
		     	wordarr1[i]=word1.charAt(i);
			wordarr2[i]=word2.charAt(i);
		    }
		   }
		}
		else{
		  System.out.println("word 1 and word 2 are not same");
		}
	}	
}
