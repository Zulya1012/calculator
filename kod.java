import java.util.Scanner;
public class kod{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value:");
int a=sc.nextInt();
System.out.println("Enter the value:");
int b=sc.nextInt();
System.out.println("Select operation") ;
System.out.println(" +");
System.out.println(" -");
System.out.println(" *");
System.out.println(" /");
Scanner in=new Scanner(System.in);
String x=in.nextLine();


if (x.equals ("+")) {
  System.out.println(a+b); 
}

else if (x.equals("-")) {
  System.out.println(a-b);
}

else if (x.equals("*")){
System.out.println(a*b);
}
else if (x.equals("/")) {

System.out.println(a/b);
}



  




}

}
