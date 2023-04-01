package nz.ac.auckland.se281;

public class Profile {

  // method to convert a username to title case
  public static String toTitleCase(String userName) {
    String firstLetterOfUserName = userName.substring(0, 1).toUpperCase();
    String restOfUserName = userName.substring(1).toLowerCase();
    userName = firstLetterOfUserName + restOfUserName;
    return userName;
  }

  // instance fields
  private String username;
  private int age;
  private boolean isLoaded;

  // empty constructor
  public Profile() {
    this.isLoaded = false;
  }

  // constructor to initialise username and age
  public Profile(String username, int age) {
    this.username = username;
    this.age = age;
    this.isLoaded = false;
  }

  // method to return username string
  public String getUsername() {
    return this.username;
  }

  // method to return age integer
  public int getAge() {
    return this.age;
  }

  // method to return whether profile is loaded
  public boolean isLoaded() {
    return this.isLoaded;
  }

  // method to change whether profile is loaded
  public void toggleLoaded() {
    this.isLoaded = !this.isLoaded;
  }

}