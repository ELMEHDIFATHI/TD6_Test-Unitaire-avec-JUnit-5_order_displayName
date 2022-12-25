
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CompteEpargneTest {
    static int i=0;
    CompteEpargne SansNom;
    CompteEpargne avecNom;
    CompteEpargne tawafir;

    @BeforeEach
    void setUp(){
        SansNom = new CompteEpargne();
        avecNom = new CompteEpargne("Ahmed",121,1000.0);
        tawafir =new CompteEpargne("Ali",1261,2500.0);
    }

    @BeforeAll
    static void setupAll(){
        System.out.println("******Debut des test de class Compte Epargne");
    }

    /*
    @Test
    void testGetNom(){
        fail("Not yet implemented");
    }

    @Test
    void testCompteEpargneStringIntDouble(){
        fail("Not yet implemented");
    }
    eureur initialiser
     */


    @Test
    @DisplayName("le constructeur CompteEparne retun object Non Null")
    @Order(1)
    public  void CompteEpargneReturneObjectNonNull(){
        CompteEpargne tawafir = new CompteEpargne("Ali",6354,2600.0);
        assertNotNull(tawafir);
        i++;
        System.out.println("CompteEpargneReturneObjectNonNull"+i);
       //System.out.println("1");

    }

    @Test
    @DisplayName("GetNOM Retourne Null si Le Nom Est Non Initialise")
    @Order(3)
   public  void GetNomRetourneNullSiLeNomEstNonInitialise(){
        CompteEpargne SansNom=new CompteEpargne();
        String obtenu=SansNom.getNom();
        assertNull(obtenu);
        i++;
        System.out.println("GetNomRetourneNullSiLeNomEstNonInitialise"+i);
        //System.out.println("3");


    }

    @Test
    @DisplayName("GetNOM Retourne Le Nom quand Est  Initialise")
    @Order(2)
    public  void GetNomRetourneNullSiLeNomEstInitialise(){
        CompteEpargne avecNom=new CompteEpargne("AHmed",121,1000.0);
        String obtenu=avecNom.getNom();
        assertEquals("AHmed",obtenu);
       i++;
       System.out.println("GetNomRetourneNullSiLeNomEstInitialise"+i);
        //System.out.println("2");


    }

    @Test
    @DisplayName("retirer Doit Refuser Le Retraut Quand le Montant Superier de Solde")
    @Order(4)
    public  void retirerDoitRefuserLeRetrautQuandleMontantSuperierdeSolde(){
       CompteEpargne twafir = new CompteEpargne("Ali",5222,2500.0);
       twafir.retirer(3000.0);
       double soldePrevu=2500.0;
       double soldeCalcule= twafir.getSolde();
       assertEquals(soldePrevu,soldeCalcule);


    }

    @Test
    @DisplayName("retirer Doit Refuser Le Retraut Quand le Montant Inferieur de Solde")
    @Order(5)
    public  void retirerDoitRefuserLeRetrautQuandleMontantInferieurdeSolde(){
        CompteEpargne twafir = new CompteEpargne("Ali",5222,2500.0);
        twafir.retirer(2000.0);
        double soldePrevu=2500.0;
        double soldeCalcule= twafir.getSolde();
        assertEquals(soldePrevu,soldeCalcule);


    }
    @Test
    @DisplayName("retirer Doit Refuser Le Retraut Quand le Montant petite Inferieur de Solde")
    @Order(6)
    public  void retirerDoitRefuserLeRetrautQuandlepetiteMontantInferieurdeSolde(){
        CompteEpargne twafir = new CompteEpargne("Ali",5222,2500.0);
        twafir.retirer(100.0);
        double soldePrevu=2500.0;
        double soldeCalcule= twafir.getSolde();
        assertEquals(soldePrevu,soldeCalcule);


    }






}
