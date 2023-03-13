package nz.ac.auckland.se281;

public class Profile {
  private String username;
  private int age;

  // empty constructor
  public Profile() {
  }

  // constructor to initialise username and age
  public Profile(String username, int age) {
    this.username = username;
    this.age = age;
  }

  // method to return username string
  public String getUsername() {
    return this.username;
  }

  // method to return age integer
  public int getAge() {
    return this.age;
  }
}