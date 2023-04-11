package nz.ac.auckland.se281;

public class CarPolicy extends Policy {

  private String makeAndModel;
  private String licencePlate;
  private boolean mechWarranty;

  public CarPolicy(int sumInsured, String makeAndModel, String licencePlate, boolean mechWarranty) {
    super(sumInsured);
    this.makeAndModel = makeAndModel;
    this.licencePlate = licencePlate;
    this.mechWarranty = mechWarranty;
  }

  public int basePremium(Profile user) {
    if (user.getAge() < 25) {
      return (mechWarranty) ? (((int) (0.15 * sumInsured)) + 80) : ((int) (0.15 * sumInsured));
    }

    return (mechWarranty) ? (((int) (0.1 * sumInsured)) + 80) : ((int) (0.1 * sumInsured));
  }

  public String getMakeAndModel() {
    return makeAndModel;
  }

}