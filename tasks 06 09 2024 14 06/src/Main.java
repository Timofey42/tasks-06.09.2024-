import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       "задача 1 Четное или нечетное число"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("Четное");
//        } else {
//            System.out.println("Нечетное");
//        }

//        "задача 2 Минимальное из трех чисел"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите три числа: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int min = Math.min(a, Math.min(b, c));
//        System.out.println("Минимальное число: " + min);

//        "задача 3 Таблица умножения"
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("5 * " + i + " = " + (5 * i));
//        }

//        "задача 4 Сумма чисел от 1 до N"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число N: ");
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println("Сумма: " + sum);

//        "задача 5 Число Фибоначчи"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число N: ");
//        int n = scanner.nextInt();
//        int a = 0, b = 1;
//        System.out.print("Первые " + n + " чисел Фибоначчи: ");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a + " ");
//            int sum = a + b;
//            a = b;
//            b = sum;
//        }

//        "задача 6 Проверка простого числа"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        boolean isPrime = num > 1;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) {
//            System.out.println("Простое");
//        } else {
//            System.out.println("Не является простым");
//        }

//        "задача 7 Обратный порядок чисел"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число N: ");
//        int n = scanner.nextInt();
//        for (int i = n; i >= 1; i--) {
//            System.out.print(i + " ");
//        }

//        "задача 8 Сумма четных чисел"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите два числа A и B: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int sum = 0;
//        for (int i = a; i <= b; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("Сумма четных чисел: " + sum);

//        "задача 9 Реверс строки"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        String reversed = new StringBuilder(input).reverse().toString();
//        System.out.println("Перевернутая строка: " + reversed);

//        "задача 10 Количество цифр в числе"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        int digits = String.valueOf(Math.abs(num)).length();
//        System.out.println("Количество цифр: " + digits);

//        "задача 11 Факториал числа"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число N: ");
//        int n = scanner.nextInt();
//        long factorial = 1;
//        for (int i = 2; i <= n; i++) {
//            factorial *= i;
//        }
//        System.out.println("Факториал: " + factorial);

//        "задача 12 Сумма цифр числа"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        int sum = 0;
//        while (num != 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//        System.out.println("Сумма цифр: " + sum);

//        "задача 13 Палиндром"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine();
//        String reversed = new StringBuilder(str).reverse().toString();
//        if (str.equals(reversed)) {
//            System.out.println("Палиндром");
//        } else {
//            System.out.println("Не является палиндромом");
//        }

//        "задача 14 Найти максимальное число в массиве"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива: ");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int max = array[0];
//        for (int i : array) {
//            if (i > max) {
//                max = i;
//            }
//        }
//        System.out.println("Максимальное число: " + max);

//        "задача 15 Сумма всех элементов массива"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        int sum = 0;
//        System.out.println("Введите элементы массива: ");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//            sum += array[i];
//        }
//        System.out.println("Сумма элементов: " + sum);

//        "задача 16 Количество положительных и отрицательных чисел"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        int positiveCount = 0, negativeCount = 0;
//        System.out.println("Введите элементы массива: ");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//            if (array[i] > 0) {
//                positiveCount++;
//            } else if (array[i] < 0) {
//                negativeCount++;
//            }
//        }
//        System.out.println("Положительных чисел: " + positiveCount);
//        System.out.println("Отрицательных чисел: " + negativeCount);

//        "задача 17 Простые числа в диапазоне"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите два числа A и B: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        for (int i = a; i <= b; i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static boolean isPrime(int num) {
//        if (num < 2) return false;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) return false;
//        }
//        return true;

//        "задача 18 Подсчет гласных и согласных в строке"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine().toLowerCase();
//        int vowelsCount = 0, consonantsCount = 0;
//        for (char ch : str.toCharArray()) {
//            if (ch >= 'a' && ch <= 'z') {
//                if ("aeiou".indexOf(ch) != -1) {
//                    vowelsCount++;
//                } else {
//                    consonantsCount++;
//                }
//            }
//        }
//        System.out.println("Гласные: " + vowelsCount);
//        System.out.println("Согласные: " + consonantsCount);

//        "задача 19 Перестановка слов в строке"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        String[] words = input.split(" ");
//        for (int i = words.length - 1; i >= 0; i--) {
//            System.out.print(words[i] + " ");
//        }

//        "задача 20 Число Армстронга"
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        int originalNum = num, sum = 0, digits = String.valueOf(num).length();
//        while (num != 0) {
//            sum += Math.pow(num % 10, digits);
//            num /= 10;
//        }
//        if (sum == originalNum) {
//            System.out.println("Число Армстронга");
//        } else {
//            System.out.println("Не является числом Армстронга");
//        }
    }
}