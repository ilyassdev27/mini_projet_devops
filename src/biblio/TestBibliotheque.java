package biblio;

public class TestBibliotheque {

	public static void main(String[] args) {
		//niveau 1
		/*
		Document Doc1 = new Document();
		Document Doc2 = new Document(2,"titre 1 ","auteur 1 ",2000);
		Document Doc3 = new Document(3,"titre 2 ","auteur 2 ",2005);
		
		Doc1.afficherInfos();
		Doc2.afficherInfos();
		Doc3.afficherInfos();

		Doc2.setEstEmprunte(true);
		Doc2.afficherInfos();
		System.out.println(Doc2.getAuteur());
		Doc1.setAuteur("hamid");
		Doc3.getTitre();
		*/
		//on ne peut pas modifier directement l ' id car il est privee donc on doit utiliser setter (setId) pour le modifier
		
		//niveau 2
		Document[] documents = {
	            new Livre(1, "Clean Code", "Robert Martin", 2008, "978-0132350884", 464),
	            new Magazine(2, "Science & Vie", "Collectif", 2024, 1234, "Mars"),
	            new Livre(3, "Effective Java", "Joshua Bloch", 2017, "978-0134685991", 412)
	        };

	        for (Document doc : documents) {
	            System.out.println("Type: " + doc.getTypeDocument());
	            doc.afficherInfos();
	            doc.emprunter();
	            System.out.println("---");
	        }
		//Q.R:C'est le principe du Polymorphisme,le type réel de l'objet est (Livre,Magazin) donc il va appelle la méthode redéfinie
	        
	        Bibliotheque maBiblio = new Bibliotheque("Bibliothèque Municipale");
	        for (Document doc : documents) maBiblio.ajouterDocument(doc);

	        System.out.println("\n--- Test des Réservations ---");
	        Livre livre1 = (Livre) documents[0];
	        livre1.retourner();
	        livre1.reserver("Ahmed");
	        maBiblio.gererReservations();
	        
	        System.out.println("\n--- Statistiques ---");
	        Bibliotheque.Statistiques stats = maBiblio.new Statistiques();
	       stats.afficherRapport();
	       //class anonyme
	       
	       
	}
}
