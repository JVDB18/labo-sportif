package be.technifutur.stageplongee.controlers;

import be.technifutur.stageplongee.models.ClasseHoraireStageModel;

import java.util.ArrayList;
import java.util.List;

import be.technifutur.stageplongee.models.Activite;

public class HoraireStageController{
    private Input input = new ScannerInput();
    private  ClasseHoraireStageModel stage ;
    public MenusControler s = new MenusControler();

    public HoraireStageController( ClasseHoraireStageModel stage){
        this.stage = stage;
    }

    public HoraireStageController( ){
    }
    public void setClasseHoraireStageModel( ClasseHoraireStageModel stage){
        this.stage = stage;
    }

    public void menuAfficherHoraire()    {
        String message = "Ajouter un stage (1), Afficher les stages (2), Modifier un horaire (3), Supprimer un horaire (4), Revenir au menu précédent (q)";
        String menuHoraire = input.read(message);
        while(!menuHoraire.equalsIgnoreCase("q")){
            switch(menuHoraire){
                case "1":
                menuEntrerUnHoraire();
                break;
                case "2": 
                System.out.println("Voici les horaires");
                listerLesHoraire();
                case "3":
                String index = input.read("Sélectionnez le numéro de l'horaire à modifier");
                listerLesHoraire(); 
                List<String> data = createActivite();
                stage.updtateActivite(Integer.parseInt(index), Integer.parseInt(data.get(0)), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), Integer.parseInt(data.get(3)), Integer.parseInt(data.get(4)), 0, Integer.parseInt(data.get(5)),data.get(6));
                case "4": 
                String supprimer = input.read("Selectionnez le numéro de l'horaire à supprimer");
                listerLesHoraire();
                stage.deleteActivite(Integer.parseInt(supprimer));
            }
            menuHoraire = input.read(message);

        }
    }
    public void menuEntrerUnHoraire() {
            List<String> data = createActivite();
             stage.addActivite(Integer.parseInt(data.get(0)), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), Integer.parseInt(data.get(3)), Integer.parseInt(data.get(4)), 0, Integer.parseInt(data.get(5)),data.get(6));
             for(Activite a : stage){
                 System.out.println(a);
             };
    }
    public void listerLesHoraire(){
        int index = 0;
        for(Activite a : stage){
            System.out.println(index++ + " " +  a);
        }
    }

    public List<String> createActivite(){
        List<String> data = new ArrayList<>();
                data.add(input.read("Entrez l'année: "));
                data.add(input.read("Entrez le mois: "));
                data.add(input.read("Entrez le jour: "));
                data.add(input.read("Entrez l'heure de debut: "));
                data.add(input.read("Entrez la minute: "));
                data.add(input.read("Entrez la durée en minute: "));
                data.add(input.read("entrez le nom de l'activité: "));
                return data;
    }


}