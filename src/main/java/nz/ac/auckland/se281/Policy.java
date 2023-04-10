package nz.ac.auckland.se281;

public abstract class Policy {

  protected int sumInsured;

  public Policy(int sumInsured) {
    this.sumInsured = sumInsured;
  }

  public String getSumInsuredString() {
    return Integer.toString(sumInsured);
  }
}