public class Person {
    protected String name;
    protected double balance;
    public Person(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void purchase(FoodItem item, int quantity)
            throws InsufficientBalanceException,
                   InvalidQuantityException,
                   InvalidFoodItemException {
        if (item == null) {
            throw new InvalidFoodItemException(
                "Food item cannot be null."
            );
        }
        if (quantity <= 0) {
            throw new InvalidQuantityException(
                "Quantity must be greater than 0."
            );
        }
        double total = item.getPrice() * quantity;
        if (balance < total) {
            throw new InsufficientBalanceException(
                "Insufficient balance. Required: ₹" + total +
                ", Available: ₹" + balance
            );
        }
        balance -= total;
        System.out.println(name + " purchased " +
                quantity + " " + item.getName());
        System.out.println("Total bill: ₹" + total);
        System.out.println("Remaining balance: ₹" + balance);
    }
}