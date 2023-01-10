package be.technifutur;

import be.technifutur.stageplongee.controlers.HoraireStageController;
import be.technifutur.stageplongee.controlers.MenusControler;
import be.technifutur.stageplongee.controlers.PersonneControler;
import be.technifutur.stageplongee.models.ClasseHoraireStageModel;
import be.technifutur.stageplongee.models.ClassePersonne;

public class Main {
    public static void main(String[] args) {
        ClasseHoraireStageModel stageListe = new ClasseHoraireStageModel();
        HoraireStageController ctrl = new HoraireStageController(stageListe);
        ClassePersonne personne = new ClassePersonne();
        PersonneControler ctrlpersonne = new PersonneControler(personne, stageListe);
        MenusControler menu = new MenusControler(ctrl, ctrlpersonne);
        menu.start();
    }
}
