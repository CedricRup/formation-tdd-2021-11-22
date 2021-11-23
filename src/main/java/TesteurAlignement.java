
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
    	return extracted(grille, statutCase) || extracted2(grille, statutCase);
    }

	private static boolean extracted(Grille grille, StatutCase statutCase) {
		for (int i =0; i < 4; i++ ) {
    		if ( grille.statutCase(0, i) != statutCase) {
    			return false;
    		}
    	}
		return true;
	}
	
	private static boolean extracted2(Grille grille, StatutCase statutCase) {
		for (int i =1; i < 5; i++ ) {
    		if ( grille.statutCase(0, i) != statutCase) {
    			return false;
    		}
    	}
		return true;
	}

}
