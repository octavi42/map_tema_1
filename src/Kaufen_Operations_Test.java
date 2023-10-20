import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Kaufen_Operations_Test {

    private ArrayList<Integer> products1;
    private ArrayList<Integer> products2;
    private ArrayList<Integer> products3;

    @BeforeEach
    public void setUp() {
        products1 = new ArrayList<>(Arrays.asList(40, 35, 70, 15, 45));
        products2 = new ArrayList<>(Arrays.asList(20, 15, 40, 15));
        products3 = new ArrayList<>(Arrays.asList(15, 45, 20));
    }

    @Test
    public void testBilligsteProdukt() {
        int cheapest = Kaufen_Operations.billigsteProdukt(products1);
        assertEquals(15, cheapest);
    }

    @Test
    public void testTeursteProdukt() {
        ArrayList<ArrayList<Integer>> productsList = new ArrayList<>();
        productsList.add(products1);
        productsList.add(products2);
        productsList.add(products3);

        int mostExpensive = Kaufen_Operations.teursteProdukt(productsList);
        assertEquals(70, mostExpensive);
    }

    @Test
    public void testTeuersteBudget() {
        int mostExpensive = Kaufen_Operations.teuersteBudget(products1, 50);
        assertEquals(45, mostExpensive);
    }

    @Test
    public void testBudgetKaufen() {
        ArrayList<ArrayList<Integer>> productsList = new ArrayList<>();
        productsList.add(products1);
        productsList.add(products2);
        productsList.add(products3);

        int totalPrice = Kaufen_Operations.budgetKaufen(productsList, 60);
        assertEquals(55, totalPrice);
    }


    @Test
    public void testBilligsteProduktBreak() {
        int cheapest = Kaufen_Operations.billigsteProdukt(products1);

        assertNotEquals(40, cheapest);
    }

    @Test
    public void testTeursteProduktBreak() {
        ArrayList<ArrayList<Integer>> productsList = new ArrayList<>();
        productsList.add(products1);
        productsList.add(products2);
        productsList.add(products3);

        int mostExpensive = Kaufen_Operations.teursteProdukt(productsList);

        assertNotEquals(15, mostExpensive);
    }

    @Test
    public void testTeuersteBudgetBreak() {
        int mostExpensive = Kaufen_Operations.teuersteBudget(products1, 50);

        assertNotEquals(55, mostExpensive);
    }

    @Test
    public void testBudgetKaufenBreak() {
        ArrayList<ArrayList<Integer>> productsList = new ArrayList<>();
        productsList.add(products1);
        productsList.add(products2);
        productsList.add(products3);

        int totalPrice = Kaufen_Operations.budgetKaufen(productsList, 60);

        assertNotEquals(75, totalPrice);
    }
}
