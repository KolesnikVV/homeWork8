import java.sql.SQLOutput;

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
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total += deposit;
            month = month + 1;
            System.out.println("месяц " + month + " сумма накоплений равна " + total + " рублей");}
    }
    public static void task2(){
        System.out.println("Задача 2");
        int a = 0;
        while(a < 10){
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");}
        System.out.println();
        }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000; // численность насиления
        int birthrate = 17; // рождаемость на 1000 чел.
        int deathRate = 8;// смертность на 1000 чел.
        int totalPopulationInOneYear = (birthrate - deathRate) * 12000;
        for (int i = 1; i <= 10; i++) {
            population += totalPopulationInOneYear;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }

    public static void task4(){
        System.out.println("Задача 4");
        int deposit = 15000;
        for (int i = 1; deposit < 12_000_000; i++){
            int interestRate = (deposit / 100) * 7;
            deposit += interestRate;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");}
    }

    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        for (int i = 1; deposit < 12_000_000; i++) {
            int interestRate = (deposit / 100) * 7;
            deposit += interestRate;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        int month = 108; // 9 лет / 12 месяцев
        for (int i = 1; i <= 108; i++) {
            int interestRate = (deposit / 100) * 7;
            deposit += interestRate;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
    }
    public static void task7(){
        System.out.println("Задача 7");
    int monthDay = 31;
    int firstFriday = 7;
        System.out.println("Сегодня пятница," + firstFriday + "-е число. Необходимо подготовить отчет");
    while (firstFriday < monthDay){
        firstFriday = firstFriday + 7;
        if (firstFriday <= monthDay){
            System.out.println("Сегодня пятница," + firstFriday + "-е число. Необходимо подготовить отчет");
        }
    }
    }
    public static void task8(){
        System.out.println("Задача 8");
        int cometFlybyYear = 79;
        int calculationStart = 1823;
        int calculationStop = 2123;
        for (int i = 0; i < calculationStop; i += cometFlybyYear) {
            if (i > calculationStart && i < calculationStop){
                System.out.println(i);}
            }

        }
    }
