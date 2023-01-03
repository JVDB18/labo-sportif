package be.technifutur.stageplongee.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class ClassePersonne implements PersonneModel {
    SortedMap<String, Personne> listePersonne = new TreeMap<>();

    @Override
    public Iterator<Personne> iterator() {
       return this.listePersonne.values().iterator();   
    }

    @Override
    public boolean addPersonne(String nom, String prenom, String club) {
        Personne Personne = new Personne();
        Personne.setNom(nom);
        Personne.setPrenom(prenom);
        Personne.setClub(club);
        this.listePersonne.put(Personne.getNom()+" " + Personne.getPrenom(), Personne);
        return true;
    }

    @Override
    public void deletePersonne(String nomprenom) {
        this.listePersonne.remove(nomprenom);
    }

    @Override
    public void updtatePersonne(String prenom, String nomprenom, String nouveaunom, String club) {
        Personne personne = new Personne();
        personne.setNom(nouveaunom);
        personne.setPrenom(prenom);
        personne.setClub(club);
        this.listePersonne.replace(nomprenom, personne);
        
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
    public List<Personne> getListPerson() {
        return new ArrayList<>(listePersonne.values());  
    }
    public static void main(String[] args) {
        ClassePersonne test1 = new ClassePersonne();
        test1.addPersonne("Vanderbyse", "Thierry", "Les petits pédestres");
        test1.addPersonne("Vanderbyse", "Julie", "Royal Moana");
        test1.addPersonne("Anais", "Tasiaux", "Les petits pédestres");
        for(Personne p : test1){
            System.out.println(p);
        }
        System.out.println("-------------------");
        test1.updtatePersonne("Ananas", "Anais Tasiaux", "Tasiaux", "Royal Moana");
        for(Personne p : test1){
            System.out.println(p);
        }
        test1.addPersonne("Devillers", "Nicolas", "Gros nul");
        System.out.println("-----------------");
        for(Personne p : test1) {
            System.out.println(p);
        }
        System.out.println("----------------------");
        test1.deletePersonne("Devillers Nicolas");
        for(Personne p : test1){
            System.out.println(p);
        }
    }

}
