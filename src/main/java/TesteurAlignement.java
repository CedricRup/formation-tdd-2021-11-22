
public class TesteurAlignement {

    public static CouleurAlignement testerGrille(Grille grille) {

        if (grille.statutCase(0, 0) == StatutCase.ROUGE) {
            return CouleurAlignement.ROUGE;
        }

        return CouleurAlignement.AUCUN;
    }

}
