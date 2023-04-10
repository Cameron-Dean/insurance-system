package nz.ac.auckland.se281;

public class CarPolicy extends Policy {

  private String makeAndModel;
  private String licencePlate;
  private boolean mechanicalBreakdown;

  public CarPolicy(int sumInsured, String makeAndModel, String licencePlate, boolean mechanicalBreakdown) {
    super(sumInsured);
    this.makeAndModel = makeAndModel;
    this.licencePlate = licencePlate;
    this.mechanicalBreakdown = mechanicalBreakdown;
  }

  public int carBasePremium(Profile user) {
    if (user.getAge() < 25) {
      return (mechanicalBreakdown) ? (((int) 0.15 * sumInsured) + 80) : ((int) 0.15 * sumInsured);
    }

    return (mechanicalBreakdown) ? (((int) 0.1 * sumInsured) + 80) : ((int) 0.1 * sumInsured);
  }

}