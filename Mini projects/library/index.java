
import java.time.LocalDate;

class index {
  public static void main(String[] args) {
    user youngUser = new user();

    youngUser.name = "Sameer jain";
    youngUser.birthDay = LocalDate.parse("2003-01-24");

    System.out.printf("%s was born in %s and he is now %d years old", youngUser.name, youngUser.birthDay.toString(),
        youngUser.age());
  }
}