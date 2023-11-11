public class Magasin {
    public int identifiant;
    public String adresse;
    public int capaciteMax = 50;
    public Produit[] produits;
    public int np;

    public Magasin(int identifiant, String adresse, int capaciteMax) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capaciteMax = capaciteMax;
        this.produits = new Produit[capaciteMax];
        this.np = 0;
    }

    public void ajouterProduit(Produit produit) {
        if (np  < capaciteMax) {
            produits[np] = produit;
            np++;
        } else {
            System.out.println("Erreur : Capacité maximale atteinte, impossible d'ajouter plus de produits.");
        }
    }

    public void afficherCaracteristiques() {
        System.out.println("Identifiant du magasin : " + identifiant);
        System.out.println("Adresse du magasin : " + adresse);
        System.out.println("Capacité maximale du magasin : " + capaciteMax);
        System.out.println("Liste des produits du magasin :");
        for (int i = 0; i < np; i++) {
            Produit produit = produits[i];
            System.out.println("Nom : " + produit.getLibelle() + ", Prix : " + produit.getPrix());
        }
    }
