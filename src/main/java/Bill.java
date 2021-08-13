import java.util.ArrayList;

public class Bill {
    private ArrayList<String> foodOrder;
    private ArrayList<Integer> quantityOrder;
    public Bill() {

        // create ArrayList
        foodOrder = new ArrayList<String>();
        quantityOrder = new ArrayList<Integer>();        // 'Integer' here is an object type (and capitalized) 'int' is a primitive type
    }
    private double totalCost;
    public double getTotal() {
        return totalCost;
    }
    public void addToTotal(String meal, int quantity, String[] dish, double[] cost) {
        foodOrder.add(meal);
        quantityOrder.add(quantity);                // autoboxing done in Java - do NOT have to convert 'int' primitive to 'Integer' object before adding it to ArrayList
        for (int i = 0; i < dish.length; i++) {
            if (meal.equals(dish[i])) {

                totalCost += quantity * cost[i];      // totalCost is initialized as 0 when Bill instance is created
            }
        }
    }
        public void getOrder() {
            for (int i = 0; i < foodOrder.size(); i++) {            // .size fills the # of elements in the ordered ArrayList
                System.out.println(foodOrder.get(i) + "  qty: " + quantityOrder.get(i));

            }
        }
    }

