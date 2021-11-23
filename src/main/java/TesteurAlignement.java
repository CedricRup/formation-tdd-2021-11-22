
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
        for (int i = 0; i < 4; i++) {
            if (tester4CasesColonne(grille, statutCase, i)) {
                return true;
            }
        }
        if (tester4CasesColonne(grille, statutCase, 0)) {
            return true;
        }
        return false;
    }

    private static boolean tester4CasesColonne(Grille grille, StatutCase statutCase, int origine) {
        for (int i = origine; i < 4 + origine; i++) {
            if (grille.statutCase(0, i) != statutCase) {
                return false;
            }
        }
        return true;
    }

}
