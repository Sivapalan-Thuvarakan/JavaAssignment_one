import java.util.Scanner;
class console{

	void createSquare(int length){
		for(int i=0;i<length;i++){
			for(int j=0;j<length;j++){	
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	void createRectangle(int length,int width){
		for(int i=0;i<width;i++){
			for(int j=0;j<length;j++){	
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	void createCross(int length){
		for(int i=0;i<length;i++){
			for(int j=0;j<length;j++){
				if(i==j || j+i==length-1)	{
				System.out.print("*");
				}
				else{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	void createPlus(int length){
		for(int i=0;i<=length*2-1;i++){
			if(i!=length){
				for(int j=0;j<=length;j++){
					if(j==length){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
      			else{
				for(int j=0;j<=length*2-1;j++){	
				System.out.print("*");
				}
			}	
			System.out.print("\n");
		}
	}

	void createDiamond(int length){
		for(int i=1;i<=length;i++){
			for(int j=i;j<=length;j++){
			   System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++){
			   System.out.print("*");
			}
			System.out.print("\n");
		}	
		for(int i=length;i>=1;i--){
			for(int j=i-1;j<=length;j++){
			   System.out.print(" ");
			}
			for(int j=2;j<i*2-1;j++){
			   System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args){
		System.out.println("Questions:\n1.Print Square\n2.Print Rectangle\n3.print cross(x)\n4.print plus(+)\n5.print diamond\n6.to exit application\nQuestion:-Enter task number");
		Scanner sc = new Scanner(System.in);
		int answer=sc.nextInt();
		console obj = new console();
		
		if(answer==1){
			System.out.println("Enter a length of square");
			int length=sc.nextInt();
			obj.createSquare(length);
		}else if(answer==2){
			System.out.println("Enter a length of Rectangle");
			int length=sc.nextInt();
			System.out.println("Enter a width of Rectangle");
			int width=sc.nextInt();
			obj.createRectangle(length,width);
		}else if(answer==3){
			System.out.println("Enter a length of Cross");
			int length=sc.nextInt();
			obj.createCross(length);
		}else if(answer==4){
			System.out.println("Enter a length of Plus");
			int length=sc.nextInt();
			obj.createPlus(length);
		}else if(answer==5){
			System.out.println("Enter a length of Diamond");
			int length=sc.nextInt();
			obj.createDiamond(length);
		}else{
			System.exit(0);
		}
	}
}