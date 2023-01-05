package be.technifutur.stageplongee.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;


public class ClasseHoraireStageModel implements HoraireStageModel{
    private List<Activite> activityMap = new ArrayList<>();
    //Transformer en ArrayList

    @Override
    public Iterator<Activite> iterator() {

        return activityMap.iterator();
    }

    @Override
    public boolean addActivite(int year, int month, int day, int hour, int minute, int dureeheure, int dureeminute,
            String nom) {
            Activite activite = new Activite();
            LocalDateTime debut = LocalDateTime.of(year, month, day, hour, minute);
            activite.setNom(nom);
            activite.setHeureDebut(debut);
            activite.setFin(debut.plusHours(dureeheure));
            activite.setFin(debut.plusMinutes(dureeminute));
            this.activityMap.add(activite);

        return true;
    }

    @Override
    public void deleteActivite(int index) {
        this.activityMap.remove(index);
        
    }

    @Override
    public void updtateActivite(int index, int year, int month, int day, int hour, int minute, int dureeheure,
            int dureeminute, String nom) {
        Activite activite = new Activite();
        LocalDateTime debut = LocalDateTime.of(year, month, day, hour, minute);
        activite.setNom(nom);
        activite.setHeureDebut(debut);
        activite.setFin(debut.plusHours(dureeheure));
        activite.setFin(debut.plusHours(dureeheure));
        if(isActiviteValid(debut, activite.getFin())){
            this.activityMap.remove(index);
            this.activityMap.add(activite);
        } else {
            System.out.println("Date invalide");
        }
        
    }

    @Override
    public boolean isActiviteValid(LocalDateTime debut, LocalDateTime fin) {
        boolean isValid = false;
        if(debut.isAfter(LocalDateTime.now()) && fin.isAfter(debut)){
            isValid = true;
        }
        return isValid;
    }

    @Override
    public String getActiviteByIndex(int index) {
        return  this.activityMap.get(index).toString();
    }
    
    // public List<Activite> getListActivity() {
    //     return new ArrayList<>(activityMap.);  
    // }
    
    public static void main(String[] args) {
        ClasseHoraireStageModel test1 = new ClasseHoraireStageModel();
        test1.addActivite(2023, 1, 12, 12, 12, 0, 30, "toto");
        test1.addActivite(2023, 1, 12, 17, 12, 0, 30, "toto1");
        test1.addActivite(2023, 1, 12, 20, 12, 0, 30, "dede");
        test1.addActivite(2023, 1, 12, 7, 12, 0, 30, "hello");

        //List<Activite> maliste = test1.getListActivity();
        int index= 1;
        for(Activite a : test1){
        
            System.out.println(index++ + " : " + a);
        }
        System.out.println("------------------------");
        for(Activite a : test1){
            System.out.println(a);
        }
        test1.deleteActivite(0);
        System.out.println("----------------------------------------");
        for(Activite a : test1){
            System.out.println(a);
        }
        System.out.println("----------------------");
        test1.updtateActivite(1, 2023, 10, 1, 0, 0, 25, 1, "dodo");
        for(Activite a : test1){
            System.out.println(a);
        }
        System.out.println("-------------------------");
        System.out.println(test1.getActiviteByIndex(1)); 
        System.out.println("------------------");
        test1.deleteActivite(1);
        for(Activite a : test1){
            System.out.println(a);
        }
       test1.updtateActivite(1, 2023, 1, 10, 5, 50, 1, 30, "Stage1");
       System.out.println("--------------------");
       for(Activite a : test1){
        System.out.println(a);
       }
    }


}
