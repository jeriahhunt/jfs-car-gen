package car_gen;

public class Toyota extends Car {
    private boolean greatGasMileage;

    public Toyota(String color, int year, int maxSpeed, boolean isElectric, boolean greatGasMileage) {
        super(color, year, maxSpeed, isElectric);
        this.greatGasMileage = greatGasMileage;
    }

    public boolean isGreatGasMileage() {
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;
    }

}
