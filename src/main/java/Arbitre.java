public class Arbitre {

    private CouleurJeton joueurEnCours = CouleurJeton.JAUNE;
    private Grille grille = new Grille();

    public CouleurJeton getJoueurEnCours() {
        return joueurEnCours;
    }

    public void jouer(int colonne) {
        if (grille.ajouterJeton(colonne, joueurEnCours)) {
            joueurEnCours = joueurEnCours == CouleurJeton.JAUNE ? CouleurJeton.ROUGE : CouleurJeton.JAUNE;
        }
    }
}
