
public class AfficheurConsole implements Afficheur {

    @Override
    public void afficher(String ligne) {
        System.out.println(ligne);
    }

}
