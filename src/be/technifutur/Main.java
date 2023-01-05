package be.technifutur;

import be.technifutur.stageplongee.controlers.HoraireStageController;
import be.technifutur.stageplongee.controlers.MenusControler;
import be.technifutur.stageplongee.models.ClasseHoraireStageModel;

public class Main {
    public static void main(String[] args) {
        ClasseHoraireStageModel stageListe = new ClasseHoraireStageModel();
        HoraireStageController ctrl = new HoraireStageController(stageListe);
        MenusControler menu = new MenusControler(ctrl);
        menu.start();
    }
}
