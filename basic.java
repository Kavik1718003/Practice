import java.util.Scanner;

class JavaImportantTopics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Variables and Data Types
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // String input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Integer input

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
        System.out.println("\nEnter 3 favorite numbers:");
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Your favorite numbers are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Methods
        System.out.println("\nEnter two numbers to find their sum:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("The sum is: " + addNumbers(num1, num2));

        // 6. Classes and Objects
        System.out.println("\nEnter details of a car:");
        scanner.nextLine(); // Consume newline
        System.out.print("Car Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Car Year: ");
        int year = scanner.nextInt();
        Car myCar = new Car(brand, year);
        myCar.displayDetails();

        // 7. Inheritance and 8. Polymorphism
        System.out.println("\nInheritance and Polymorphism Example:");
        Animal animal = new Dog("Buddy", "Golden Retriever");
        animal.displayInfo(); // Calls overridden method

        // 9. Exception Handling
        System.out.println("\nEnter a number to divide 100:");
        try {
            int divisor = scanner.nextInt();
            System.out.println("Result: " + (100 / divisor));
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        scanner.close();
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
