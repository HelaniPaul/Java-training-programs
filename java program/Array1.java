import java.util.*;
import java.lang;
class Array1{
	static int flag=0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number values in the array ");
		int Num = sc.nextInt();
		int[] arr1 = new int[Num];
		System.out.println("Enter the values to the array");
		for(int i=0;i<Num;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i=0;i<Num;i++) {
			for(int j=i+1;i<Num;j++) {
				if(arr1[i]==arr1[j]);
				System.out.println(arr1[j]);
			}
		}
		
	}
}