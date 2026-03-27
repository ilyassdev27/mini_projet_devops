package biblio;
import java.util.ArrayList;
import java.util.List;
public class Bibliotheque {
	

	    private List<Document> catalogue;
	    private String nom;

	    public Bibliotheque(String nom) {
	        this.nom = nom;
	        this.catalogue = new ArrayList<>();
	    }

	    public void ajouterDocument(Document document) {
	        catalogue.add(document);
	        System.out.println("Document ajouté: " + document.getTitre());
	    }

	    public void afficherCatalogue() {
	        System.out.println("=== Catalogue de " + nom + " ===");
	        for (Document doc : catalogue) {
	            doc.afficherInfos();
	            System.out.println();
	        }
	    }

	    public void gererReservations() {
	        for (Document doc : catalogue) {
	            if (doc instanceof Reservable) {
	                Reservable reservable = (Reservable) doc;
	                if (reservable.estReserve()) {
	                    System.out.println(doc.getTitre() + " est réservé par " + reservable.getUtilisateurReservation());
	                }
	            }
	        }
	    }
	    public List<Document> getCatalogue() {
	        return catalogue;
	    }
	    public class Statistiques {
	    	public int getNombreTotalDocuments() {
	            return catalogue.size();
	        }

	        public int getNombreLivres() {
	            int count = 0;
	            for (Document doc : catalogue) {
	                if (doc instanceof Livre) {
	                	count++;
	                	
	                }
	            }
	            return count;
	        }

	        public double getPourcentageEmprunts() {
	            if (catalogue.isEmpty()) return 0.0;
	            int empruntes = 0;
	            for (Document doc : catalogue) {
	                if (doc.isEstEmprunte()) empruntes++;
	            }
	            return (double) empruntes / catalogue.size() * 100;
	        }

	        public void afficherRapport() {
	            System.out.println("--- Rapport Statistique ---");
	            System.out.println("Total documents : " + getNombreTotalDocuments());
	            System.out.println("Total livres : " + getNombreLivres());
	            System.out.println("Taux d'emprunt : " + getPourcentageEmprunts() + "%");
	        }
	        
	        
	        
	    }
	    
}
