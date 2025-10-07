package model;

public class Task {
    private String title;   // название задачи
    private String status;  // статус: "TODO" или "DONE"
    private int deadLine;   // сколько дней осталось до дедлайна


    public static void taskSwitchCase(Task t) {
        switch (t.getStatus()) {                                // выбираем по статусу
            case "TODO":                                   // если статус TODO
                System.out.println("📝 Задача ещё не начата");
                break;                                     // выход из switch
            case "DONE":                                   // если статус DONE
                System.out.println("✅ Задача завершена");
                break;
            default:                                       // если ни один вариант не подошёл
                System.out.println("❓ Неизвестный статус");
        }
    }

    public static void ifTask(Task t) {
        // if c ветвлением
        if (t.getDeadLine() < 0) {                                    // дедлайн прошёл
            System.out.println("🔴 КРАСНЫЙ: задача просрочена");
        } else if (t.getDeadLine() == 0) {                            // дедлайн сегодня
            System.out.println("🟠 ОРАНЖЕВЫЙ: дедлайн сегодня");
        } else {                                                 // дедлайн в будущем
            System.out.println("🟢 ЗЕЛЁНЫЙ: ещё есть время");
        }
    }

    public static void conditionOperationTask(Task t) {
        //ВТОРОЙ ЭТАП
        // Сравнения только для числовых типов (int, long, double, byte, short, float, char)
        System.out.println(t.getDeadLine() == 0);  // true, дедлайн сегодня
        System.out.println(t.getDeadLine() != 0);  // false, не отличается от нуля
        System.out.println(t.getDeadLine() > 0);   // false, дней больше нуля нет
        System.out.println(t.getDeadLine() < 1);   // true, дней меньше одного (срочно!)
        System.out.println(t.getDeadLine() >= 0);  // true, дедлайн сегодня — это "ноль или больше"
        System.out.println(t.getDeadLine() <= 0);  // true, срок не в будущем

        // Сравнения для строк делаются через .equals()
        System.out.println(t.getStatus().equals("TODO"));      // true, статус именно TODO
        System.out.println(!t.getStatus().equals("TODO"));     // false, статус не отличается от TODO
        System.out.println(t.getStatus().equals("DONE"));      // false, статус не DONE
        System.out.println(!t.getStatus().equals("DONE"));     // true, статус отличается от DONE
    }

    public static void ifTaskSimple(Task t) {
        //простой if
        if (t.getStatus().equals("DONE")) {                  // сравниваем строки через equals
            System.out.println("✅ Задача выполнена");
        } else {
            System.out.println("⏳ Задача ещё не готова");
        }
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", daysLeft=" + deadLine +
                '}';
    }

    public Task(String title, String status, int daysLeft) {
        this.title = title;
        this.status = status;
        this.deadLine = daysLeft;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(int deadLine) {
        this.deadLine = deadLine;
    }
}
