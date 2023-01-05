package be.technifutur.stageplongee.models;

import java.time.LocalDateTime;

public interface HoraireStageModel extends Iterable<Activite> {
    boolean addActivite(int year, int month, int day, int hour, int minute, int dureeheure, int dureeminute, String nom);
    void deleteActivite(int index);
    void updtateActivite(int index, int year, int month, int day, int hour, int minute, int dureeheure,
    int dureeminute, String nom);
    boolean isActiviteValid(LocalDateTime debut, LocalDateTime fin);
    String getActiviteByIndex(int index);
}