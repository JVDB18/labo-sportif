package be.technifutur.stageplongee.models;
import java.time.LocalDateTime;

public class Activite {
    private String nomActivite;
    private LocalDateTime debut;
    private LocalDateTime fin;

    public String getNom(){
        return this.nomActivite;
    }
    public String setNom(String nom) {
        return this.nomActivite = nom;
    }
    public LocalDateTime getHeureDebut(){
        return this.debut;
    }
    public LocalDateTime setHeureDebut(LocalDateTime debut){
        return this.debut = debut;
    }
    public LocalDateTime getFin(){
        return this.fin;
    }
    public LocalDateTime setFin(LocalDateTime fin){
        return this.fin = fin;
    }
}
