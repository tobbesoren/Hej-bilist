public class MilitaryTank extends Vehicle{
    public MilitaryTank () {

        super();
        this.setToGo(2000);
        this.setAgeLimit(25);
        this.setDriveDistance(5);
        this.setVehicleType("Tank");

        System.out.println("Tank created. " + this.getToGo() + " miles to go!");
    }

}
