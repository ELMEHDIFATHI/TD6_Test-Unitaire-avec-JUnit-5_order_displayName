public class CompteEpargne extends Compte implements Icompte{


    public CompteEpargne(String nom, int numeroCompte, double solde) {
        super(nom, numeroCompte, solde);
    }

    public CompteEpargne() {
        super();
    }

   public double calculerInteret(){


        return  this.getSolde()* 10;
   }

    @Override
    public void retirer(double a) {
        double sold=this.getSolde()-a;
        System.out.println("le nouveau sold est :"+sold);
    }

    @Override
    public void deposer(double a) {
        double sold=this.getSolde()+a;
        System.out.println("le nouveau sold est :"+sold);
    }



}
