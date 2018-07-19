package jmockit;

public class Student {
    private final String name;
    private final int age;
    private final Clothes clothes;

    public Student(String name, int age, Clothes clothes) {
        this.name = name;
        this.age = age;
        this.clothes = clothes;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Clothes getClothes() {
        return clothes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", clothes=" + clothes.toString() +
                '}';
    }
}
