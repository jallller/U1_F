package app;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

     List<T> tasks;

        Task task1 = new Task("something", "do something 1", LocalDate.of(11,10,2024));
        Task task2 = new Task("something new", "do something 2", LocalDate.of(11,10,2024));
        Task task3 = new Task("something totally new", "do something 3", LocalDate.of(11,10,2024));
        Task task4 = new Task("the same", "do something 4", LocalDate.of(11,10,2024));

        task1.add();



    }
}