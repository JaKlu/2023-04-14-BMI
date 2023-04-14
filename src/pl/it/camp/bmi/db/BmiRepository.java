package pl.it.camp.bmi.db;

import pl.it.camp.bmi.model.BMI;

public class BmiRepository {
    BMI[] bmi;

    public BmiRepository() {
        this.bmi = new BMI[100];
    }

    public void addBmiResult(int id, double weight, double height) {
        this.bmi[id] = new BMI(id, weight, height);
    }

    public void exportBmiResult(int id) {
        if (bmi[id] == null) {
            System.out.println("Brak pomiaru");
        } else {
            System.out.println(bmi[id].getResult());
        }
    }
}
