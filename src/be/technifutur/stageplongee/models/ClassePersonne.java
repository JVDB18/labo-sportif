package be.technifutur.stageplongee.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class ClassePersonne implements PersonneModel {
    List<Personne> listePersonne = new ArrayList<>();



    @Override
    public void deleteActivite(int index) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updtateActivite(int index, int year, int month, int day, int hour, int minute, int dureeheure,
            int dureeminute, String nom) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isActiviteValid(LocalDateTime debut, LocalDateTime fin) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getActiviteByIndex(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<Personne> iterator() {
       return this.listePersonne.iterator();   
    }

    @Override
    public boolean addPersonne(String nom, String prenom, String club) {
        Personne Personne = new Personne();
        Personne.setNom(nom);
        Personne.setPrenom(prenom);
        Personne.setClub(club);
        this.listePersonne.add(Personne);

        return true;
    }
    @Override
    public boolean addActivite(int index, Activite activite) {
        this.listePersonne.get(index).setActivite().add(activite);
        return true;
    }

    @Override
    public void deletePersonne(int index) {
        this.listePersonne.remove(index);
    }

    @Override
    public void updtatePersonne(int index, String prenom, String nomprenom, String nouveaunom, String club) {
        Personne personne = new Personne();
        personne.setNom(nouveaunom);
        personne.setPrenom(prenom);
        personne.setClub(club);
        this.listePersonne.remove(index);
        this.listePersonne.add(index, personne);
        
    }
    public Personne getPersonneById(int index){
        return this.listePersonne.get(index);
    }

    @Override
    public boolean isPersonneValid(String name, String prenom, String club) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getPersonneByName(String name, String prenom) {
        // TODO Auto-generated method stub
        return null;
    }
    // public List<Personne> getListPerson() {
    //     return new ArrayList<>(listePersonne.values());  
    // }



}
