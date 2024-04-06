import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarRentingSystem {
 
    private static Map<String, Car> cars;

    CarRentingSystem() {
        cars = new HashMap<>();
    }

    public void addCar(String id, String name, String nummber, String type, double charges) {
        Car newCar = new Car(id, name, nummber, type, charges);
        cars.put(newCar.getId(), newCar);
    }

    public void showAvailableCar() {
        
        System.out.println("");
        System.out.println("Display all available cars");
        System.out.println("");
        for(Car car : cars.values()) {
            if(car.getStatus().equals("available"))
            System.out.println(car.toString());
        }
    }

    public boolean book(Scanner sc, String email) {

        this.showAvailableCar();

        System.out.println("");
        System.out.println("enter car id for booking ");
        String carId = sc.next();
        System.out.println("enter in days, for how many do you want? ");
        int day = sc.nextInt();
        Date date = new Date();
        boolean flag = cars.containsKey(carId);

        while(!flag) {
            System.out.println("Please enter valid carID");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        this.showAvailableCar();
        System.out.println("enter again carID");
         carId = sc.next();
        flag = cars.containsKey(carId);
        }

        RegisterCustomer registerCustomer = new RegisterCustomer();

        Car car = cars.get(carId);

        CarRentDetails carRentDetails = new CarRentDetails(carId, email, date, date, car.getCharges());

        System.out.println("Successfully booked");
        return true;
    }

}
