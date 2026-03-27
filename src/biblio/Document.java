package biblio;


public abstract class Document {
	private int id;
	private String titre;
	private String auteur;
	private int anneePublication;
	private boolean estEmprunte;
	
	public Document() {
		this.id=1;
		this.titre="Antigone";
		this.auteur="Test";
		this.anneePublication=2010;
		this.estEmprunte=true;
	}
	
	public Document(int id, String titre,String auteur,int anneePublication) {
		this.id= id;
		this.titre = titre;
		this.auteur=auteur;
		this.anneePublication= anneePublication;
		this.estEmprunte=false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getAnneePublication() {
		return anneePublication;
	}

	public void setAnneePublication(int anneePublication) {
		this.anneePublication = anneePublication;
	}

	public boolean isEstEmprunte() {
		return estEmprunte;
	}

	public void setEstEmprunte(boolean estEmprunte) {
		this.estEmprunte = estEmprunte;
	}
	
	public void afficherInfos() {
		String id = "[ID: "+this.id + " ] ";
		String titre = this.titre;
		String auteur = this.auteur;
		String annee = "("+ this.anneePublication + ")";
		String statut;
		if(this.estEmprunte == true) {
			statut = "Statut: Non disponible";
		}else {statut = "Statut: Disponible";}
		
	
		
		
		System.out.println(id +titre + " - "+ auteur + " " + annee + "\n" + statut  );
	}
	
	
	
//	public String emprunter() {
//		if (estEmprunte == false) {
//			estEmprunte = true;
//			return "";
//		}
//		
//		return auteur;
//		
//	}
	
	
	
	
	public void emprunter() {
        if (!estEmprunte) {
            this.estEmprunte = true;
            System.out.println(this.titre + " a été emprunté.");
        } else {
            System.out.println(this.titre + " est déjà emprunté.");
        }
    }

    public void retourner() {
        if (estEmprunte) {
            this.estEmprunte = false;
            System.out.println(this.titre + " a été retourné.");
        }
    }

	public abstract String getTypeDocument();

	
    
	
}
