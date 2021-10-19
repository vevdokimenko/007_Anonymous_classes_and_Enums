package practice.task2;

/*
* Создайте перечислительный тип (enum) Vehicles,
* содержащий конструктор, который должен принимать целочисленное значение (стоимость автомобиля),
* содержать метод getColor(), который возвращает строку с цветом автомобиля,
* и содержать перегруженный метод toString(), который должен возвращать строку с названием экземпляра,
* цветом и стоимостью автомобиля.
* */

public enum Vehicles {
    MERCEDES(1000) {
        @Override
        String getColor() {
            return "Black";
        }
    },

    AUDI (800) {
        @Override
        String getColor() {
            return "White";
        }
    },

    VOLKSWAGEN(700) {
        @Override
        String getColor() {
            return "Red";
        }
    };

    private final int price;

    Vehicles(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name() + " " +
                "price=" + price + " " +
                "color=" + getColor()
                ;
    }

    abstract String getColor();
}
