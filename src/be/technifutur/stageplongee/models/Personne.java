package be.technifutur.stageplongee.models;

import java.util.ArrayList;
import java.util.List;

public class Personne {
    private String nom;
    private String prenom;
    private String club;
    private List<Activite> activites; 

    public String getNom(){
        return this.nom;
    }
    public String setNom(String nom) {
        return this.nom = nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public String setPrenom(String prenom){
        return this.prenom = prenom;
    }
    public String getClub(){
        return this.club;
    }
    public String setClub(String club){
        return this.club = club;
    }
    public List<Activite> setActivite(){
       return  this.activites = new ArrayList<>();
    }
    public List<Activite> getActivite(){
        return this.activites;
    }
    public String toString(){
        String personne = " ";
        personne = personne.format(this.nom +" "+ prenom+" " + club + activites);
        return personne;
    }
}
