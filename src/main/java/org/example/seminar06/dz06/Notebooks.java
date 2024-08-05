package org.example.seminar06.dz06;

import java.util.Objects;

public class Notebooks {
    int id;
    int RAM;
    int ROM;
    String CPU;
    String OS;
    String Color;

    @Override
    public String toString() {
        return "Notebooks{" +
                "id=" + id +
                ", RAM=" + RAM +
                ", ROM=" + ROM +
                ", CPU='" + CPU + '\'' +
                ", OS='" + OS + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }

    public String getOS() {
        return OS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebooks notebooks = (Notebooks) o;
        return id == notebooks.id && RAM == notebooks.RAM && ROM == notebooks.ROM && Objects.equals(CPU, notebooks.CPU) && Objects.equals(OS, notebooks.OS) && Objects.equals(Color, notebooks.Color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, RAM, ROM, CPU, OS, Color);
    }
}
