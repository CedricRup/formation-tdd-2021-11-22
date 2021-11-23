
public class TesteurAlignement {

    public static CouleurAlignement testerGrille(Grille grille) {
        for (int i = 0; i < 7 ; i++) {
            if (testerColonne(grille, StatutCase.ROUGE, i)) {
                return CouleurAlignement.ROUGE;
            }
            if (testerColonne(grille, StatutCase.JAUNE, i)) {
                return CouleurAlignement.JAUNE;
            }
        }
        return CouleurAlignement.AUCUN;
    }

    private static boolean testerColonne(Grille grille, StatutCase statutCase, int colonne) {
        for (int i = 0; i < 4; i++) {
            if (tester4CasesColonne(grille, statutCase, colonne, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean tester4CasesColonne(Grille grille, StatutCase statutCase, int colonne, int origine) {
        for (int i = origine; i < 4 + origine; i++) {
            if (grille.statutCase(colonne, i) != statutCase) {
                return false;
            }
        }
        return true;
    }

}
