package be.technifutur.stageplongee.models;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ClasseHoraireStageModel extends Activite implements HoraireStageModel{

@Override
    public Activite setActivite(Activite activite, int year, int month, int day, int hour, int minute, int dureeheure, int dureeminute, String nom){
        LocalDateTime debut = LocalDateTime.of(year, month, day, hour, minute);
        LocalDateTime fin = debut.plusHours(dureeheure).plusMinutes(dureeminute);
        if(isActiviteValid(debut, fin)){
            activite.setHeureDebut(debut);
            activite.setFin(fin);
            activite.setNom(nom);
        } else {
            System.out.println("Exception");
        }
        return activite;
    }
    @Override
    public void updtateActivite(List<Activite> liste, int index, int year, int month, int day, int hour, int minute, int dureeheure, int dureeminute, String nom){
        Activite activite = liste.get(index);
        LocalDateTime debut = LocalDateTime.of(year, month, day, hour, minute);
        LocalDateTime fin = debut.plusHours(dureeheure).plusMinutes(dureeminute);
        if(isActiviteValid(debut, fin)){
            activite.setNom(nom);
            activite.setHeureDebut(debut);
            activite.setFin(fin);
        } else {
            System.out.println("Exception");
        }
    }

    public ArrayList<Activite> setListActivite(ArrayList<Activite> liste, Activite activite){
        liste.add(activite); 
        return liste;
    }
@Override
    public String getActivite(List<Activite> liste, int index){
        String activite = " ";
        String nom = liste.get(index).getNom();
        LocalDateTime debut = liste.get(index).getHeureDebut();
        LocalDateTime fin = liste.get(index).getFin();
        activite = activite.format(nom +" "+ debut.toString()+" " + fin.toString());

        return activite;
    }
@Override
    public void deleteActivite(List<Activite> liste, int index){
        liste.remove(index);
    }
@Override
    public boolean isActiviteValid(LocalDateTime debut, LocalDateTime fin){
        boolean isValid = false;
        if(debut.isAfter(LocalDateTime.now()) && fin.isAfter(debut)){
            isValid = true;
        }
        return isValid;
    }
    public static void main(String[] args) {
      ClasseHoraireStageModel test1 = new ClasseHoraireStageModel();
       Activite test = new Activite();
       Activite test2 = new Activite();
       Activite test3 = new Activite();
       ArrayList<Activite> liste = new ArrayList<Activite>();
       test1.setActivite(test,2022, 12, 30, 10, 30, 1, 0, "poseidon");
       test1.setActivite(test2,2022, 12, 30, 10, 30,1, 0, "poseidon2");
       test1.setActivite(test3,2022, 12, 30, 10, 30, 1, 0, "poseidon3");
       test1.setListActivite(liste, test);
       test1.setListActivite(liste, test2);
       test1.setListActivite(liste, test3);
       System.out.println(test1.getActivite(liste, 0));
          for(Activite l : liste){
           System.out.println(l.getNom() + " " + l.getHeureDebut() + " "+l.getFin() );
          }
       test1.deleteActivite(liste, 0);
       test1.updtateActivite(liste, 1, 2023, 1, 1, 10, 30, 2, 30, "prout");
       System.out.println("------------------------");
       for(Activite l : liste){
        System.out.println(l.getNom() + " " + l.getHeureDebut() + " "+l.getFin() );
       }
       
    }
}
