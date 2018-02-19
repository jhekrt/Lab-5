public class Test {

    void method() {
        System.out.println("This method was called without creating an instance variable.");
    }

    public static void main(String[] args) {
        new Test().method(); //first comment to be shown on GitHub
    }
}