package be.technifutur.stageplongee.controlers;

import be.technifutur.stageplongee.models.ClassePersonne;

public class PersonneControler {
    private Input input = new ScannerInput();
    private  ClassePersonne personnes ;
    public MenusControler s = new MenusControler();

    public PersonneControler( ClassePersonne personnes){
        this.personnes = personnes;
    }

    public PersonneControler( ){
    }
    public void setPersonneControler( ClassePersonne personnes){
        this.personnes = personnes;
    }

}
