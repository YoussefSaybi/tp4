public class Proprietaire {
        public static void main(String[] args) {
            Produit produit1 = new Produit(1, "Produit A", "Marque A", 10.0);
            Produit produit2 = new Produit(2, "Produit B", "Marque B", 20.0);
    
            Magasin magasin1 = new Magasin(101, "Adresse 1", 3);
            magasin1.ajouterProduit(produit1);
            magasin1.ajouterProduit(produit2);
    
            magasin1.afficherCaracteristiques();
        }
    }

