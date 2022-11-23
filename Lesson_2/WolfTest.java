public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setSex('M');
        wolf1.setName("Woofy");
        wolf1.setWeight(33);
        wolf1.setAge(6);
        wolf1.setColor("Grey");

        System.out.println("Волк: " + wolf1.getName());
        System.out.println("Пол: " + wolf1.getSex());
        System.out.println("Вес: " + wolf1.getWeight());
        System.out.println("Возраст: " + wolf1.getAge());
        System.out.println("Цвет: " + wolf1.getColor());

        wolf1.walk();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}