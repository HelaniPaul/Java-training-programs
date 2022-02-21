class Student3{  
int RollNo;  
String name; 
Student3(int i,String n){  
    RollNo = i;  
    name = n;  
    }   
//method to display the value of id and name  
void display()
{
System.out.println("RollNo ="+RollNo+" "+"Name ="+name);
}  
  
public static void main(String args[]){  
//creating objects  
Student3 s1=new Student3(2,"John");   
//displaying values of the object  
s1.display();    
}  
}  