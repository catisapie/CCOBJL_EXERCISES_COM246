import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
  
        System.out.println("Enter your username:");

        Scanner loginScanner = new Scanner(System.in);

        String username_from_input = loginScanner.nextLine();

        System.out.println("Enter your password:");

        String password_from_input = loginScanner.nextLine();

        // Declare user object
        User me = new User(username_from_input, password_from_input);

        // Declare file object
        File myfile = new File("accounts.txt");

        // Check if file exists
        if (myfile.exists()) {
            System.out.println("File exists");
        }

        // Read file
        Scanner fileScanner = new Scanner(myfile);

        Boolean accountexists = false;
        while (fileScanner.hasNextLine()) {
            String filedata = fileScanner.nextLine();
    
            // Step 1: Check if user and password from input exists in file

            // username from accounts.txt
            String username_from_file = filedata.split(",")[0];
            
            // password from accounts.txt
            String password_from_file = filedata.split(",")[1];

            // Step2: Compare username and password from input and username and password from file
            if (username_from_input.equals(username_from_file) && password_from_input.equals(password_from_file)) {
                accountexists = true;
                break;
            }
        }

        if(accountexists){
            System.out.println("Login successful, Hello " + me.getUsername());
        }
        else{
            System.out.println("Account does not exist");
        }

        fileScanner.close();
    }
}
