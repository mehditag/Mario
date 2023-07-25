public class ChampignonRouge {
    static int nbChampignonRouge;
    String couleur;
    boolean estAttrape;

    ChampignonRouge(){
        if (this.nbChampignonRouge>=2){
            throw new IllegalArgumentException("Trop de champignon rouge");
        }
        else{
            this.couleur="Rouge";
            this.estAttrape=false;
            this.nbChampignonRouge++;
        }
    }



}