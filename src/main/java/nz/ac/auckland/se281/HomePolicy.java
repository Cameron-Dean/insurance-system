package nz.ac.auckland.se281;

public class HomePolicy extends Policy {

  private String address;
  private boolean rental;

  public HomePolicy(int sumInsured, String address, boolean rental) {
    super(sumInsured);
    this.address = address;
    this.rental = rental;
  }

  public int homeBasePremium() {
    return (rental) ? (int) 0.02 * sumInsured : (int) 0.01 * sumInsured;
  }

}