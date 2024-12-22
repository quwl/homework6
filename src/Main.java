public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int i = 1;
        for (; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задание 2");
        int a = 10;
        for (; a > 0; a--) {
            System.out.println(a);
        }
        System.out.println("Задание 3");
        int b = 0;
        for (; b <= 17; b += 2) {
            System.out.println(b);
        }
        System.out.println("Задание 4");
        int c = 10;
        for (; c >= -10; c--) {
            System.out.println(c);
        }
        System.out.println("Задание 5");
        int d = 1904;
        for (; d <= 2096; d += 4) {
            System.out.println(d + " год является високосным");
        }
        System.out.println("Задание 6");
        int e = 7;
        for (; e <= 98; e += 7) {
            System.out.println(e);
        }
        System.out.println("Задание 7");
        int f = 1;
        for (; f <= 512; f *= 2) {
            System.out.println(f);
        }
        System.out.println("Задание 8");
        int sum = 0;
        for (int g = 0; g < 12; g++) {
            sum += 29000;
            System.out.println("Месяц " + g + " Сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задание 9");
        int total = 0;
        int money = 29000;
        for (int k = 0; k < 12; k++) {
            total += total/100;
            total += money;
            System.out.println("Месяц " + k + " Сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задание 10");
        for (int l = 1; l <= 10; l++) {
            int result = l * 2;
            System.out.println("2*" + l + " = " + result);
        }
    }
}