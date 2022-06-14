class Twodarray{
	public static void main(String[] args){
	String[][] portfolio ={{"Name","Contact_Number","Address"},{"Thuva","0771964801","Maniapy"},
						{"Dixan","07719643333","Chankanai"},
						{"Dilan","0771977733","Chunakam"}};

		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				System.out.print(portfolio[i][j]+" ");
			}
			System.out.println();
		}
	}
}