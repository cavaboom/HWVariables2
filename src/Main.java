public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        byte apple = 10;
        System.out.println("Значение переменной apple с типом byte равно " + apple);
        short carWeight = 1500;
        System.out.println("Значение переменной carWeight с типом short равно " + carWeight);
        int peoples = 783700000;
        System.out.println("Значение переменной peoples с типом int равно " + peoples);
        long money = 9223372036854775807L;
        System.out.println("Значение переменной money с типом long равно " + money);
        float thing = 3.15F;
        System.out.println("Значение переменной a с типом float равно " + thing);
        double horse = 9.65;
        System.out.println("Значение переменной b с типом double равно " + horse);
        // Задача 2
        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        boolean d = false;
        short e = 569;
        short f = -159;
        int g = 27897;
        byte h = 67;
        // Задача 3
        System.out.println("Задача 3");
        int firstClass = 23;
        int secondClass = 27;
        int thirdClass = 30;
        int paper = 480;
        int allStudents = firstClass + secondClass + thirdClass;
        System.out.println("На каждого ученика рассчитано " + paper / allStudents + " листов бумаги");
        // Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int performance = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела бутылок " + performance * twentyMinutes + " штук");
        int day = 24 * 60;
        System.out.println("За сутки машина произвела бутылок " + performance * day + " штук");
        int threeDays = day * 3;
        System.out.println("За 3 дня машина произвела бутылок " + performance * threeDays + " штук");
        int oneMonth = day * 31;
        System.out.println("За месяц машина произвела бутылок " + performance * oneMonth + " штук");
        // Задача 5
        System.out.println("Задача 5");
        int totalPaints = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int classes = totalPaints / (whitePaint + brownPaint);
        System.out.println("В школе, где " +classes+ " классов, нужно " +whitePaint * classes+ " банок белой краски и " +brownPaint * classes+ " банок коричневой краски");
        // Задача 6
        System.out.println("Задача 6");

    }
}

