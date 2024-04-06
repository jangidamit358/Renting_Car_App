import java.time.Instant;
import java.util.UUID;

public class Car {

    private String id;

    private String carName;
    
    private String carNumber;

    private String type;

    private String status;

    private double charges;

    private static int count = 0;

    Car(String id, String name, String nummber, String type, double charges) {
        this.id = id;
        carName = name;
        carNumber = nummber;
        this.type = type;
        status = "available"; 
        this.charges = charges;
    }

    public String getId() {
        return id;
    }

    public String getCarName() {
        return carName;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public double getCharges() {
        return charges;
    }

    @Override
    public String toString() {
        return "id:- " +id +"  name:- " + carName + "  number:- " + carNumber + "  type:- " + type + "  status:- " + status + "  charges:- " + charges + " per day";
    }
}
