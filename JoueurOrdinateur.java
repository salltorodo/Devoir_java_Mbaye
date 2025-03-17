public class JoueurOrdinateur extends Joueur {
    private int typedejeu;
    private int niveau;

    // Constructeur
    public JoueurOrdinateur(String nom, int typedejeu, int niveau) {
        super(nom);
        this.typedejeu = typedejeu;
        this.niveau = niveau;
    }

    // Affichage des infos
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Type de jeu : " + typedejeu);
        System.out.println("Niveau : " + niveau);
    }
}
