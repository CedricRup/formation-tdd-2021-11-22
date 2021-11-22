import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GrilleTest {
    @Test
    public void Si_On_Joue_En_0_Sur_Une_Grille_Vide_Alors_Le_Statut_De_La_Case_0_0_Est_Rouge(){
        Grille maGrille = new Grille();

        maGrille.ajouterJeton(0);

        StatutCase valeurReelle = maGrille.statutCase(0,0);
        Assertions.assertEquals(StatutCase.ROUGE,valeurReelle);
    }

    @Test
    public void Si_On_Joue_En_0_Sur_Un_Pion_Existant_Alors_Le_Statut_De_La_Case_0_1_Est_Rouge(){
        Grille maGrille = new Grille();

        maGrille.ajouterJeton(0);
        maGrille.ajouterJeton(0);

        StatutCase valeurReelle = maGrille.statutCase(0,1);
        Assertions.assertEquals(StatutCase.ROUGE,valeurReelle);
    }
}
