public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android");
        }
        //task 2
        System.out.println("Задание 2");
        int clientOs = 1;
        int clientDeviceYear = 2019;
        if (clientOs == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else  {
            System.out.println("Установите обычную версию приложения");
        }
        //task 3
        System.out.println("Задание 3");
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //task 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int distanceAddDay = 40;
        int deliveryDays = 1;
        int remainingDistance = deliveryDistance - 20;
        System.out.println("Потребуется дней: ");
        if (remainingDistance <= 0) {
            System.out.println(deliveryDays);
        } else {
            System.out.println(deliveryDays += remainingDistance/distanceAddDay + 1);
        }
        //task 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима. Январь");
                break;
            case 2:
                System.out.println("Зима. Февраль");
                break;
            case 3:
                System.out.println("Весна. Март");
                break;
            case 4:
                System.out.println("Весна. Апрель");
                break;
            case 5:
                System.out.println("Весна. Май");
                break;
            case 6:
                System.out.println("Лето. Июнь");
                break;
            case 7:
                System.out.println("Лето. Июль");
                break;
            case 8:
                System.out.println("Лето. Август");
                break;
            case 9:
                System.out.println("Осень. Сентябрь");
                break;
            case 10:
                System.out.println("Осень. Октябрь");
                break;
            case 11:
                System.out.println("Осень. Ноябрь");
                break;
            case 12:
                System.out.println("Зима. Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует. Пожалуйста, введите корректный номер от 1 до 12!");
                break;
        }
    }
}