import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArbitreTest {
    @Test
    public void Jaune_joue_en_premier() {
        Arbitre arbitre = new  Arbitre();

        Assertions.assertEquals(CouleurJeton.JAUNE, arbitre.getJoueurEnCours());
    }

    @Test
    public void Apres_jaune_cest_rouge() {
        Arbitre arbitre = new  Arbitre();

        int colonne = 0;
        arbitre.jouer(colonne);

        Assertions.assertEquals(CouleurJeton.ROUGE, arbitre.getJoueurEnCours());
    }

    @Test
    public void Apres_rouge_cest_jaune() {
        Arbitre arbitre = new  Arbitre();

        int colonne = 0;
        arbitre.jouer(colonne);
        arbitre.jouer(colonne);

        Assertions.assertEquals(CouleurJeton.JAUNE, arbitre.getJoueurEnCours());
    }

    @Test
    public void Si_on_joue_hors_grille_on_rejoue() {
        Arbitre arbitre = new  Arbitre();

        int colonne = -1;
        arbitre.jouer(colonne);

        Assertions.assertEquals(CouleurJeton.JAUNE, arbitre.getJoueurEnCours());
    }
}
