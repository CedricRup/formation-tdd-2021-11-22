import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
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
    void ihm_prend_input_de_la_colonne_a_jouer() throws Exception {
        Mockito.when(lecteur.lire()).thenReturn(1);
        ihm.nouvellePartie();

        Assertions.assertEquals(StatutCase.JAUNE, grille.statutCase(0, 0));
    }

    @Test
    void une_fois_que_le_joueur_jaune_a_joue_on_affiche_que_cest_au_joueur_rouge() {
        Mockito.when(lecteur.lire()).thenReturn(1);
        ihm.nouvellePartie();
        InOrder inOrder = Mockito.inOrder(afficheur);
        inOrder.verify(afficheur).afficher("joueur en cours : Jaune");
        inOrder.verify(afficheur).afficher("joueur en cours : Rouge");
    }

    @Test
    void une_fois_que_le_joueur_rouge_a_joue_on_affiche_que_cest_au_joueur_jaune() {
        Mockito.when(lecteur.lire()).thenReturn(1,1);
        ihm.nouvellePartie();
        InOrder inOrder = Mockito.inOrder(afficheur);
        inOrder.verify(afficheur).afficher("joueur en cours : Jaune");
        inOrder.verify(afficheur).afficher("joueur en cours : Rouge");
        inOrder.verify(afficheur).afficher("joueur en cours : Jaune");
    }



}
