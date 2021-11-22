
public class TesteurAlignement {

    public static CouleurAlignement testerGrille(Grille grille) {

        if (grille.statutCase(0, 3) == StatutCase.ROUGE && grille.statutCase(0, 2) == StatutCase.ROUGE) {
            return CouleurAlignement.ROUGE;
        }

        if (grille.statutCase(0, 3) == StatutCase.JAUNE) {
            return CouleurAlignement.JAUNE;
        }
        
        return CouleurAlignement.AUCUN;
    }

}
