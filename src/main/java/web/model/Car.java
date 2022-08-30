package web.model;

public class Car {
    private String model;
    private String color;
    private long carId;

    public Car(String model, String color, long carId) {
        this.model = model;
        this.color = color;
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }
}
