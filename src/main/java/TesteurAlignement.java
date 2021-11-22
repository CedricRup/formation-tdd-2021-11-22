
public class TesteurAlignement {

    public static CouleurAlignement testerGrille(Grille grille) {

        if (testerColonne(grille, StatutCase.ROUGE)) {
            return CouleurAlignement.ROUGE;
        }

        if (testerColonne(grille, StatutCase.JAUNE)) {
            return CouleurAlignement.JAUNE;
        }
        
        return CouleurAlignement.AUCUN;
    }

    private static boolean testerColonne(Grille grille, StatutCase statutCase) {
        return grille.statutCase(0, 3) == statutCase && grille.statutCase(0, 2) == statutCase && grille.statutCase(0, 1) == statutCase;
    }

}
