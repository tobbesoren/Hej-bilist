public class Car extends Vehicle{

    public Car () {

        super();
        this.setToGo(100);
        this.setAgeLimit(18);
        this.setDriveDistance(10);
        this.setVehicleType("Car");

        System.out.println("Car created. " + this.getToGo() + " miles to go!");
    }

}
