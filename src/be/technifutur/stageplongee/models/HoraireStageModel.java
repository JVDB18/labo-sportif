package be.technifutur.stageplongee.models;

import java.time.LocalDateTime;

public interface HoraireStageModel extends Iterable<Activite> {
    boolean addActivite(int year, int month, int day, int hour, int minute, int dureeheure, int dureeminute, String nom);
    void deleteActivite(LocalDateTime date);
    void updtateActivite(LocalDateTime date, int year, int month, int day, int hour, int minute, int dureeheure,
    int dureeminute, String nom);
    boolean isActiviteValid(LocalDateTime debut, LocalDateTime fin);
    String getActiviteByDate(LocalDateTime debut);
}