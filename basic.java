package Practice;

public class Basic {
    public static void main(String[] args) {
        // 1. Variables and Data Types
        String name = "Kavi";  // String input
        int age = 21;           // Integer input

        System.out.println("\nHello, " + name + "!");
        
        // 2. Conditional Statements
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // 3. Loops
        System.out.println("\nCounting from 1 to 5 using a loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 4. Arrays
        int[] numbers = {10, 20, 30};  // Predefined favorite numbers
        System.out.println("\nYour favorite numbers are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Methods
        int num1 = 5;
        int num2 = 7;
        System.out.println("\nThe sum is: " + addNumbers(num1, num2));

        // 6. Classes and Objects
        String brand = "Tesla";
        int year = 2022;
        Car myCar = new Car(brand, year);
        myCar.displayDetails();

        // 7. Inheritance and 8. Polymorphism
        Animal animal = new Dog("Buddy", "Golden Retriever");
        animal.displayInfo(); // Calls overridden method

        // 9. Exception Handling
        int divisor = 5;
        try {
            System.out.println("\nResult: " + (100 / divisor));
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    // 5. Methods
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}

// 6. Classes and Objects
class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacture Year: " + year);
    }
}

// 7. Inheritance and 8. Polymorphism
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dog Name: " + name);
        System.out.println("Breed: " + breed);
    }
}
