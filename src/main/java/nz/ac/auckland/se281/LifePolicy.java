package nz.ac.auckland.se281;

public class LifePolicy extends Policy {

  public LifePolicy(int sumInsured) {
    super(sumInsured);
  }

  public int lifeBasePremium(Profile user) {
    return (1 + (user.getAge() / 100)) * sumInsured;
  }

}