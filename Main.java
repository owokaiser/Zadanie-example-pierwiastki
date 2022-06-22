import java.lang.Math;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("podaj a");
    double a=scan.nextInt();
    System.out.println("podaj b");
    double b=scan.nextInt();
    System.out.println("podaj c");
    double c=scan.nextInt();
    System.out.println("f="+a+"x^2 + "+b+"x + "+c);
    double delta=Math.pow(b,2)-4*a*c;
    if(delta==0)
    {
      double x=-b/(2*a);
       System.out.println("Pierwiastek: \nx= "+x);
    }
      
    else if(delta>0)
    {
      double x1=(-b-Math.sqrt(delta))/(2*a);
      double x2=(-b+Math.sqrt(delta))/(2*a);
      System.out.println("Pierwiastki: \nx1= "+x1+"\nx2= "+x2);
    }else if(delta<0) System.out.println("Podana funkcja nie posiada pierwiatków");
  }
}