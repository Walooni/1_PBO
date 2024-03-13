package Praktikum_3_tugas_tambahan;

import java.util.Scanner;

public class UserRegistration {
  public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner1.nextLine();
    UserInputValidator.validateUsername(username);

    System.out.print("Enter email address: ");
    String email = scanner1.nextLine();
    UserInputValidator.validateEmail(email);

    System.out.print("Enter age: ");
    int age = scanner1.nextInt();
    UserInputValidator.validateAge(age);

    System.out.println("User registration successful!");
  }
}
