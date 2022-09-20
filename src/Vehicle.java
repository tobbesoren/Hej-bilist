abstract public class Vehicle {
    private Driver driver;
    private int toGo;
    private int driveDistance;
    private int ageLimit = 0;
    private String vehicleType = "--";

    public Driver getDriver() {
        return driver;
    }

    public int getToGo() {
        return toGo;
    }

    public void setToGo(int toGo) {
        this.toGo = toGo;
    }

    public int getDriveDistance() {
        return driveDistance;
    }

    public void setDriveDistance(int driveDistance) {
        this.driveDistance = driveDistance;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setDriver(Driver driver) {

        if(driver.getAge() >= ageLimit) {
            this.driver = driver;
            System.out.println("Driver changed to " + driver.getName());
        } else {
            System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() + ", but must be "
                    + ageLimit + " or older to drive " + this.vehicleType.toLowerCase());
        }
    }

    public void drive () {
        if (this.driver == null) {
            System.out.println(this.vehicleType + " didn’t drive - there’s no driver!");
            return;
        }
        if (toGo - driveDistance >= 0) {
            toGo -= driveDistance;
            System.out.println(this.vehicleType + " drove " + driveDistance + " miles - " + toGo + " miles to go");
        } else {
            System.out.println(this.vehicleType + " can't drive any longer");
        }


    }

}
