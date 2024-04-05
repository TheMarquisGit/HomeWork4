public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        char clientOS = 0;
        String iOS = "Установите версию приложения для iOS по ссылке";
        String android = "Установите версию приложения для Android по ссылке";
        if (clientOS == 0) {
            System.out.println(iOS);
        } else System.out.println(android);

        //Задача 2
        System.out.println("\nЗадача 2");
        short clientDeviceYear = 2015;
        String iOSLite = "Установите облегченную версию приложения для iOS по ссылке";
        String androidLite = "Установите облегченную версию приложения для Android по ссылке";
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println(iOSLite);
            } else System.out.println(androidLite);
        } else if (clientOS == 0) {
            System.out.println(iOS);
        } else System.out.println(android);

        //Задача 3
        System.out.println("\nЗадача 3");
        short year = 4;
        if (year > 1584 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year > 1584 && year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");

        //Задача 4
        System.out.println("\nЗадача 4");
        byte deliveryDistance = 95;
        String message = "Потребуется дней: ";
        if (deliveryDistance < 20) {
            System.out.println(message + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println(message + 2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println(message + 3);
        } else System.out.println("Доставки нет");

        //Задача 5
        System.out.println("\nЗадача 5");
        byte monthNumber = 12;
        if (monthNumber <= 12 && monthNumber > 0)
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