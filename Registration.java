import java.util.Scanner;

public class Registration {
   Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      Registration obj = new Registration();
      int Login = 240104029;
      int Password = 250207;

      int LoginUser = 0;
      int PasswordUser = 0;
      int again = 0;
      String again1 = "";
      int Security = 0;

      boolean isLogInCorrect = !(Login == LoginUser && Password == PasswordUser);

      while (isLogInCorrect && (Security < 3)) {
         if (again > 0) {
            again1 = " again";
         }
         System.out.println("Enter your Login and Password" + again1 + ", please.");
         System.out.print("Login: ");
         LoginUser = obj.scanner.nextInt();
         System.out.print("Password: ");
         PasswordUser = obj.scanner.nextInt();

         if (!(Login == LoginUser || Password == PasswordUser)) {
            System.out.println("Login or password is not correct");
            again++;
            Security = Security + 1;
         }
      }
      if (Security == 3) {
         System.out.println("You've tried to log in to your account too many times, are you an intruder!?");
      } else {
         System.out.println("Welcome User" + Login + "\r\n" + //
               "You've successfully logged in to your account.");
      }
   }
}
