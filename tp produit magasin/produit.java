produit
package tuniprod.gestionmagasin;

public class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;

    public Produit(int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        setPrix(prix);
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if (prix >= 0) {
            this.prix = prix;
        } else {
            System.out.println("Erreur : Le prix ne peut pas être négatif.");
        }
    }

    
}
