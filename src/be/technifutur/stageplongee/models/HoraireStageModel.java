package be.technifutur.stageplongee.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public interface HoraireStageModel {
    Activite setActivite(Activite activite, int year, int month, int day, int hour, int minute, int dureeheure, int dureeminute, String nom);

    String getActivite(List<Activite> liste, int index);

    void deleteActivite(List<Activite> liste, int index);
    void updtateActivite(List<Activite> liste, int index, int year, int month, int day, int hour, int minute, int dureeheure, int dureeminute, String nom);
    boolean isActiviteValid(LocalDateTime debut, LocalDateTime fin);
    ArrayList<Activite> setListActivite(ArrayList<Activite> liste, Activite activite);
}