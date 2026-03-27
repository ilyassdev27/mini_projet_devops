package biblio;

public class Livre extends Document implements Reservable {

	private String isbn;
    private int nombrePages;
    private String utilisateurReservation;

    public Livre(int id, String titre, String auteur, int annee, String isbn, int pages) {
        super(id, titre, auteur, annee);
        this.isbn = isbn;
        this.nombrePages = pages;
        this.utilisateurReservation = null;
    }

    public String getTypeDocument() {
        return "Livre";
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("ISBN: " + isbn + " | Pages: " + nombrePages);
    }

    public void reserver(String nomUtilisateur) {
        if (!isEstEmprunte() && utilisateurReservation == null) {
            this.utilisateurReservation = nomUtilisateur;
            System.out.println("Le livre '" + getTitre() + "' a été réservé par " + nomUtilisateur);
        } else {
            System.out.println("Le livre n'est pas disponible pour la réservation.");
        }
    }

    @Override
    public void annulerReservation() {
        this.utilisateurReservation = null;
        System.out.println("Réservation annulée pour le livre '" + getTitre() + "'.");
    }

    @Override
    public boolean estReserve() {
        return this.utilisateurReservation != null;
    }

    @Override
    public String getUtilisateurReservation() {
        return this.utilisateurReservation;
    }

}
