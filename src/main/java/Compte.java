public class Compte {
    private String nom;
    private int numeroCompte;
    private double solde;

    public Compte(String nom, int numeroCompte, double solde) {
        this.nom = nom;
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public Compte() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
