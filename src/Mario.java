public class Mario {
    static int nbVie;
    int taille;
    boolean estInvincible;
    int nbPiece;

    Mario(){
        this.taille=1;
        this.estInvincible=false;
        this.nbPiece=0;
    }

    public void mangerChampignonVert(ChampignonVert cv){
        this.nbVie++;
        cv.estAttrape=true;
        System.out.println("Mario gagne 1 vie grâce à un champignon vert");
    }

    public void mangerChampignonRouge(ChampignonRouge cr){
        this.taille++;
        cr.estAttrape=true;
        System.out.println("Mario devient grand grâce à un champignon rouge");
    }

    public void attraperPiece(PieceDoree piece){
        this.nbPiece++;
        piece.estAttrape=true;
        System.out.println("Mario attrape une pièce");
        if (this.nbPiece==100){
            System.out.println("Mario gagne 1 vie grâce à 100 pièces");
            this.nbPiece=0;
        }
    }

    public void attraperEtoile(Etoile etoile){
        this.estInvincible=true;
        etoile.estAttrape=true;
        System.out.println("Mario devient invincible grâce à une étoile");

    }



}