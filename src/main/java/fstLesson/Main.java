package fstLesson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String house = "   /\\\n" +
                "  /  \\\n" +
                " /____\\\n" +
                " |    |\n" +
                " | [] |\n" +
                " |____|";
        System.out.println(house);


        System.out.println("Сердце ❤️");

        char smile = '\u263A';

        System.out.println(smile);

        int version = 1;                 // целое число (примитив)
        String appName = "Task Tracker"; // строка (ссылочный тип)

        System.out.println(appName + version);   // вызов нашего метода

        // мини-демо "задачи" — просто строка, без классов и коллекций
        String task = "Познакомиться с IntelliJ IDEA";
        System.out.println(task);

        printVersion(version);
        System.out.println(smile);
    }


    public static void printVersion(Integer version) {
        System.out.println(version);
        int newVersion = version + 1;
        System.out.println(newVersion);
    }


}