public class Coup {
    private int joueur;
    private int position;
    private int orientation;

    // Constructeur
    public Coup(int joueur, int position, int orientation) {
        this.joueur = joueur;
        this.position = position;
        this.orientation = orientation;
    }

    // Affichage des infos
    public void afficherCoup() {
        System.out.println("Joueur : " + joueur);
        System.out.println("Position : " + position);
        System.out.println("Orientation : " + orientation);
    }
}

