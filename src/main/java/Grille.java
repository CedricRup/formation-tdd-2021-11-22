import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grille {
	
	public Grille() {
		
		for (int i =0; i < this.colonneMaximum; i ++) {
			colonnes.put(i, new ArrayList<>());
		}
		
	}
    private int ligneMaximum = 6;
				
	private int colonneMaximum = 7;
    
    private Map<Integer,List<StatutCase>> colonnes = new HashMap<>();

    public StatutCase statutCase(int colonne, int ligne) {
        if (estHorsGrille(colonne, ligne)) {
            return StatutCase.HORS_GRILLE;
        }
        List<StatutCase> laColonne = colonnes.get(colonne);
        return ligne < laColonne.size() ? laColonne.get(ligne) : StatutCase.VIDE;
    }

    private boolean estHorsGrille(int colonne, int ligne) {
        return colonneEstHorsGrille(colonne) || ligneEstHorsGrille(ligne);
    }

    private boolean colonneEstHorsGrille(int colonne) {
        return colonne >= colonneMaximum || colonne < 0;
    }

    private boolean ligneEstHorsGrille(int ligne) {
        return ligne >= ligneMaximum || ligne < 0;
    }

    public boolean ajouterJeton(int colonne, CouleurJeton couleurJeton) {
        if (colonneEstHorsGrille(colonne)) {
            return false;
        }
    	List<StatutCase> laColonne = colonnes.get(colonne);

        if (laColonne.size() >= ligneMaximum) {
            return false;
        }

        StatutCase statut = couleurJeton == CouleurJeton.JAUNE ? StatutCase.JAUNE : StatutCase.ROUGE;
        laColonne.add(statut);

        return true;
    }
}
