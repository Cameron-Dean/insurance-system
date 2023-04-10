package nz.ac.auckland.se281;

import java.util.ArrayList;

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
  private ArrayList<Policy> policies;

  // constructor to initialise username and age
  public Profile(String username, int age) {
    this.username = username;
    this.age = age;
    this.isLoaded = false;
    this.policies = new ArrayList<>();
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

  // method to return user policies
  public ArrayList<Policy> getPolicies() {
    return this.policies;
  }

  // method to change whether profile is loaded
  public void toggleLoaded() {
    this.isLoaded = !this.isLoaded;
  }

  // method to add policy to policies ArrayList
  public void addPolicy(Policy policy) {
    this.policies.add(policy);
  }

}