package practice.task2;

/*
* Создайте перечислительный тип (enum) Vehicles,
* содержащий конструктор, который должен принимать целочисленное значение (стоимость автомобиля),
* содержать метод getColor(), который возвращает строку с цветом автомобиля,
* и содержать перегруженный метод toString(), который должен возвращать строку с названием экземпляра,
* цветом и стоимостью автомобиля.
* */

public enum Vechicles {
    MERCEDES(1000) {
        @Override
        String getColor() {
            return " color=Black";
        }
    },

    AUDI (800) {
        @Override
        String getColor() {
            return " color=White";
        }
    },

    VOLKSWAGEN(700) {
        @Override
        String getColor() {
            return " color=Red";
        }
    };

    private int price;

    private Vechicles(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name() +
                " " +
                "price=" + price +
                getColor()
                ;
    }

    abstract String getColor();
}
