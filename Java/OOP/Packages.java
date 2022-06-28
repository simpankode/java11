package OOP;

import java.util.Scanner;

public class Packages {

    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in);) {
            System.out.print("Enter Username: ");
            String name = input.nextLine();
            System.out.println("Username: " + name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
