package pl.it.camp.bmi.core;

import pl.it.camp.bmi.db.BmiRepository;
import pl.it.camp.bmi.gui.GUI;

public class Core {
    GUI gui = new GUI();
    BmiRepository bmiDB = new BmiRepository();
    public void start(){

        boolean run = true;
        int i = 0;

        while (run) {
            switch (gui.showMenu()) {
                case "1":
                    bmiDB.addBmiResult(i, gui.readWeight(), gui.readHeight());
                    bmiDB.exportBmiResult(i);
                    i++;
                    break;
                case "2":
                    bmiDB.exportBmiResult(gui.readBmiID());
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
