public interface Vehicle {

    //I don't actually use these getters, but they may come in handy should the program be expanded...
    public int getToGo();
    public Driver getDriver();
    public int getDriveDistance();
    public int getAgeLimit();

    public void setDriver(Driver driver);
    public void drive();
}
