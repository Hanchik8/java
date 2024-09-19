import java.util.Scanner;
public class CalculatorInt {
   Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      CalculatorInt obj = new CalculatorInt(); 
      
      System.out.print("Chose number 1: ");

      int Chislo1 = obj.scanner.nextInt();

      System.out.print("Chose number 2: ");
      int Chislo2 = obj.scanner.nextInt();

      System.out.println("       1- Multiplication\r\n" +
            "       2- Division\r\n" +
            "       3- Subtraction\r\n" +
            "       4- Addition");

      int Vibor = obj.scanner.nextInt();
      clearConsole();

      switch (Vibor) {
         case 1:
            Multiplication(Chislo1, Chislo2);
            break;
         case 2:
            Division(Chislo1, Chislo2);
            break;
         case 3:
            Subtraction(Chislo1, Chislo2);
            break;
         case 4:
            Addition(Chislo1, Chislo2);
            break;
         default:
            System.out.println("You can't read? There are only 4 elections");
            break;
      }
   }

   static void Multiplication(int Chislo1, int Chislo2) {
      System.out.println(Chislo1 + " * " + Chislo2 + " = " + (Chislo1 * Chislo2));
   }

   static void Division(int Chislo1, int Chislo2) {
      System.out.println(Chislo1 + " / " + Chislo2 + " = " + ((double) Chislo1 / Chislo2));
   }

   static void Subtraction(int Chislo1, int Chislo2) {
      System.out.println(Chislo1 + " - " + Chislo2 + " = " + (Chislo1 - Chislo2));
   }

   static void Addition(int Chislo1, int Chislo2) {
      System.out.println(Chislo1 + " + " + Chislo2 + " = " + (Chislo1 + Chislo2));
   }

   public static void clearConsole() {
      for (int i = 0; i < 50; i++) {
         System.out.println();
      }
   }
}
/**
 * CalculatorInt
 */
//SHA256:L2phgcTUPg1oKCrUSL3f2D57sWShUSVdx1bVX5YNnXs