import java.util.*;
class Main {
  public static void main(String[] args) {
    // create  strings
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();

    // check if name is present in txt
    // using contains()
    boolean result = str1.contains(str2);
    if(result) {
      System.out.println(str2 + " is present in the string.");
    }
    else {
      System.out.println(str2 + " is not present in the string.");
    }

    
  }
}