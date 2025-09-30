package org;

import model.Task;

public class Main {
    public static void main(String[] args) {
        //ПЕРВЫЙ ЭТАП
        /*
        создать задачу и заполнить данные БЕЗ конструктора
        минусы:
        1) надо прописывать присваивание значения каждому полю
        2) теряем инкапсуляцию - у каждого поля теперь модификатор доступа -
        public, а это значит что из любого класса к ним будет доступ
         */
//        Task t = new Task();
//        t.title = "Написать отчёт";
//        t.status = "TODO";
//        t.daysLeft = 3;

        /*
        создать задачу и заполнит данные С конструктором
        плюсы:
        1) короткая запись, все параметры передаются в одном месте
        2) можно сделать разные конструкторы
        3) сохраняет инкапсуляцию
         */
        Task t = new Task("Написать отчёт", "TODO", 0);

        System.out.println(t);

        //ВТОРОЙ ЭТАП
        // Сравнения только для числовых типов (int, long, double, byte, short, float, char)
        System.out.println(t.deadLine == 0);  // true, дедлайн сегодня
        System.out.println(t.deadLine != 0);  // false, не отличается от нуля
        System.out.println(t.deadLine > 0);   // false, дней больше нуля нет
        System.out.println(t.deadLine < 1);   // true, дней меньше одного (срочно!)
        System.out.println(t.deadLine >= 0);  // true, дедлайн сегодня — это "ноль или больше"
        System.out.println(t.deadLine <= 0);  // true, срок не в будущем

        // Сравнения для строк делаются через .equals()
        System.out.println(t.status.equals("TODO"));      // true, статус именно TODO
        System.out.println(!t.status.equals("TODO"));     // false, статус не отличается от TODO
        System.out.println(t.status.equals("DONE"));      // false, статус не DONE
        System.out.println(!t.status.equals("DONE"));     // true, статус отличается от DONE


    }
}