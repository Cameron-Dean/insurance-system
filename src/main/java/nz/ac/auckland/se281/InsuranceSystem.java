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
      MessageCli.PRINT_DB_POLICY_COUNT.printMessage(
          Integer.toString(profiles.size()),
          (profiles.size() == 1) ? "" : "s", ":");

      // display details of each profile
      for (int i = 0; i < profiles.size(); i++) {
        Profile profile = profiles.get(i);
        MessageCli.PRINT_DB_PROFILE_HEADER_SHORT.printMessage(
            (profile.isLoaded()) ? "*** " : "",
            Integer.toString(i + 1),
            profile.getUsername(),
            Integer.toString(profile.getAge()));
      }
    }
  }

  public void createNewProfile(String userName, String age) {
    // ensure username is title case
    userName = Profile.toTitleCase(userName);

    // check if username string has 3 or more characters
    if (userName.length() >= 3) {
      // check if the same username already exists
      boolean profileAlreadyExists = false;

      for (Profile profile : profiles) {
        if (profile.getUsername().equals(userName)) {
          // exact username match found so display error message and skip adding profile
          profileAlreadyExists = true;
          MessageCli.INVALID_USERNAME_NOT_UNIQUE.printMessage(userName);
          break;
        }
      }

      if (!profileAlreadyExists) {
        // convert string to int
        int userAge = 0;
        try {
          userAge = Integer.parseInt(age);
        } catch (NumberFormatException ex) {
          // exception handled below
        }

        // check if age is a positive integer
        if (userAge > 0) {
          // add profile to Profile array list
          profiles.add(new Profile(userName, userAge));

          // display success message
          MessageCli.PROFILE_CREATED.printMessage(userName, age);
        } else {
          // display error message for age
          MessageCli.INVALID_AGE.printMessage(age, userName);
        }
      }
    } else {
      // display error message informing user the username is not 3 or more characters
      MessageCli.INVALID_USERNAME_TOO_SHORT.printMessage(userName);
    }
  }

  public void loadProfile(String userName) {
    // ensure username is title case
    userName = Profile.toTitleCase(userName);

    // get current profile
    Profile currentProfile = null;

    for (Profile profile : profiles) {
      if (profile.getUsername().equals(userName)) {
        currentProfile = profile;
      }
    }

    if (currentProfile == null) {
      // no profile found
      MessageCli.NO_PROFILE_FOUND_TO_LOAD.printMessage(userName);
      return;
    }

    // check if another profile is loaded
    for (Profile profile : profiles) {
      if (profile.isLoaded()) {
        // unload currently loaded profile
        profile.toggleLoaded();
        MessageCli.PROFILE_UNLOADED.printMessage(profile.getUsername());
      }
    }

    // load profile
    if (!currentProfile.isLoaded()) {
      currentProfile.toggleLoaded();
      MessageCli.PROFILE_LOADED.printMessage(userName);
    }
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
