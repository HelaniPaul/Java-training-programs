import java.util.*;
class Occurance{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the input");
		int a = sc.nextInt(); 
		int count =0;
		for(int i=0;i<num;i++) {
			if(a==arr[i]) {
				count+=1;
			}
			else {
				System.out.println(a+ "="+ "0");
			}
		}
		System.out.println(a+ "="+ count);
		
	}
}