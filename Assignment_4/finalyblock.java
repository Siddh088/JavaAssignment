package Inheritance;

// Java program to demonstrate finally block in java
class finalblock {
    public static void main(String[] args)
    {
        try {
            System.out.println("I am Inside block");
            System.out.println(99 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println(
                    "catch : exception handled.");
        }
        finally {
            System.out.println("I am Finally block, always Run.");
        }
    }
}
