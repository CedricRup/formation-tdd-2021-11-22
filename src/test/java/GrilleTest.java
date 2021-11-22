import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GrilleTest {
    @Test
    public void Si_On_Ajoute_Rouge_En_0_Sur_Une_Grille_Vide_Alors_Le_Statut_De_La_Case_0_0_Est_Rouge(){
        Grille maGrille = new Grille();

        maGrille.ajouterJeton(0, CouleurJeton.ROUGE);

        StatutCase valeurReelle = maGrille.statutCase(0,0);
        Assertions.assertEquals(StatutCase.ROUGE,valeurReelle);
    }

    @Test
    public void Si_Ajoute_Joue_Jaune_En_0_Sur_Une_Grille_Vide_Alors_Le_Statut_De_La_Case_0_0_Est_Jaune(){
        Grille maGrille = new Grille();

        maGrille.ajouterJeton(0,CouleurJeton.JAUNE);

        StatutCase valeurReelle = maGrille.statutCase(0,0);
        Assertions.assertEquals(StatutCase.JAUNE,valeurReelle);
    }

    @Test
    public void Si_On_A_Pas_De_Pion_Dans_Une_Case_elle_Est_Vide(){
        Grille maGrille = new Grille();

        StatutCase valeurReelle = maGrille.statutCase(0,1);
        Assertions.assertEquals(StatutCase.VIDE,valeurReelle);
    }


    @Test
    public void Si_On_Ajoute_En_0_Sur_Un_Pion_Existant_Alors_Le_Statut_De_La_Case_0_1_Est_Rouge(){
        Grille maGrille = new Grille();

        maGrille.ajouterJeton(0, CouleurJeton.ROUGE);
        maGrille.ajouterJeton(0,CouleurJeton.JAUNE);

        Assertions.assertEquals(StatutCase.ROUGE, maGrille.statutCase(0,0));
        Assertions.assertEquals(StatutCase.JAUNE, maGrille.statutCase(0,1));
    }
}
