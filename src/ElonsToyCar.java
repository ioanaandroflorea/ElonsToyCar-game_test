public class ElonsToyCar {

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
    int batteryPercentage;
    int distanceDriven;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public ElonsToyCar(){
        this.batteryPercentage = 100;
        this.distanceDriven = 0;
    }

    public String distanceDisplay() {
        return "Driven " + this.distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (this.batteryPercentage == 0){
            return "Battery empty";
        }
        return "Battery at " + this.batteryPercentage + "%";
    }

    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage--;
        }
    }
}