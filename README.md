# labo-sportif

## Doc models et Classes

### 1. Activités
#### 1.1 Activite.java
-> Permet de créer une activité selon ses variables et méthodes
#### 1.2 HoraireStageModel
-> Interface définissant les méthodes que doivent implémenter la classe ClasseHoraireModel
#### 1.3 ClasseHoraireModel
-> CRUD des activités lié aux horaires

### 2. Personnes
#### 2.1 Personne.java
-> Permet de créer une personne selon les variables et méthodes qu'elles comportent.
#### 2.2 PersonneModel
-> Interface définissant les méthodes que doivent implémenter la classe ClassePersonne
#### 2.3 ClassePersonne
-> CRUD des personnes liées aux activités

## Controllers
#### 1. Input et ScannerInput
-> Permettent de faciliter la saisie dans l'ensemble des controllers avec la méthode read();
#### 2. MenusControllers
-> Crée, affiche et appelle l'ensemble des menus du programme selon le choix de l'utilisateur
#### 3. HoraireStageControllers
-> Permet à l 'utilisateur d'entrer les données et de créer des horaires, les mettre à jour, les supprimer.
#### 4. PersonneControllers
-> Permet à l 'utilisateur d'entrer les données nécessaires à la création de participants, les mettre à  jour, les supprimer, leur attribuer une activité.

## Question ? 
-> Théorie objet lacunaire mais quelques déclics avec la construction du projet, le projet respecte t il la POO ? 