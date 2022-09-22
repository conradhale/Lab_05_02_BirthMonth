public class Main {
  public static void main(String[] args) {
    System.out.println("Enter your birth month: ");
    int birthMonth = 5;
    if (birthMonth >= 1 && birthMonth <= 12) {
      System.out.println("Your birth month is: " + birthMonth);
    } else {
      System.out.println("You entered an incorrect month value: " + birthMonth);
    }
  }
}