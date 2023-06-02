package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Laptop {
    private int RAM, capacityDisk;
    private String operSystem, color;

    public Laptop(int RAM, int capacityDisk, String operSystem, String color) {
        this.RAM = RAM;
        this.capacityDisk = capacityDisk;
        this.operSystem = operSystem;
        this.color = color;
    }

    public Laptop() {
    }

    @Override
    public String toString() {
        return "RAM=" + RAM +
                ", capacityDisk=" + capacityDisk +
                ", operSystem='" + operSystem + '\'' +
                ", color='" + color + '\''+'\n';
    }


    public int getRAM() {
        return RAM;
    }

    public int getCapacityDisk() {
        return capacityDisk;
    }

    public String getOperSystem() {
        return operSystem;
    }

    public String getColor() {
        return color;
    }
}
