package biblio;

public interface Reservable {
	void reserver(String nomUtilisateur);
    void annulerReservation();
    boolean estReserve();
    String getUtilisateurReservation();
}
