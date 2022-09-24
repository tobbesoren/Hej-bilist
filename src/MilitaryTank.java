public class MilitaryTank implements Vehicle {

    private Driver driver;
    private int toGo;
    private final int driveDistance;
    private final int ageLimit;


    public MilitaryTank () {

        this.toGo = 2000;
        this.ageLimit = 25;
        this.driveDistance = 5;

        System.out.println("Tank created. " + toGo + " miles to go!");
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
                    + ageLimit + " or older to drive tank");
        }
    }

    public void drive () {
        if (this.driver == null) {
            System.out.println("Tank didn’t drive - there’s no driver!");
            return;
        }
        if (toGo - driveDistance >= 0) {
            toGo -= driveDistance;
            System.out.println("Tank drove " + driveDistance + " miles - " + toGo + " miles to go");
        } else {
            System.out.println("Tank won't drive any longer");
        }
    }
}
