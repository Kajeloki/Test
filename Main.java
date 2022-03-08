class Main {
  public static void main(String[] args) 
  {
    String imie="Piotr";
    System.out.println("Witaj "+imie+"!");
    System.out.println("Test math:");
    int a=2;
    int b=2;
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