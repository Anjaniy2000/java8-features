package functionalinterfaces;

public class MainClass{
    public static void main(String[] args) {
        GreetClass greetClass = new GreetClass();
        greetClass.greet("Good Morning");
        greetClass.add(12, 15);
        System.out.println("Value of PI = " + Greet.getPI());
    }
}
