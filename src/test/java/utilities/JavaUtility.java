package utilities;

import java.util.Random;

public class JavaUtility {
	public static int randomNumber;

	public static void getRandomNumber() {
		Random random = new Random();
		randomNumber = random.nextInt(100);
	}
}
