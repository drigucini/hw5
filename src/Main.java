public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Task 1");
        int clientOS = 0; //type of software 1 - android, 0 - iOS
        if (clientOS == 0) {
            System.out.println("Download the app for iOS, following the link\n");
        } else {
            System.out.println("Download the app for Android, following the link\n");
        }

    }

    public static void task2 () {
        System.out.println("Task 2");
        int clientOS = 1; //type of software 1 - android, 0 - iOS
        int clientDeviceYear = 2012; //year of the device
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Download the app for iOS, following the link\n");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Download the light version of the app for iOS, following the link\n");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Download the app for Android, following the link\n");
        } else {
            System.out.println("Download the light version of the app for Android, following the link\n");
        }
    }

    public static void task3 () {
        System.out.println("Task 3");
        var year = 2100; // year to be checked
        int everyFour = year%4; //every 4 years - a leap year
        int everyHundred = year%100; //every 100 years - not a leap year
        int everyFourHundred = year%400; //every 400 years - a leap year
        boolean a = everyFour == 0;
        boolean b = everyHundred == 0;
        boolean c = everyFourHundred == 0;
        if (c) {
            System.out.println("The year of " + year + " is a leap year\n");
        } else if (b) {
            System.out.println("The year of " + year + " is not a leap year\n");
        } else if (a) {
            System.out.println("The year of " + year + " is a leap year\n");
        } else {
            System.out.println("The year of " + year + " is not a leap year\n");
        }
    }

    public static void task4 () {
        System.out.println("Task 4");
        int deliveryDistance = 25; // distance from the main office [km]
        if (deliveryDistance > 100) {
            System.out.println("No delivery available\n");
        } else if (deliveryDistance > 60) {
            System.out.println("Delivery will take 3 days\n");
        } else if (deliveryDistance > 20) {
            System.out.println("Delivery will take 2 days\n");
        } else {
            System.out.println("Delivery will take 1 day\n");
        }
    }

    public static void task5 () {
        System.out.println("Task 5");
        int monthNumber = 15; // number of the month
        switch (monthNumber) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Fall");
                break;
            case 10:
                System.out.println("Fall");
                break;
            case 11:
                System.out.println("Fall");
                break;
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Enter a valid month number");
        }
    }
}