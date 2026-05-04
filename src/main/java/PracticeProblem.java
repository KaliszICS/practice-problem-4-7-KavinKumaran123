public class PracticeProblem {

	public static void main(String args[]) {

	}

	// validateAge
	public static boolean validateAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}
		if (age > 150) {
			throw new IllegalArgumentException("Age must be realistic");
		}
		return true;
	}

	// withdraw
	public static double withdraw(double amount, double balance) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be positive");
		}
		if (balance - amount < 0) {
			throw new IllegalStateException("Insufficient balance");
		}
		return balance - amount;
	}

	// getElement
	public static int getElement(int[] array, int index) {
		if (array == null) {
			throw new NullPointerException("Array cannot be null");
		}
		if (index < 0 || index >= array.length) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		return array[index];
	}

	// validateEmail
	public static String validateEmail(String email) {
		if (email == null || email.trim().isEmpty()) {
			throw new IllegalArgumentException("Email cannot be empty");
		}

		email = email.trim();

		int atIndex = email.indexOf('@');
		if (atIndex == -1) {
			throw new IllegalArgumentException("Invalid email format");
		}

		int dotIndex = email.indexOf('.', atIndex);
		if (dotIndex == -1) {
			throw new IllegalArgumentException("Invalid email format");
		}

		return email;
	}
}