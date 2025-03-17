
public class Test {
    public static void main(String[] args) {
        // Tester Joueur
        Joueur joueur1 = new Joueur("Adiara");
        joueur1.afficherInfos();

        // Tester JoueurHumain
        JoueurHumain joueur2 = new JoueurHumain("Sall", "Adiara", 23, "sandaga");
        joueur2.afficherInfos();

        // Tester JoueurOrdinateur
        JoueurOrdinateur ordi = new JoueurOrdinateur("ludo", 1, 10);
        ordi.afficherInfos();

        // Tester Coup
        Coup coup = new Coup(1, 5, 90);
        coup.afficherCoup();

        // Tester AlignementCase
        AlignementCase alignement = new AlignementCase(1);
        System.out.println("Numéro de case : " + alignement.getCaseNum());
        alignement.afficherCasesLibres();

        // Tester la grille et les stratégies
        Grille grille = new Grille(8); // Grille 8x8

        // Initialiser avec des valeurs aléatoires
        grille.placerValeur(3, 3, 5);
        grille.placerValeur(2, 2, 8);
        grille.placerValeur(6, 6, 3);

        
    }
}
