import java.util.ArrayList;
import java.util.Collections;

public class Kaufen_Operations {

    static int billigsteProdukt(ArrayList<Integer> produkts) {
        produkts.sort(Integer::compareTo);

        int billigsteProdukt = produkts.get(0);
        for (int i = 1; i < produkts.size(); i++) {
            if (produkts.get(i) < billigsteProdukt) {
                billigsteProdukt = produkts.get(i);
            }
        }

        return billigsteProdukt;
    }

    static int teursteProdukt(ArrayList<ArrayList<Integer>> produkts) {

        for (ArrayList<Integer> produkt: produkts) {
            produkt.sort(Integer::compareTo);
        }

        int teursteProdukt = produkts.get(0).get(0);

        for (ArrayList produkt: produkts) {
            for (int i=1; i<produkt.size(); i++) {
                if ((int) produkt.get(i) > teursteProdukt) {
                    teursteProdukt = (int) produkt.get(i);
                }
            }
        }

        return teursteProdukt;
    }

    static int teuersteBudget(ArrayList<Integer> products, Integer budget) {
        products.sort(Collections.reverseOrder());

        int teuersteBudget = -1;

        for (Integer productPrice : products) {
            if (productPrice <= budget) {
                teuersteBudget = productPrice;
                break;
            }
        }

        return teuersteBudget;
    }


    static int budgetKaufen(ArrayList<ArrayList<Integer>> products, Integer budget) {
        // Sort each product category in ascending order of price
        for (ArrayList<Integer> product : products) {
            product.sort(Integer::compareTo);
        }

        int finalPrice = 0;
        ArrayList<Integer> buyProducts = new ArrayList<>();

        for (ArrayList<Integer> product : products) {
            buyProducts.add(product.get(0));
        }

        for (Integer buyProduct : buyProducts) {
            finalPrice += buyProduct;
        }

        if (finalPrice > budget) return -1;

        for (int i = 1; i < products.size(); i++) {
            for (int j = 1; j < products.get(i).size(); j++) {
                int updatedPrice = finalPrice - buyProducts.get(i) + products.get(i).get(j);

                if (updatedPrice < budget) {
                    buyProducts.set(i - 1, products.get(i).get(j));
                    finalPrice = updatedPrice;
                }
            }
        }

        return finalPrice;
    }



}
