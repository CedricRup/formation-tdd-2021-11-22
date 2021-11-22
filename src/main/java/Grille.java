import java.util.ArrayList;
import java.util.List;

public class Grille {
    private int ligneMaximum = 6;

    private List<StatutCase> colonne = new ArrayList<>();

    public StatutCase statutCase(int colonne, int ligne) {
        return ligne <= this.colonne.size() ? this.colonne.get(ligne) : StatutCase.VIDE;
    }

    public boolean ajouterJeton(int colonne, CouleurJeton couleurJeton) {
        if (this.colonne.size() >= ligneMaximum) {
            return false;
        }

        StatutCase statut = couleurJeton == CouleurJeton.JAUNE ? StatutCase.JAUNE : StatutCase.ROUGE;
        this.colonne.add(statut);

        return true;
    }
}
