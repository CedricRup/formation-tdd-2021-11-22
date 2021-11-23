public class Arbitre {

    private CouleurJeton joueurEnCours;
    private Grille grille;
    private boolean partieEnCours;

    public Arbitre(Grille grille) {
        this.joueurEnCours = CouleurJeton.JAUNE;
        this.grille = grille;
        this.partieEnCours = true;
    }

    public CouleurJeton getJoueurEnCours() {
        return joueurEnCours;
    }

    public void jouer(int colonne) {
        if (!partieEnCours) return;
        if (grille.ajouterJeton(colonne, joueurEnCours)) {
            partieEnCours = TesteurAlignement.testerGrille(grille) == CouleurAlignement.AUCUN;
            joueurEnCours = joueurEnCours == CouleurJeton.JAUNE ? CouleurJeton.ROUGE : CouleurJeton.JAUNE;
        }
    }

    public StatutPartie getStatutPartie() {
        return null;
    }
}
