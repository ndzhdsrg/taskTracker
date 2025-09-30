package model;

public class Task {
    public String title;   // название задачи
    public String status;  // статус: "TODO" или "DONE"
    public int deadLine;   // сколько дней осталось до дедлайна

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
}
