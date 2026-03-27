package biblio;

public class Magazine extends Document{
	private int numeroEdition;
    private String moisParution;

    public Magazine(int id, String titre, String auteur, int annee, int numeroEdition, String moisParution) {
        super(id, titre, auteur, annee);
        this.numeroEdition = numeroEdition;
        this.moisParution = moisParution;
    }

    public String getTypeDocument() {
        return "Magazine";
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Edition N°: " + numeroEdition + " | Parution: " + moisParution);
    }
}

