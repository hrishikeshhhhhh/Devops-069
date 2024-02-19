public class calculator {
    
    // Addition method
    public static float add(float num1, float num2) {
        return num1 + num2;
    }

    // Subtraction method
    public static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    // Multiplication method
    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    // Division method
    public static float divide(float num1, float num2) {
        // Check for division by zero
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Float.NaN; // NaN (Not a Number) represents an undefined result
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        // Example usage
        float operand1 = 10.5f;
        float operand2 = 5.2f;

        // Perform operations
        float additionResult = add(operand1, operand2);
        float subtractionResult = subtract(operand1, operand2);
        float multiplicationResult = multiply(operand1, operand2);
        float divisionResult = divide(operand1, operand2);

        // Display results
        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
    }
}
