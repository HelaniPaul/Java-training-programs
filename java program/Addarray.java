import java.util.Scanner;
class Addarray{
	public static void main(String[] args) {
		System.out.println("enter the row and column of array");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr1[][] = new int[row][col];
		int arr2[][] = new int[row][col];
		int arr3[][] = new int[row][col];
		System.out.println("Enter the values to array1");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the values for second array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Sum of the array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr3[i][j]= arr1[i][j]+ arr2[i][j];
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println("");
		}
		
		
	}
}
