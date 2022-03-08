import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Jak się nazywasz?");
    String imie=myObj.nextLine();
    System.out.println("Witaj "+imie+"!");
    System.out.println("Test math:");
    System.out.println("Podaj a:");
    int a=myObj.nextInt();
    System.out.println("Podaj b:");
    int b=myObj.nextInt();
    int suma=a+b;
    System.out.println(a+"+"+b+"="+suma);

    boolean x=false;
    if(suma==4) x=true;
    else
      x=false;
    if(x)
      System.out.println("Nawet dobrze liczy");
    else
      System.out.println("Coś nie pykło");
    
    
  }
}