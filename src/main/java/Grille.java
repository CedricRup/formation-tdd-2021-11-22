import java.util.ArrayList;
import java.util.List;

public class Grille {
    private List<StatutCase> colonne = new ArrayList<>();

    public StatutCase statutCase(int colonne, int ligne)
    {
        return ligne <= this.colonne.size() ? this.colonne.get(ligne) : StatutCase.VIDE;
    }

    public void ajouterJeton(int colonne, CouleurJeton couleurJeton) {
        StatutCase statut = couleurJeton == CouleurJeton.JAUNE ? StatutCase.JAUNE : StatutCase.ROUGE;
        this.colonne.add(statut);
    }
}
