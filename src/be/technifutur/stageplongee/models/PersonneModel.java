package be.technifutur.stageplongee.models;

import java.time.LocalDateTime;
import java.util.List;

public interface PersonneModel extends Iterable<Personne> {
    boolean addPersonne(String nom, String prenom, String club);
    void deletePersonne(int index);
    void updtatePersonne(int index, String prenom, String nom, String nouveauNom, String club);
    boolean isPersonneValid(String name, String prenom, String club);
    String getPersonneByName(String name, String prenom);
    boolean addActivite(int index, int year, int month, int day, int hour, int minute, int dureeheure, int dureeminute, String nom);
    void deleteActivite(int index);
    void updtateActivite(int index, int year, int month, int day, int hour, int minute, int dureeheure,
    int dureeminute, String nom);
    boolean isActiviteValid(LocalDateTime debut, LocalDateTime fin);
    String getActiviteByIndex(int index);
}
