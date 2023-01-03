package be.technifutur.stageplongee.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonneActivite {    
    List<Activite> activites;
    Personne personne;

    void setPersonne(Personne personne){
        this.personne = personne;
    }
    Personne getPersonne(){
        return this.personne;
    }
    void setActivite(Activite activite){
        this.activites.add(activite);
    }
    List<Activite> getListActivite(){
        return this.activites;
    }
    public String toString(){
        String[] strarray = (String[]) activites.toArray();   
       return personne.getNom() + Arrays.toString(strarray);
    }
}
