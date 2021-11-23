import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class IhmTest {

    private Grille grille;
    private Afficheur afficheur;
    private Lecteur lecteur;
    private Ihm ihm;
    private Arbitre arbitre;

    @BeforeEach
    public void setup() {
        afficheur = Mockito.mock(Afficheur.class);
        lecteur = Mockito.mock(Lecteur.class);
        grille = new Grille();
        arbitre = new Arbitre(grille);
        ihm = new Ihm(afficheur, lecteur, arbitre);
    }

    @Test
    public void debut_partie_joueur_en_cours_affiche() {
        ihm.nouvellePartie();

        Mockito.verify(afficheur).afficher("joueur en cours : Jaune");
    }

    @Test
    void ihm_prend_input_de_la_colonne_a_jouer() throws Exception {
        Mockito.when(lecteur.lire()).thenReturn(0);
        ihm.nouvellePartie();

        Assertions.assertEquals(StatutCase.JAUNE, grille.statutCase(0, 0));
    }
}
