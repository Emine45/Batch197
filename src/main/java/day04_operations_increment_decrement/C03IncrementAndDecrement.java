package day04_operations_increment_decrement;

public class C03IncrementAndDecrement {

    public static void main(String[] args) {
        // Increment: Used to increase value of a variable
        int age = 13;
        System.out.println(age + 2);
        System.out.println(age);

        // First way:
        age = age + 2; // 15
        System.out.println("First increment = "+age);

        // Second way:
        age += 2; // 17
        System.out.println("Second increment = "+age);

        // Increment can be done by multiplication as well
        // First way:
        age = age*2; // 34
        System.out.println("Third increment = " + age);
        // Second Way:
        age *= 2; // 68
        System.out.println("Fourth increment = " + age);

        // Decrement: It is used to decrease value of a varaible:
        // First way:
        age = age - 2;// 66
        System.out.println("First decrement = " + age);

        // Second way:
        age -= 6; // 60
        System.out.println("Second decrement = " + age);

        // Division can be to decrement:
        // First way
        age = age/5; // 12
        System.out.println("Third decrement = " + age);

        // Second Way:
        age /= 4; // 3
        System.out.println("Fourth decrement = " + age);

        // Note: There is Special format used to increment/decrement by one
        // For increment:
        age++; // 4
        System.out.println("After special increment format: " + age);

        age--; // 3
        System.out.println("After special decrement format: " + age);

    }

}