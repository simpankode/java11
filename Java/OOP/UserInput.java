package OOP;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        
        //create scanner object
        try (Scanner username = new Scanner(System.in);){
            System.out.println("Enter Username: ");
            String userName = username.nextLine();
            System.out.println("Username: " + userName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
