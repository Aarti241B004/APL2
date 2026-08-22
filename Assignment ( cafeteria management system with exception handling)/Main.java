public class Main {
    public static void main(String[] args) {
        FoodItem pizza = new FoodItem("Pizza", 100);
        FoodItem sandwich = new FoodItem("Sandwich", 60);
        FoodItem coffee = new FoodItem("Coffee", 40);
        Student student = new Student("Aarti", 500);
        Faculty faculty = new Faculty("Dr. Sharma", 500);
        try {
            student.purchase(sandwich, 2);
        } catch (InsufficientBalanceException |
                 InvalidQuantityException |
                 InvalidFoodItemException e) {

            System.out.println("Error: " + e.getMessage());
        }
        try {
            student.purchase(pizza, 10);
        } catch (InsufficientBalanceException |
                 InvalidQuantityException |
                 InvalidFoodItemException e) {

            System.out.println("Error: " + e.getMessage());
        }
        try {
            faculty.purchase(pizza, 2);
        } catch (InsufficientBalanceException |
                 InvalidQuantityException |
                 InvalidFoodItemException e) {

            System.out.println("Error: " + e.getMessage());
        }
        try {
            student.purchase(coffee, 0);
        } catch (InsufficientBalanceException |
                 InvalidQuantityException |
                 InvalidFoodItemException e) {

            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\n===== RUNTIME POLYMORPHISM =====");
        Person p;
        p = new Student("Rahul", 300);
        try {
            p.purchase(coffee, 2);
        } catch (InsufficientBalanceException |
                 InvalidQuantityException |
                 InvalidFoodItemException e) {

            System.out.println("Error: " + e.getMessage());
        }
        p = new Faculty("Dr. Mehta", 300);
        try {
            p.purchase(coffee, 2);
        } catch (InsufficientBalanceException |
                 InvalidQuantityException |
                 InvalidFoodItemException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            p.purchase(null, 1);
        } catch (InsufficientBalanceException |
                 InvalidQuantityException |
                 InvalidFoodItemException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
