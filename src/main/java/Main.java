// project 15 Restaurant Bill
/*
  1- create Bill object
  2- Bill object contains: food, quantity, and price
  3- get order and total cost of Bill
  4- use ArrayLists ot record order
 */


public class Main {
    public static void main(String[] args) {

        // set up the 2 ArrayList for the Bill Object
        String[] dish = {"Sandwich", "French Fries", "Salad", "Bacon Snacker", "Soda", "Pie"};
        double[] cost = {7.25, 2.99, 8.50, 6.38, 2.50, 4.58};               // the are input to index at the same point as the coinciding dish

        Bill trelvynBill = new Bill();
        trelvynBill.addToTotal("Sandwich", 2, dish, cost);
        trelvynBill.addToTotal("French Fries", 1, dish, cost);
        trelvynBill.addToTotal("Soda", 2, dish, cost);
        trelvynBill.addToTotal("Bacon Snacker", 1, dish, cost);
        trelvynBill.addToTotal("Pie", 1, dish, cost);
        trelvynBill.getOrder();
        System.out.println(trelvynBill.getTotal());
    }
}
