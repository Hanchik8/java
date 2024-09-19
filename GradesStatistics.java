import java.util.Scanner;

public class GradesStatistics {
   Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {

      GradesStatistics obj = new GradesStatistics();
      int num = obj.scanner.nextInt();
      int gradeA = 0;
      int gradeB = 0;
      int gradeC = 0;
      int gradeD = 0;
      int gradeF = 0;
      for (int i = 0; i < num; i++) {
         int numGrade = obj.scanner.nextInt();
         if (numGrade >= 90 && numGrade <= 100) {
            gradeA++;
         } else if (numGrade >= 75 && numGrade <= 89) {
            gradeB++;
         } else if (numGrade >= 60 && numGrade <= 74) {
            gradeC++;
         } else if (numGrade >= 50 && numGrade <= 59) {
            gradeD++;
         } else if (numGrade >= 0 && numGrade <= 49) {
            gradeF++;
         } else {
            System.out.println("Why did you enter a negative number? You can not read?");
         }
      }
      int sum = gradeA + gradeB + gradeC + gradeD + gradeF;
      double procentA = (double) gradeA / sum;
      double procentB = (double) gradeB / sum;
      double procentC = (double) gradeC / sum;
      double procentD = (double) gradeD / sum;
      double procentF = (double) gradeF / sum;
      String As = "";
      String Bs = "";
      String Cs = "";
      String Ds = "";
      String Fs = "";
      if (gradeA > 1) {
         As = "s";
      }
      if (gradeB > 1) {
         Bs = "s";
      }
      if (gradeC > 1) {
         Cs = "s";
      }
      if (gradeD > 1) {
         Ds = "s";
      }
      if (gradeF > 1) {
         Fs = "s";
      }
      clearConsole();

      System.out
            .println("А: " + gradeA + " grade" + As + " (" + (String.format("%.0f", procentA * 100)) + "%" + ")\r\n" + //
                  "\r\n" + //
                  "B: " + gradeB + " grade" + Bs + " (" + String.format("%.0f", (procentB * 100)) + "%" + ")\r\n" + //
                  "\r\n" + //
                  "C: " + gradeC + " grade" + Cs + " (" + String.format("%.0f", (procentC * 100)) + "%" + ")\r\n" + //
                  "\r\n" + //
                  "D: " + gradeD + " grade" + Ds + " (" + String.format("%.0f", (procentD * 100)) + "%" + ")\r\n" + //
                  "\r\n" + //
                  "F: " + gradeF + " grade" + Fs + " (" + String.format("%.0f", (procentF * 100)) + "%" + ")\r\n");
   }

   public static void clearConsole() {
      for (int i = 0; i < 50; i++) {
         System.out.println();
      }
   }
}
