package car_gen;

public class Main {

    public static void main(String[] args) {

        Honda civic = new Honda("red", 2013, 96, true, false);
        Toyota supra = new Toyota("blue", 2013, 76, true, false);
        Lexus rx350 = new Lexus("yellow", 2013, 86, true, false);

        System.out.println(civic.getColor());
        System.out.println(supra.getColor());
        System.out.println(rx350.getColor());

    }

}