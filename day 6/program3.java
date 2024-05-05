class Apple {
    void show() {
        System.out.println("This is the show() method of class Apple.");
    }
}

class Banana extends Apple {

    void show() {
        System.out.println("This is the show() method of class Banana.");
    }
}

class Cherry extends Apple {

    void show() {
        System.out.println("This is the show() method of class Cherry.");
    }
}

public class program3 {
    public static void main(String[] args) {

        Apple fruit1 = new Apple();
        fruit1.show();

        Apple fruit2 = new Banana();
        fruit2.show();

        Apple fruit3 = new Cherry();
        fruit3.show();
    }
}
