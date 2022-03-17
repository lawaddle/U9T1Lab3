public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck()
  {
    System.out.println("License Plate: " + getLicensePlate() + " \nToll Fee: " + getTollFee() + " \nPassengers: " + getPassengers() + " \n# of Axels: " + axles + " \nTrailer: " + hasTrailer);
  }

  public boolean validateLicensePlate()
  {
    String last2 = getLicensePlate().substring(getLicensePlate().length()-2);
    if(!hasTrailer)
    {
      return true;
    } else if(hasTrailer && axles > 4 && last2.equals("MX"))
    {
      return true;
    } else if (hasTrailer && axles <= 4 && last2.equals("LX"))
    {
      return true;
    } else
    {
      return false;
    }
  }

}