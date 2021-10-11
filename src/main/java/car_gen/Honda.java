package car_gen;


public class Honda extends Car {
    private boolean isTurboCharged;

    public Honda(String color, int year, int maxSpeed, boolean isElectric, boolean isTurboCharged) {
        super(color, year, maxSpeed, isElectric);
        this.isTurboCharged = isTurboCharged;
    }

    public boolean isTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        isTurboCharged = turboCharged;
    }
}

