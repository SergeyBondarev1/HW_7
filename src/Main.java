public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int saveMoney = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + saveMoney;
            month = month + 1;
            System.out.println("месяц " + month + " сумма накоплений " + total);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int birthRate = 17;
        int mortality = 8;
        int population = 12_000_000;
        int populationGrowth = birthRate - mortality;
        for (int year = 0; year <= 10; year++) {
            population = population + population / 1000 * populationGrowth;
            System.out.println("Год " + year + " Численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int investment = 15000;
        int percent = investment * 7 / 100;
        int month = 1;
        for (; investment < 12_000_000;) {
            investment = investment + percent;
            month = month + 1;
            System.out.println("месяц " + month + " накоплений " + investment);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int investment = 15000;
        int percent = investment * 7 / 100;
        int month = 1;
        while (investment < 12_000_000) {
            investment = investment + percent;
            month = month + 1;
            if (month % 6 == 0)
                System.out.println("месяц " + month + " накоплений " + investment);
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int investment = 15000;
        int percent = investment * 7 / 100;
        int month = 1;
        int total = 9 * 12;
        while (month < total) {
            investment = investment + percent;
            month = month + 1;
            if (month % 6 == 0)
                System.out.println("месяц " + month + " накоплений " + investment);
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 2;
        int day = 0;
        for (; day <= 31; day++) {
            if(day==firstFriday) {
                firstFriday = firstFriday + 7;
                System.out.println("Сегодня пятница " + firstFriday + "-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int first = 200;
        int last = 100;
        int yearNow = 2023;
        int start = 0;
        int comet = 79;
        int firstDate = yearNow - first;
        int lastDate = yearNow + last;
        for (int cometFalls = firstDate; cometFalls <= lastDate; cometFalls++){
            start = start + 1;
            if(cometFalls % comet ==0)

                System.out.println(cometFalls);
        }
    }
}
