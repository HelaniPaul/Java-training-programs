import java.util.*;
class Reverse{
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("enter the number of entries");
		int num = sc.nextInt();
		String[] arr = new String[num];
		String[] rev = new String[num];
		System.out.println("Enter the values to array");
		for(int i=0;i<num;i++) {
			arr[i] = sc.next();
		}
		System.out.print("the orginal array are:");
		for(int i=0;i<num;i++) {
			System.out.print( arr[i]);
		}
		for(int i=0;i<num;i++) {
			rev[i]=arr[i];
		}
		
		for(int i=num-1;i>=0;i++) {
			System.out.print( rev[i]);
		}
		
	}
	
}