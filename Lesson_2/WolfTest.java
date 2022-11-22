public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.sex = 'M';
        wolf1.name = "Woofy";
        wolf1.weight = 33;
        wolf1.age = 6;
        wolf1.color = "Grey";

        System.out.println("Волк: " + wolf1.name);
        System.out.println("Пол: " + wolf1.sex);
        System.out.println("Вес: " + wolf1.weight);
        System.out.println("Возраст: " + wolf1.age);
        System.out.println("Цвет: " + wolf1.color);

        wolf1.walk();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}