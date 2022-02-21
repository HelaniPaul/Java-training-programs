
/*Write a program to input a character array and print the ASCII value of those characters.*/
import java.util.*;
class ASCII{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of entries");
int num = sc.nextInt();
char[] chararry = new char[num];
System.out.println("Enter the characters array");
for(int i=0;i<num;i++){
chararry[i] = sc.next().charAt(0);
}
System.out.println("ASCII values are:");
for(int i=0;i<num;i++){
int ascii = chararry[i];
System.out.print(ascii+ " ,");
}



}
}
