public class TotalProduits {
        public static int calculerTotalProduits(Magasin[] magasins) {
            int totalProduits = 0;
            for (Magasin magasin : magasins) {
                totalProduits += magasin.getNombreProduits();
            }
            return totalProduits;
        }
}
