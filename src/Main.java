public class Main {

    public static void main(String[] args) {
        Mario mario=new Mario();

        ChampignonVert cv = new ChampignonVert();
        ChampignonRouge cr = new ChampignonRouge();

        Etoile etoile=new Etoile();
        PieceDoree piece = new PieceDoree();

        mario.attraperEtoile(etoile);

        for (int i=0;i<120;i++){
            mario.attraperPiece(piece);
        }

        mario.mangerChampignonRouge(cr);
        try {
            ChampignonVert cr2=new ChampignonVert();
        }catch (IllegalArgumentException e){
            System.out.println("Impossible de créer un deuxième champignon vert");
        }
    }

}