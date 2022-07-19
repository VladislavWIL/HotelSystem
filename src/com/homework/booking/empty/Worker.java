package com.homework.booking.empty;

import com.homework.booking.interfaces.IWorker;

public abstract class Worker implements IWorker {

    private String name;
    private int experience;

    public Worker(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
