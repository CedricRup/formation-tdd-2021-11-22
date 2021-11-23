import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArbitreTest {

    private Arbitre arbitre;
    private Grille grille;

    @BeforeEach
    public void setup() {
        grille = new Grille();
        arbitre = new Arbitre(grille);
    }

    @Test
    public void Jaune_joue_en_premier() {

        Assertions.assertEquals(CouleurJeton.JAUNE, arbitre.getJoueurEnCours());
    }

    @Test
    public void Apres_jaune_cest_rouge() {

        int colonne = 0;
        arbitre.jouer(colonne);

        Assertions.assertEquals(CouleurJeton.ROUGE, arbitre.getJoueurEnCours());
    }

    @Test
    public void Apres_rouge_cest_jaune() {

        int colonne = 0;
        arbitre.jouer(colonne);
        arbitre.jouer(colonne);

        Assertions.assertEquals(CouleurJeton.JAUNE, arbitre.getJoueurEnCours());
    }

    @Test
    public void Si_on_joue_hors_grille_on_rejoue() {

        int colonne = -1;
        arbitre.jouer(colonne);

        Assertions.assertEquals(CouleurJeton.JAUNE, arbitre.getJoueurEnCours());
    }

    @Test
    public void verfier_arbitre_bon_boulot() {
        Assertions.assertEquals(StatutCase.VIDE, grille.statutCase(0, 0));

        int colonne = 0;
        arbitre.jouer(colonne);

        Assertions.assertEquals(StatutCase.JAUNE, grille.statutCase(0, 0));
    }

    @Test
    void si_un_joueur_place_un_jeton_gagnant_le_jeu_sarrete() throws Exception {
        arbitre.jouer(0);
        arbitre.jouer(1);
        arbitre.jouer(0);
        arbitre.jouer(1);
        arbitre.jouer(0);
        arbitre.jouer(1);
        arbitre.jouer(0);
        arbitre.jouer(1);

        Assertions.assertEquals(StatutCase.VIDE, grille.statutCase(1, 3));

    }

}
