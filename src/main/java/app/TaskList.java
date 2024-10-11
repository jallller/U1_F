package app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskList<T extends Task> {

    private List<T> tasks;

    //Adds task to the list

    private void add(T task) {
        tasks.add(task);
    }

    //Sort tasks by due date
    public void sortByDueDate(List<T> tasks) {
        tasks.stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .forEach(System.out::println);
    }
    //Get dates that are due today

    public void getDueDateToday(List<T> tasks) {
        tasks.stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .forEach(System.out::println);

    }

}

