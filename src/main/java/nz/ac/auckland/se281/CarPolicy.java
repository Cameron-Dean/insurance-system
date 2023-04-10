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

}