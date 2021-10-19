package practice.task1;

public class Main {
    public static void main(String[] args) {
        Printable newspaper = new Printable() {
            @Override
            public void print() {
                System.out.println("Prints newspaper");
            }
        };

        Printable[] prints = {
                new Book(),
                new Magazine(),
                newspaper
        };

        for (Printable item : prints) {
            item.print();
        }
    }
}
