package dev.hatcattt.jtbrn.exos;

/**
 * Write a program that takes an operator ("+", "-", "*") and two integers as the command-line
 * arguments and then outputs the result of the operator in the standard output.
 * If the passed operator is not from the list, it must output the string "Unknown operator" without quotes.
 */
public class CliBasicCalculator {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;	
        }

        if (args[0].equals("--help")) {
            System.out.println("# Help for CliBasicCalculator ------------ #");
            System.out.println("# Make an addition : 10 + 10 (int result)");
            System.out.println("# Make a subtraction : 20 - 10 (int result)");
            System.out.println("# Make a multiplication : 20 * 10 (int result)");
            System.out.println("# Make a division : 20 / 10 (float result)");
			System.out.println("# Example : java CliBasicCalculator 10 + 10");
            System.out.println("# End help ------------------------------- #");
            return;
        }
		try {
			int number1 = Integer.parseInt(args[0]);
			String operator = args[1];
			int number2 = Integer.parseInt(args[2]);
			int result = 0;

			switch (operator) {
				case "+" -> {
					result = number1 + number2;
					System.out.println("Result: " + result);
				}
				case "-" -> {
					result = number1 - number2;
					System.out.println("Result: " + result);
				}
				case "*" -> {
					result = number1 * number2;
					System.out.println("Result: " + result);
				}
				case "/" -> {
					float floatResult = (float) (number1 / number2);
					System.out.println("Result: " + floatResult);
				}
				default -> System.out.println("Unknown operator");
			}
		} catch (Exception e) {
			System.out.println("An orror occured during the process.");
		}
        
    }
}
