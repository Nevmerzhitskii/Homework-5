public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");

        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        }

        System.out.println("Задача №2");

        int clientDeviceYear = 14;



         if (clientDeviceYear < 15 && clientOS == 1) {
             System.out.println("Установите облегченную версию приложения для iOS по ссылке");
         }

            else if ( clientDeviceYear < 15 && clientOS == 0) {
             System.out.println("Установите облегченную версию приложения для Android по ссылке ");
         }
            if (clientDeviceYear >= 15 && clientOS == 1) {
                System.out.println("Установите версию приложения для iOS по ссылке " );

            }else if (clientDeviceYear >= 15 && clientOS == 0)
                System.out.println("Установите версию приложения для Android по ссылке" );



         System.out.println("Задача №3");

         int year = 1601;


         if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
             System.out.println(  year + " Год является високосным" );
         }else {
             System.out.println(year + " Год не является високосным" );
         }

        System.out.println("Задача №4");

        int deliveryDistance = 101;
        int diliveryDays = 1;

        if (deliveryDistance <= 20 ) {
            System.out.println("На доставку подтребуется " + diliveryDays + " дней");
        }else if (deliveryDistance > 20 && deliveryDistance <= 60 ) {
            System.out.println(" На доставку потребуется " + (diliveryDays + 1) + " дней");
        }else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println(" На доставку потребуется " + (diliveryDays + 2) + " дней" );
        }
        else {
            System.out.println( "Доставка не производится ");
        }

        System.out.println("Задача №5");

        int monthNumber =12;
        String season;


        switch (monthNumber){
            case 1 : season = ("Зима");
                System.out.println(season);
                break;

            case 2 :season = ("Зима");
                System.out.println(season);
            case 3 : season = ("Весна");
                System.out.println(season);
            case 4 :  season = ("Весна");
                System.out.println(season);
            case 5 :  season = ("Весна");
                System.out.println(season);
            case 6 :  season = ("Лето");
                System.out.println(season);
            case 7 : season = ("Лето");
                System.out.println(season);
            case 8 : season = ("Лето");
                System.out.println(season);
            case 9 : season = ("Осень");
                System.out.println(season);
            case 10 : season = ("Осень");
                System.out.println(season);
            case 11 : season = ("Осень");
                System.out.println(season);
            case 12 : season = ("Зима");
                System.out.println(season);

            default :
                System.out.println( "Нет такого месяца");

        }











    }  }

