public interface Vehicle {

    public int getToGo();
    public Driver getDriver();
    public int getDriveDistance();


    public int getAgeLimit();
    public void setDriver(Driver driver);
    public void drive();
}
