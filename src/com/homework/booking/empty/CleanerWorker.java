package com.homework.booking.empty;

public class CleanerWorker extends Worker {

    private String name;
    private int experience;

    public CleanerWorker(String name, int experience) {
        super(name,experience);
    }

    @Override
    public String toString() {
        return "CleanerWorker{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
