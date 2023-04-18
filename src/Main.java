public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("задача1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        int clientDeviceYear = 2014;
        int clientOS = 1;
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите приложение для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегчённую версию приложения для IOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите приложение для IOS по ссылке");
        }

    }

    public static void task3() {
        System.out.println("задача3");
        int year = 2021;
        if ((year % 4 ==0) || (year % 400 == 0) && (year % 100 != 0)) {
            System.out.println(year + "год високосный");
        } else {
            System.out.println(year + "год не високосный");

        }
    }
    public static void task4 () {
        System.out.println("Задача4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
    }

}
