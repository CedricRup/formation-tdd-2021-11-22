public class Grille {

    private StatutCase statutCase = StatutCase.VIDE;

    public StatutCase statutCase(int colonne, int ligne) {
        return statutCase;
    }

    public void ajouterJeton(int colonne, CouleurJeton couleurJeton) {
        this.statutCase = couleurJeton == CouleurJeton.JAUNE ? StatutCase.JAUNE : StatutCase.ROUGE;
    }
}
