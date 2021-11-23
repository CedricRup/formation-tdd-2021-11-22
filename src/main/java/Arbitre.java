public class Arbitre {

    private CouleurJeton joueurEnCours;
    private Grille grille;
    private StatutPartie statutPartie;

    public Arbitre(Grille grille) {
        this.joueurEnCours = CouleurJeton.JAUNE;
        this.grille = grille;
        this.statutPartie = StatutPartie.EN_COURS;
    }

    public CouleurJeton getJoueurEnCours() {
        return joueurEnCours;
    }

    public void jouer(int colonne) {
        if (statutPartie != StatutPartie.EN_COURS) return;
        if (grille.ajouterJeton(colonne, joueurEnCours)) {
            miseAJourDuStatut();
            miseAJourJoueurEnCours();
        }
    }

    private void miseAJourJoueurEnCours() {
        joueurEnCours = joueurEnCours == CouleurJeton.JAUNE ? CouleurJeton.ROUGE : CouleurJeton.JAUNE;
    }

    private void miseAJourDuStatut() {
        switch (TesteurAlignement.testerGrille(grille)) {
            case AUCUN:
                statutPartie = StatutPartie.EN_COURS;
                break;
            case JAUNE:
                statutPartie = StatutPartie.JAUNE;
                break;
            case ROUGE:
                statutPartie = StatutPartie.ROUGE;
                break;
        }
    }

    public StatutPartie getStatutPartie() {
        return statutPartie;
    }
}
