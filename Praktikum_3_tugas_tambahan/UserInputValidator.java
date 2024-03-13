package Praktikum_3_tugas_tambahan;

public class UserInputValidator {

    public static void validateUsername(String username) {
      // panjang karakter
      assert username.length() >= 5 && username.length() <= 20 : "panjang username harus antara 5 hingga 20 karakter.";
      // karakter pertama huruf
      assert Character.isLetter(username.charAt(0)) : "karakter pertama harus berupa huruf";
      // karakter valid
      assert username.matches("[A-Za-z0-9_]+") : "Username hanya boleh berisi huruf, angka, dan underscore";
    }
  
    public static void validateEmail(String email) {
      // Regular expression untuk memvalidasi format email
      String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}";
      assert email.matches(emailRegex) : "Invalid email";
    }
  
    public static void validateAge(int age) {
      // rentang usia
      assert age >= 17 && age <= 99 : "umur minimal 17 dan maksimal 99";
    }
  }