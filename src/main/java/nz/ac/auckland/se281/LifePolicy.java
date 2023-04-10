package nz.ac.auckland.se281;

public class LifePolicy extends Policy {

  public LifePolicy(int sumInsured) {
    super(sumInsured);
  }

  public int basePremium(Profile user) {
    return (int) (((1.0 + (user.getAge() / 100.0)) / 100.0) * sumInsured);
  }

}