package homework;

/*
* Создайте перечислительный тип (enum) Animals,
* содержащий конструктор, который должен принимать целочисленное значение (возраст животного),
* и содержать перегруженный метод toString(), который должен возвращать название экземпляра и возраст животного.
* */

public enum Animals {
    TIGER(4), LION(5), ELEPHANT(10), MONKEY(1);

    private final int age;

    Animals(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return
                this.name() + " " +
                "age = " + age
                ;
    }
}
