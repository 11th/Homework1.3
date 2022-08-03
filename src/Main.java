public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        byte clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }

        //Task 2
        System.out.println("Task 2");
        int clientDeviceYear = 2014;
        boolean isOldModel = clientDeviceYear < 2015;
        switch (clientOS) {
            case 0:
                if (isOldModel)
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                else
                    System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                if (isOldModel)
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                else
                    System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }

        //Task 3
        System.out.println("Task 3");
        int year = 1986;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");

        //Task 4
        System.out.println("Task 4");
        int deliveryDistance = 99;
        int days = 0;
        if (deliveryDistance < 20)
            days+=1;
        else if (deliveryDistance >= 20 && deliveryDistance < 60)
            days+=2;
        else if (deliveryDistance >= 60 && deliveryDistance < 100)
            days+=3;
        else
            days+=4;
        System.out.println("Потребуется дней: " + days);

        //Task 5
        System.out.println("Task 5");
        int monthNumber = 11;
        switch (monthNumber){
            case 12: case 1: case 2:
                System.out.println("зима");
                break;
            case 3: case 4: case 5:
                System.out.println("весна");
                break;
            case 6: case 7: case 8:
                System.out.println("лето");
                break;
            case 9: case 10: case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("не верное значение месяца!");
        }
    }
}