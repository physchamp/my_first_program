public class Example {

    public static void main(String[] args) {

        int temp = 5; // unused variable

        int bonus = calculateBonus(1000);
        System.out.println("Bonus: " + bonus);

        int bonus2 = calculateBonus(2000); // duplicate logic
        System.out.println("Bonus2: " + bonus2);

        if (false) {
            System.out.println("This will never run"); // dead code
        }
    }

    public static int calculateBonus(int salary) {
        int result = salary * 15 / 100; // magic numbers
        System.out.println("Calculating bonus..."); // unnecessary print
        System.out.println("Salary is: " + salary); // unnecessary print
        return result;
    }
}
