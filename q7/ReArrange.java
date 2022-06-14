import java.util.Scanner;
class ReArrange{

	void reArrange(int tar,int des){
		int[] arr={9,3,6,1,5,2,2};
		System.out.print("Before Arrangement :");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
                int temp=arr[tar];
		arr[tar]=arr[des];
		arr[des]=temp;

		System.out.print("\nAfter Arrangement :");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		
	}
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter target index?");
		String target_Index=myObj.nextLine();
		int target_int=Integer.parseInt(target_Index);
		System.out.println("Enter destination index?");
		String destination_Index=myObj.nextLine();  
		int destination_int=Integer.parseInt(destination_Index);

		ReArrange obj1 = new ReArrange();
		obj1.reArrange(target_int,destination_int);

		
		
	}	
}
