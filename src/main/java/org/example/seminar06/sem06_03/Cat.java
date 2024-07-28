package org.example.seminar06.sem06_03;

import java.util.Objects;

public class Cat {
    int id;
    String name;
    int age;
    String sex;
    String evner;
    String color;

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name=" + name +
                ", color=" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && age == cat.age && Objects.equals(name, cat.name) && Objects.equals(sex, cat.sex) && Objects.equals(evner, cat.evner) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex, evner, color);
        //return 1;
    }
}
