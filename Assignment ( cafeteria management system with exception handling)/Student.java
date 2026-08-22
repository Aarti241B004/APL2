public class Student extends Person {
    public Student(String name, double balance) {
        super(name, balance);
    }
    public void purchase(FoodItem item, int quantity)
            throws InsufficientBalanceException,
                   InvalidQuantityException,
                   InvalidFoodItemException {
        System.out.println("\n--- Student Purchase ---");
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
        System.out.println("Student: " + name);
        System.out.println("Food Item: " + item.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Bill: ₹" + total);
        System.out.println("Remaining balance: ₹" + balance);
    }
}