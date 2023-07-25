public class ChampignonVert {
    static int nbChampignonVert;
    String couleur;
    boolean estAttrape;

    ChampignonVert(){
        if(nbChampignonVert>=1){
            throw new IllegalArgumentException("Trop de champignon vert");
        }
        else{
            this.couleur="Vert";
            this.estAttrape=false;
            this.nbChampignonVert++;
            System.out.println("Nbre de ChampignonVert="+this.nbChampignonVert);
        }
    }
}

