package practice.task2;

/*
 * Создайте перечислительный тип (enum) Vehicles,
 * содержащий конструктор, который должен принимать целочисленное значение (стоимость автомобиля),
 * содержать метод getColor(), который возвращает строку с цветом автомобиля,
 * и содержать перегруженный метод toString(), который должен возвращать строку с названием экземпляра,
 * цветом и стоимостью автомобиля.
 * */

public class Main {
    public static void main(String[] args) {
        System.out.println(Vehicles.MERCEDES);
        System.out.println(Vehicles.AUDI);
        System.out.println(Vehicles.VOLKSWAGEN);
    }
}
