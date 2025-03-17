public class Joueur {
    private String nom;

    // Constructeur
    public Joueur(String nom) {
        this.nom = nom;
    }

    // Getter
    public String getNom() {
        return nom;
    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Affichage des infos
    public void afficherInfos() {
        System.out.println("Nom du joueur : " + nom);
    }
}
