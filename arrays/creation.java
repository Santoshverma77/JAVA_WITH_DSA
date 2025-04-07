public class creation {
    public static void main(String[] args) {
        // Demonstrate different ways to create arrays
        System.out.println("Array creation examples:");
        
        // OPTION 1: Array with size
        int[] numbers = new int[5];
        System.out.println("Empty int array length: " + numbers.length);
        
        // OPTION 2: Array with initial values
        int[] primes = {2, 3, 5, 7, 11};
        System.out.println("First prime: " + primes[0]);
        
        // OPTION 3: String array
        String[] fruits = {"mango", "watermelon", "banana"};
        System.out.println("Second fruit: " + fruits[1]);
    }
}
