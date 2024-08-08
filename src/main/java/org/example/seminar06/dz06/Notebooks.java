package org.example.seminar06.dz06;

import java.util.Map;
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

    public String getPARAM(int param) {
        switch (param) {
            case 1:
                return String.valueOf(id);
            case 2:
                return String.valueOf(RAM);
            case 3:
                return String.valueOf(ROM);
            case 4:
                return String.valueOf(CPU);
            case 5:
                return String.valueOf(OS);
            case 6:
                return String.valueOf(Color);
            default:
                return "";
        }
    }

    public boolean isSelected(Map<Integer, String> params) {
        for (Map.Entry<Integer, String> entry : params.entrySet()) {
            if (entry.getKey() < 4) {
                if (Integer.parseInt(getPARAM(entry.getKey())) < Integer.parseInt(entry.getValue())) return false;
            } else {
                if (!getPARAM(entry.getKey()).contains(entry.getValue())) return false;
            }
        }
        return true;
    }
}
