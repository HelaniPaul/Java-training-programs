class pgmm1 {    
  public static void main(String args[])
  {    
  try
  {
  int a=100/0;
  System.out.println(a);    
  }
  catch(NullPointerException e)
  {
  System.out.println(e);
  }
  finally 
  {
  System.out.println("iam in finally block");
  }
     
  }    
}
