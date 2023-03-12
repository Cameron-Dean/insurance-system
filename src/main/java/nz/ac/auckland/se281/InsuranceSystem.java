package nz.ac.auckland.se281;

import java.util.ArrayList;
import nz.ac.auckland.se281.Main.PolicyType;

public class InsuranceSystem {

  
  ArrayList<Profile> profiles = new ArrayList<Profile>();

  public InsuranceSystem() {
    // Only this constructor can be used (if you need to initialise fields).
  }

  public void printDatabase() {
    // check if there are any profiles
    if (profiles.isEmpty()) {
      // currently no profiles in database
      MessageCli.PRINT_DB_POLICY_COUNT.printMessage("0", "s", ".");
    } else {
      // one or more profiles so print database header
      MessageCli.PRINT_DB_POLICY_COUNT.printMessage(Integer.toString(profiles.size()), (profiles.size() == 1) ? "" : "s", ":");

      // display details of each profile
      for (int i = 0; i < profiles.size(); i++) {
        Profile profile = profiles.get(i);
        MessageCli.PRINT_DB_PROFILE_HEADER_MINIMAL.printMessage(Integer.toString(i + 1), profile.getUsername(), Integer.toString(profile.getAge()));
      }
    }
  }

  public void createNewProfile(String userName, String age) {
    // check if username string has 3 or more characters
    if (userName.length() >= 3) {
      // ensure username is title case
      String firstLetterOfUserName = userName.substring(0, 1).toUpperCase();
      String restOfUserName = userName.substring(1).toLowerCase();
      userName = firstLetterOfUserName + restOfUserName;

      int userAge = Integer.parseInt(age);

      // add profile to Profile array list
      profiles.add(new Profile(userName, userAge));

      // display success message
      MessageCli.PROFILE_CREATED.printMessage(userName, age);
    }    
  }

  public void loadProfile(String userName) {
    // TODO: Complete this method.
  }

  public void unloadProfile() {
    // TODO: Complete this method.
  }

  public void deleteProfile(String userName) {
    // TODO: Complete this method.
  }

  public void createPolicy(PolicyType type, String[] options) {
    // TODO: Complete this method.
  }
}
