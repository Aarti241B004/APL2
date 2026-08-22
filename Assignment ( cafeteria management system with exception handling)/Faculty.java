public class Faculty extends Person {
    public Faculty(String name, double balance) {
        super(name, balance);
    }
    public void purchase(FoodItem item, int quantity)
            throws InsufficientBalanceException,
                   InvalidQuantityException,
                   InvalidFoodItemException {
        System.out.println("\n--- Faculty Purchase ---");
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
        double normalTotal = item.getPrice() * quantity;
        double discount = normalTotal * 0.10;
        double finalTotal = normalTotal - discount;
        if (balance < finalTotal) {
            throw new InsufficientBalanceException(
                "Insufficient balance. Required: ₹" + finalTotal +
                ", Available: ₹" + balance
            );
        }
        balance -= finalTotal;
        System.out.println("Faculty: " + name);
        System.out.println("Food Item: " + item.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Normal Bill: ₹" + normalTotal);
        System.out.println("Discount (10%): ₹" + discount);
        System.out.println("Final Bill: ₹" + finalTotal);
        System.out.println("Remaining balance: ₹" + balance);
    }
}