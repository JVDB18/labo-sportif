package be.technifutur.stageplongee.controlers;

public class MenusControler {
    private Input input = new ScannerInput();
    private HoraireStageController horaire; 
    public MenusControler( HoraireStageController horaire){
        this.horaire = horaire;
    }

    public MenusControler( ){
    }
    public void setMenusControler(HoraireStageController horaire){
        this.horaire = horaire;
    }

    public void menuPrincipal(){
        String message = "Sélectionnez une action: \"Horaire(1)\", \"Inscrits(2)\", \"Nouveau Participant(3)\",\"Ajouter un stage(4)\", \"Inscrire un participant à une activité(5)\" quittez (q)";
        String request = input.read(message);
        while(!request.equalsIgnoreCase("q")){
            switch(request){
                // case statements
                // values must be of same type of expression
                case "1" :
                    // Statements
                    System.out.println("Vous avez choisi l'option 1");
                    horaire.menuAfficherHoraire();
                    
                    break; // break is optional
                
                    // We can have any number of case statements
                    // below is default statement, used when none of the cases is true. 
                    // No break is needed in the default case.
                default : 
                    System.out.println("proutdefault");
                        // Statements
            }
            request = input.read(message);
        }
    }
    public void start(){
        menuPrincipal();
    }
}
