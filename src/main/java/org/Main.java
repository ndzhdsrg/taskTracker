package org;

import model.Task;

public class Main {
    public static void main(String[] args) {
        Task t = new Task("Написать отчёт", "TODO", 0);


        Task.conditionOperationTask(t);
        Task.ifTaskSimple(t);
        Task.ifTask(t);
        // switch-case
        Task.taskSwitchCase(t);


    }
}

