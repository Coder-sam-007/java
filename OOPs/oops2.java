
class account {
  public String name;
  protected String email;
  private String password;

  // since we can't directly access the private stuff we need getters and setters

  public void setPassword(String p) {
    password = p;
  }

  public String getPassword() {
    return password;
  }
}

public class oops2 {

  public static void main(String[] args) {

    account foo = new account();

    foo.setPassword("The zain");
    System.out.print("The password is: " + foo.getPassword());

  }
}
