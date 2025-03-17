public class AlignementCase {
    private int position;

    // Constructeur
    public AlignementCase(int position) {
        this.position = position;
    }

    // Obtenir le numéro de la case
    public int getCaseNum() {
        return position;
    }

    // Affichage des cases libres
    public void afficherCasesLibres() {
        System.out.println("Cases libres : " );
    }
}
