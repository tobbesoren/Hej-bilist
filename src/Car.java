public class Car implements Vehicle {

    private Driver driver;
    private int toGo;
    private final int driveDistance;
    private final int ageLimit;


    public Car () {

        this.toGo = 100;
        this.ageLimit = 18;
        this.driveDistance = 10;

        System.out.println("Car created. " + this.getToGo() + " miles to go!");
    }

    public int getToGo() {
        return toGo;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getDriveDistance() {
        return driveDistance;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setDriver(Driver driver) {

        if(driver.getAge() >= ageLimit) {
            this.driver = driver;
            System.out.println("Driver changed to " + driver.getName());
        } else {
            System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() + ", but must be "
                    + ageLimit + " or older to drive car");
        }
    }

    public void drive () {
        if (this.driver == null) {
            System.out.println("Car didn’t drive - there’s no driver!");
            return;
        }
        if (toGo - driveDistance >= 0) {
            toGo -= driveDistance;
            System.out.println("Car drove " + driveDistance + " miles - " + toGo + " miles to go");
        } else {
            System.out.println("Car won't drive any longer");
        }
    }
}
