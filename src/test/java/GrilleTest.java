import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GrilleTest {
    @Test
    public void Si_On_Ajoute_Rouge_En_0_Sur_Une_Grille_Vide_Alors_Le_Statut_De_La_Case_0_0_Est_Rouge() {
        Grille maGrille = new Grille();

        maGrille.ajouterJeton(0, CouleurJeton.ROUGE);

        StatutCase valeurReelle = maGrille.statutCase(0, 0);
        Assertions.assertEquals(StatutCase.ROUGE, valeurReelle);
    }

    @Test
    public void Si_Ajoute_Joue_Jaune_En_0_Sur_Une_Grille_Vide_Alors_Le_Statut_De_La_Case_0_0_Est_Jaune() {
        Grille maGrille = new Grille();

        maGrille.ajouterJeton(0, CouleurJeton.JAUNE);

        StatutCase valeurReelle = maGrille.statutCase(0, 0);
        Assertions.assertEquals(StatutCase.JAUNE, valeurReelle);
    }

    @Test
    public void Si_On_A_Pas_De_Pion_Dans_Une_Case_elle_Est_Vide() {
        Grille maGrille = new Grille();

        StatutCase valeurReelle = maGrille.statutCase(0, 0);
        Assertions.assertEquals(StatutCase.VIDE, valeurReelle);
    }

    @Test
    public void Si_On_Ajoute_En_0_Sur_Un_Pion_Existant_Alors_Le_Statut_De_La_Case_0_1_Est_Rouge() {
        Grille maGrille = new Grille();

        maGrille.ajouterJeton(0, CouleurJeton.ROUGE);
        maGrille.ajouterJeton(0, CouleurJeton.JAUNE);

        Assertions.assertEquals(StatutCase.ROUGE, maGrille.statutCase(0, 0));
        Assertions.assertEquals(StatutCase.JAUNE, maGrille.statutCase(0, 1));
    }

    @Test
    public void Si_On_A_Pu_Ajouter_Un_Pion_Alors_La_Methode_Retourne_True() {
        Grille maGrille = new Grille();

        boolean reussite = maGrille.ajouterJeton(0, CouleurJeton.JAUNE);

        Assertions.assertTrue(reussite);
    }

    @Test
    public void Si_On_Ajoute_Trop_De_Pion_Alors_La_Methode_Retourne_False() {
        Grille maGrille = new Grille();
        maGrille.ajouterJeton(0, CouleurJeton.ROUGE);
        maGrille.ajouterJeton(0, CouleurJeton.ROUGE);
        maGrille.ajouterJeton(0, CouleurJeton.ROUGE);
        maGrille.ajouterJeton(0, CouleurJeton.ROUGE);
        maGrille.ajouterJeton(0, CouleurJeton.ROUGE);
        maGrille.ajouterJeton(0, CouleurJeton.ROUGE);

        boolean reussite = maGrille.ajouterJeton(0, CouleurJeton.JAUNE);

        Assertions.assertFalse(reussite);
    }
    
    @Test
    public void On_peut_ajouter_un_jeton_en_colonne1() {
    	
        Grille maGrille = new Grille();
        maGrille.ajouterJeton(1, CouleurJeton.ROUGE);
        
        Assertions.assertEquals(StatutCase.VIDE, maGrille.statutCase(0, 0));
        Assertions.assertEquals(StatutCase.ROUGE, maGrille.statutCase(1, 0));
        
    }
    
}
