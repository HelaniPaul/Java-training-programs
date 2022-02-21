import java.util.*;
public class SubString{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first string");
String str1  = sc.nextLine();
System.out.println("Enter the second string");
String str2 = sc.nextLine();
int result = str1.indexOf(str2);
if(result!=-1){
System.out.println(str2+"is present");
}
else{
System.out.println(str2+"is not present");
}
}
}