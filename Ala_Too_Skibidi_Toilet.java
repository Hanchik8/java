import java.util.Scanner;

public class Ala_too_Skibidi_toilet {
   Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      Ala_too_Skibidi_toilet obj = new Ala_too_Skibidi_toilet();

      System.out.println("Enter your last name: ");
      String lastName = obj.scanner.nextLine();

      System.out.println("Enter your first name: ");
      String firstName = obj.scanner.nextLine();
      clearConsole();

      System.out.println("The presence of a school education certificate");
      System.out.println("       0- Not available\r\n" +
            "       1- Available\r\n");
      int input = obj.scanner.nextInt();
      boolean hasSchooCertificate = (input == 1);

      String specialty = "";
      int specialtyCost = 0;
      double discount = 0;
      String discountSystem = "";

      if (hasSchooCertificate) {
         System.out.println("Your ORT score: ");
         int ORT = obj.scanner.nextInt();
         if (ORT > 240) {
            clearConsole();
            System.out.println("The maximum score in the ort is 240 points, liar liar pants in fire!");
         } else if (ORT < 110) {
            clearConsole();
            System.out.println("Applicant, with ORT below 110 scores, cannot be admitted to Ala-Too University.");
         } else {
            System.out.println("Your english language proficiency level");
            System.out.println("       1- A1\r\n" +
                  "       2- A2\r\n" +
                  "       3- B1\r\n" +
                  "       4- B2\r\n" +
                  "       5- C1\r\n" +
                  "       6- C2\r\n");
            int englishLevel = obj.scanner.nextInt();
            if (englishLevel > 6) {
               clearConsole();
               System.out.println(
                     "Why did you decide to choose a larger number than was suggested? You cannot be admitted to Ala-Too University");
            } else if (englishLevel > 2) {
               clearConsole();
               System.out.println("Choose which specialty you want to study.\n" +
                     "Menu of Selecting specialties:");
               System.out.println("      1- Computer Engineering (2500$)\n" + //
                     "      2- Artificial Intelligence (2200$)\n" + //
                     "      3- Psychology (1900$)\n" + //
                     "      4- Journalism (1700$)\n" + //
                     "      5- International Relations (2200$)\n" + //
                     "      6- Law (1800$)\n" + //
                     "      7- Management (2200$)\n" + //
                     "      8- Medicine (3300$)");
               int chosenSpecialty = obj.scanner.nextInt();
               switch (chosenSpecialty) {
                  case 1:
                     specialty = "Computer Engineering";
                     specialtyCost = 2500;
                     break;

                  case 2:
                     specialty = "Artificial Intelligence";
                     specialtyCost = 2200;
                     break;

                  case 3:
                     specialty = "Psychology";
                     specialtyCost = 1900;
                     break;

                  case 4:
                     specialty = "Journalism";
                     specialtyCost = 1700;
                     break;

                  case 5:
                     specialty = "International Relations";
                     specialtyCost = 2200;
                     break;

                  case 6:
                     specialty = "Law";
                     specialtyCost = 1800;
                     break;

                  case 7:
                     specialty = "Management";
                     specialtyCost = 2200;
                     break;

                  case 8:
                     specialty = "Medicine";
                     specialtyCost = 3300;
                     break;

                  default:
                     clearConsole();
                     System.out.println(
                           "WE HAVE ONLY EIGHT SPECIALTIES, STUDENTS WHO CANNOT READ. CANNOT BE ADMITTED TO ALA TOO UNIVERSITY!!!");
                     System.exit(0);
                     break;
               }

               if (ORT > 140 && ORT <= 155) {
                  discountSystem = " with a 5% discount";
                  discount = 0.95;
               } else if (ORT > 155 && ORT <= 174) {
                  discountSystem = " with a 10% discount";
                  discount = 0.90;
               } else if (ORT > 174 && ORT <= 199) {
                  discountSystem = " with a 25% discount";
                  discount = 0.75;
               } else if (ORT > 199 && ORT <= 209) {
                  discountSystem = " with a 50% discount";
                  discount = 0.50;
               } else if (ORT > 209 && ORT <= 218) {
                  discountSystem = " with a 75% discount";
                  discount = 0.25;
               } else if (ORT > 218 && ORT < 241) {
                  discountSystem = " with a 100% discount";
                  discount = 0;
               } else {
                  discountSystem = "";
                  discount = 1;
               }
               clearConsole();
               System.out.println("Dear " + firstName + " " + lastName + ", we congratulate you!\n"
                     + "You have been admitted to the " + specialty + " program at Ala-Too International University.\n"
                     +
                     "The cost of your tuition" + discountSystem + " will be " + specialtyCost * discount + "$"
                     + " per year.");

            } else {
               clearConsole();
               System.out.println(
                     "You have an insufficient level of English, the University of Alatoo may offer you to take a one-year course.\r\n"
                           + //
                           "Then next year, after completing that course, you will be able to enroll the university.");
            }
         }
      } else {
         clearConsole();
         System.out
               .println("Applicant, without school education certificate, cannot be admitted to Ala-Too University");
      }

   }

   public static void clearConsole() {
      for (int i = 0; i < 50; i++) {
         System.out.println();
      }
   }
}
