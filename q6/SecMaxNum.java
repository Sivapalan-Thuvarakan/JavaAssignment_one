class SecMaxNum{

	//selection sort
	int[] sorting(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int index=i;
			for(int j=i+1;j<arr.length;j++){
			  if(arr[j]<arr[index]){
				index=j;
			  }
			}
			//swap
                        int temp = arr[i];
			arr[i]=arr[index];
   			arr[index]=temp;
		}
		return arr;
	}
	public static void main(String[] args){
		int[] NumberList = {2,17,13,4,9};
    		SecMaxNum obj1 = new SecMaxNum();
		int[] sortNumberList=obj1.sorting(NumberList);
		System.out.print("Second Maximum Number in list :"+sortNumberList[sortNumberList.length-2]);
		
	}	
}
