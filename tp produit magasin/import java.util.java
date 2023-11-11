import java.util.Date;

public class Produit {

    public int identifiant;
    public String libelle;
    public String marque;
    public double prix;
    public Date dateExpiration;

    public Produit() {
        this.identifiant = 0;
        this.libelle = "";
        this.marque = "";
        this.prix = 0.0;
        this.dateExpiration = null;
    }


    public void creerProduit(int id, String libelle, String marque, double prix) {
        this.identifiant = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("Identifiant : " + identifiant);
        System.out.println("Libellé : " + libelle);
        System.out.println("Marque : " + marque);
        System.out.println("Prix : " + prix);
        System.out.println("Date d'expiration : " + dateExpiration);
    }

    public void setPrix(double prix) {
        this.prix = prix;
        System.out.println("Produit modifié : " + libelle + ", nouveau prix : " + prix);
    }

    public void completerInformations() {
 
    }

    
    public String toString() {
        return "Produit : " + libelle + ", Marque : " + marque + ", Prix : " + prix;
    }


    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public static void main(String[] args) {
        
        Produit lait = new Produit();
        Produit yaourt = new Produit();
        Produit tomate = new Produit();

        lait.creerProduit(1021, "Lait et Délice", "Sicam", 0.0);
        yaourt.creerProduit(2510, "Yaourt", "Vitalait C.", 0.0);
        tomate.creerProduit(3250, "Tomate", "Sicam", 1.20);

        lait.afficher();
        yaourt.afficher();
        tomate.afficher();

        lait.setPrix(0.70);

        lait.completerInformations();
        yaourt.completerInformations();
        tomate.completerInformations();

        lait.afficher();
        yaourt.afficher();
        tomate.afficher();

        System.out.println(lait.toString());
        System.out.println(yaourt.toString());
        System.out.println(tomate.toString());

        lait.setDateExpiration(new Date());
        yaourt.setDateExpiration(new Date());
        tomate.setDateExpiration(new Date());
    }
}