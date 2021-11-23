import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteurAlignementTest {
	
    @Test
    void il_faut_au_moins_4_jeton_dans_une_colonne() throws Exception {
        Grille grille = new Grille();

        CouleurAlignement alignement = TesteurAlignement.testerGrille(grille);

        Assertions.assertEquals(CouleurAlignement.AUCUN, alignement);
    }

    @Test
    void il_faut_4_jeton_rouge_de_suite_dans_une_colonne() throws Exception {
        Grille grille = new Grille();
        grille.ajouterJeton(0, CouleurJeton.ROUGE);
        grille.ajouterJeton(0, CouleurJeton.ROUGE);
        grille.ajouterJeton(0, CouleurJeton.ROUGE);
        grille.ajouterJeton(0, CouleurJeton.ROUGE);

        CouleurAlignement alignement = TesteurAlignement.testerGrille(grille);

        Assertions.assertEquals(CouleurAlignement.ROUGE, alignement);
    }
    
    @Test
    void il_faut_4_jeton_rouge_de_suite_dans_une_colonnes() throws Exception {
    	
        Grille grille = new Grille();
        
        grille.ajouterJeton(0, CouleurJeton.ROUGE);

        CouleurAlignement alignement = TesteurAlignement.testerGrille(grille);

        Assertions.assertEquals(CouleurAlignement.AUCUN, alignement);
        
    }
    
    @Test
    void il_faut_4_jeton_jaune_de_suite_dans_une_colonne() throws Exception {
        Grille grille = new Grille();
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);

        CouleurAlignement alignement = TesteurAlignement.testerGrille(grille);

        Assertions.assertEquals(CouleurAlignement.JAUNE, alignement);
    }
    
    @Test
    void il_faut_4_jeton_jaune_de_suite_dans_une_colonnes() throws Exception {
        Grille grille = new Grille();
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.ROUGE);

        CouleurAlignement alignement = TesteurAlignement.testerGrille(grille);

        Assertions.assertEquals(CouleurAlignement.AUCUN, alignement);
    }
    
    @Test
    void il_faut_4_jeton_jaune_de_suite_dans_unes_colonnes() throws Exception {
        Grille grille = new Grille();
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.ROUGE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);

        CouleurAlignement alignement = TesteurAlignement.testerGrille(grille);

        Assertions.assertEquals(CouleurAlignement.AUCUN, alignement);
    }

    @Test
    void il_faut_4_jeton_rouge_de_suite_dans_unes_colonnes() throws Exception {
        Grille grille = new Grille();
        grille.ajouterJeton(0, CouleurJeton.ROUGE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);

        CouleurAlignement alignement = TesteurAlignement.testerGrille(grille);

        Assertions.assertEquals(CouleurAlignement.AUCUN, alignement);
    }
    
    @Test
    void il_faut_1_jeton_rouge_de_suite_dans_unes_colonnes() throws Exception {
        Grille grille = new Grille();
        grille.ajouterJeton(0, CouleurJeton.ROUGE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);
        grille.ajouterJeton(0, CouleurJeton.JAUNE);

        CouleurAlignement alignement = TesteurAlignement.testerGrille(grille);

        Assertions.assertEquals(CouleurAlignement.JAUNE, alignement);
    }
   
}
