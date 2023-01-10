package be.technifutur.stageplongee.controlers;

import java.util.ArrayList;
import java.util.List;

import be.technifutur.stageplongee.models.Activite;
import be.technifutur.stageplongee.models.ClasseHoraireStageModel;
import be.technifutur.stageplongee.models.ClassePersonne;
import be.technifutur.stageplongee.models.Personne;

public class PersonneControler {
    private Input input = new ScannerInput();
    private  ClassePersonne personnes ;
    private  ClasseHoraireStageModel stage ;
    public MenusControler s = new MenusControler();

    public PersonneControler( ClassePersonne personnes, ClasseHoraireStageModel stage){
        this.personnes = personnes;
        this.stage = stage;
    }

    public PersonneControler( ){
    }
    public void setPersonneControler( ClassePersonne personnes, ClasseHoraireStageModel stage){
        this.personnes = personnes;
        this.stage = stage;
    }

    public void menuAfficherPersonne()    {
        String message = "Ajouter un participant (1), Afficher la liste des participants (2), Modifier un participant (3), Supprimer un particpant (4), Ajouter une activité à un participant(5),  Revenir au menu précédent (q)";
        String menuParticipant = input.read(message);
        while(!menuParticipant.equalsIgnoreCase("q")){
            switch(menuParticipant){
                case "1":
                menuEntrerUnParticipant();
                break;
                case "2": 
                System.out.println("Voici les participant");
                listerLesParticipants();
                case "3":
                String index = input.read("Sélectionnez le numéro du participant à modifier");
                listerLesParticipants(); 
                List<String> data = createParticipant();
                personnes.updtatePersonne(Integer.parseInt(index), data.get(0), data.get(1), data.get(2), personnes.getActiviteByIndex(0));
                case "4": 
                String supprimer = input.read("Selectionnez le numéro de le participant à supprimer");
                listerLesParticipants();
                personnes.deletePersonne(Integer.parseInt(supprimer));
                case "5": addActvite(stage);
            }
            menuParticipant = input.read(message);

        }
    }
    public void menuEntrerUnParticipant() {
        List<String> data = createParticipant();
         personnes.addPersonne(data.get(0), data.get(1), data.get(2));
         for(Personne p : personnes){
             System.out.println(p);
         };
}
public void listerLesParticipants(){
    int indexListe = 0;
    for(Personne p : personnes){
        System.out.println(indexListe++ + " " +  p);
    }
}

public List<String> createParticipant(){
    List<String> data = new ArrayList<>();
            data.add(input.read("Entrez le nom du participant: "));
            data.add(input.read("Entrez le prénom du participant: "));
            data.add(input.read("Entrez le club du participant: "));
            return data;
}
public void addActvite(ClasseHoraireStageModel stage){
    int indexAddActivite = 0;
    for(Activite s : stage){
        System.out.println(indexAddActivite++ + " " + s);
    }
    String indexActivite = input.read("Sélectionnez l'activité à ajouter au participant");
    Activite activite =  stage.getActiviteByIndex(Integer.parseInt(indexActivite));
    String indexParticipant = input.read("Sélectionnez le participant");
    personnes.addActivite(Integer.parseInt(indexParticipant), activite);

}
}
