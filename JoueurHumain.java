
public class JoueurHumain extends Joueur {
    private String prenom;
    private int age;
    private String adresse;

    // Constructeur
    public JoueurHumain(String nom, String prenom, int age, String adresse) {
        super(nom);
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
    }

    // Affichage des infos
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Prénom : " + prenom);
        System.out.println("Âge : " + age);
        System.out.println("Adresse : " + adresse);
    }
}
