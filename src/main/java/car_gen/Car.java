package car_gen;

public class Car {
    private String color;
    private int year;
    private int speed;
    private int maxSpeed;
    private boolean isElectric;


    public Car(String color, int year, int maxSpeed, boolean isElectric) {
        this.color = color;
        this.year = year;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public int accelerateSpeed() {
        int newSpeed = speed + 5;
        if (newSpeed > maxSpeed) {
            speed = maxSpeed;
        } else {
            speed = newSpeed;
        }
        return speed ;
    }

    public int decelerateSpeed() {
        int newSpeed = speed - 5;
        if (newSpeed < 0) {
            speed = 0;
        } else {
            speed = newSpeed;
        }
        return speed;
    }

    public boolean convertToElectric() {
        if (isElectric) {
            System.out.println("Car is already electric");
        } else {
            isElectric = true;
        }
        return isElectric;
    }
}