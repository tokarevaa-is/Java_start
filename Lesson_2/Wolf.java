public class Wolf {
    char sex;
    String name;
    int weight;
    int age;
    String color;

    void walk() {
        System.out.println( name + " идёт.");
    }

    void sit() {
        System.out.println( name + " сидит.");
    }

    void run() {
        System.out.println( name + " бежит.");
    }

    void howl() {
        System.out.println( name + " воет.");
    }

    void hunt() {
        System.out.println( name + " охотится.");
    }
}