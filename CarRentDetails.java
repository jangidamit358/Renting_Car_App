import java.time.Instant;
import java.util.Date;

class CarRentDetails {
    private long id;
    private String carId;
    private String customerId;
    private Date startDate;
    private Date endDate;
    private double amountPaid;

    public CarRentDetails(String carId, String customerId, Date startDate, Date endDate, double amountPaid) {
        this.id = Instant.now().getEpochSecond();
        this.carId = carId;
        this.customerId = customerId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amountPaid = amountPaid;
    }

    public long getId() {
        return id;
    }

    public String getCarId() {
        return carId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public double getAmountPaid() {
        return amountPaid;
    }
}