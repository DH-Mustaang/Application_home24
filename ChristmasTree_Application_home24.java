import java.util.Scanner;

public class ChristmasTree_Application_home24 {                                 //developed by David Höftmann
  
  public static void main (String [] args) {
    
    int height, hsaver, hcounter, add=0, addsaver=0;
    char star;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\n        *** Christmas tree ***\n");
    System.out.print(" How big should your Christmas tree be?  ");
    height = sc.nextInt();
    System.out.print("\n Do you want to have a star on top? (y/n)  ");
    star = sc.next().charAt(0);
    sc.close();
    System.out.print("\n\n\n");
    hsaver = height;
    hcounter = height;
    
    if (star == 'y') {
      while (hcounter > 0) {
        System.out.print(" ");
        hcounter = hcounter - 1;
      }
      System.out.println("*");
      hcounter = height;
    }
        
    while (height > 0) {
      while (hcounter > 0) {
        System.out.print(" ");
        hcounter = hcounter - 1;
      }
      
      hcounter = height;
      hcounter = hcounter - 1;
          
      while (hcounter != height) {
        System.out.print("x");
        hcounter++;
        }
      
      while (add != addsaver) {
        System.out.print("x");
        add++;
      }
      
      addsaver = addsaver + 2;
      
      add = 0;
      height = height - 1;
      hcounter = height;
      System.out.println();
      }
    
    while (hsaver > 0) {
      System.out.print(" ");
      hsaver = hsaver - 1;
    }
    System.out.print("I");
    System.out.print("\n\n\n\n\n\n");
  }
}
