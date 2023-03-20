public class Main {
	public static void main(String[] args) {
		taskOne();
		taskTwo();
		taskThree();
		taskFour();
		taskFive();
		taskSix();
		taskSeven();
		taskEight();
		taskNine();
		taskTen();

	}

	static void taskOne() {
		System.out.println("Задача 1");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	static void taskTwo() {
		System.out.println("Задача 2");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}

	static void taskThree() {
		System.out.println("Задача 3");
		for (int i = 0; i <= 17; i = i + 2) {
			System.out.println(i);
		}
	}

	static void taskFour() {
		System.out.println("Задача 4");
		for (int i = 10; i >= -10; i--) {
			System.out.println(i);
		}
	}

	static void taskFive() {
		System.out.println("Задача 5");
		for (int i = 1904; i <= 2096; i += 4) {
			System.out.println(i + " год является високосным");
		}
	}

	static void taskSix() {
		System.out.println("Задача 6");
		for (int i = 7; i <= 98; i += 7) {
			System.out.println(i);
		}
	}

	static void taskSeven() {
		System.out.println("Задача 7");
		for (int i = 1; i <= 512; i *= 2) {
			System.out.println(i);
		}
	}

	static void taskEight() {
		System.out.println("Задача 8");
		int saving = 29000;
		int total = 0;
		for (int i = 1; i <= 12; i++) {
			total = total + saving;
			System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
		}
	}

	static void taskNine() {
		System.out.println("Задача 9");
		double saving = 29000;
		double total = 0;
		for (int i = 1; i <= 12; i++) {
			total = total + total / 100;
			total = total + saving;
			System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
		}
	}

	static void taskTen() {
		System.out.println("Задача 10");
		int product = 0;
		for (int i = 1; i <= 10; i++) {
			product = 2 * i;
			System.out.println(2 + "*" + i + "=" + product);
		}
	}
}