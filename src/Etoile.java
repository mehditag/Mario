public class Etoile {
    static int nbEtoile;
    int taille;
    boolean estAttrape;

    Etoile(){
        if(this.nbEtoile>2){
            throw new IllegalArgumentException("Trop d'étoile") ;
        }
        else{
            this.estAttrape=false;
            this.nbEtoile++;
        }

    }




}