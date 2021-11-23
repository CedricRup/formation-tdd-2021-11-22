
public class Ihm {

    private Afficheur afficheur;
    private Arbitre arbitre;
    private Lecteur lecteur;

    public Ihm(Afficheur afficheur, Lecteur lecteur, Arbitre arbitre) {
        this.afficheur = afficheur;
        this.lecteur = lecteur;
        this.arbitre = arbitre;
    }

    public void nouvellePartie() {
        afficheur.afficher("joueur en cours : Jaune");
        arbitre.jouer(lecteur.lire() - 1);
        afficheur.afficher("joueur en cours : Rouge");
        arbitre.jouer(lecteur.lire() - 1);
        afficheur.afficher("joueur en cours : Jaune");
    }

}
