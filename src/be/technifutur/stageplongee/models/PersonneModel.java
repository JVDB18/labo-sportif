package be.technifutur.stageplongee.models;

public interface PersonneModel extends Iterable<Personne> {
    boolean addPersonne(String nom, String prenom, String club);
    void deletePersonne(String nom);
    void updtatePersonne(String prenom, String nom, String nouveauNom, String club);
    boolean isPersonneValid(String name, String prenom, String club);
    String getPersonneByName(String name, String prenom);
}
