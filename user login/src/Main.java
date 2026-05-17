import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        String storedUsername = "user 1";
        String storePassword = "user 1";
        System.out.println("=========Login===========");
        System.out.println("enter username");
         String username = sc.nextLine();
        System.out.println("enter password");
        String password = sc.nextLine();

            if (username.equals(storedUsername) && password.equals(storePassword)){
                System.out.println("Welcome" + " " + username);
            } else {
                System.out.println("Incorrect Password or Username");
            }
        }
}