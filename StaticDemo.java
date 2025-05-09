class Test {
    // Static variable
    static int count = 0;

    // Static method
    static void showCount() {
        System.out.println("Count is: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // Accessing static variable and method directly using class name
        Test.count = 10;
        Test.showCount();
    }
}
