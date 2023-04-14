package pl.it.camp.bmi.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BMI {
    private int id;
    private double weightInKg;
    private double heightInCm;
    private double bmi;

    public BMI(int id, double weight, double heightInCm) {
        this.id = id;
        this.weightInKg = weight;
        this.heightInCm = heightInCm;
        this.bmi = round((weightInKg / ((heightInCm / 100 * heightInCm / 100))), 2);

    }

    public String getBmiDescription() {

        if (this.bmi < 16) {
            return "wygłodzenie";
        } else if (this.bmi >= 16 && this.bmi < 17) {
            return "wychudzenie";
        } else if (this.bmi >= 17 && this.bmi < 18.5) {
            return "niedowaga";
        } else if (this.bmi >= 18.5 && this.bmi < 25) {
            return "wartość prawidłowa";
        } else if (this.bmi >= 25 && this.bmi < 30) {
            return "nadwaga";
        } else if (this.bmi >= 30 && this.bmi < 35) {
            return "otyłość I stopnia";
        } else if (this.bmi >= 35 && this.bmi < 40) {
            return "otyłość II stopnia";
        } else {
            return "otyłość III stopnia";
        }
    }

    public int getId() {
        return id;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public double getHeightInCm() {
        return heightInCm;
    }

    public double getBmi() {
        return bmi;
    }

    public String getResult() {
        return "ID: " + getId() + " | Masa ciała: " + getWeightInKg() + " | Wzrost: " + getHeightInCm() +
                " | BMI: " + getBmi() + " - " + getBmiDescription();
    }




    // https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
