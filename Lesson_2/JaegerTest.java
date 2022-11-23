public class JaegerTest {
    public static void main(String[] args) {

        // Инициализация роботов
        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", 9, 8, 2);
        Jaeger tacitRonin = new Jaeger();
        tacitRonin.setName("Tacit Ronin");
        tacitRonin.setSpeed(8);
        tacitRonin.setStrength(7);
        tacitRonin.setArmor(3);

        // Выполнение действий
        crimsonTyphoon.move();
        crimsonTyphoon.attack(tacitRonin);
        crimsonTyphoon.attack(tacitRonin);

        tacitRonin.attack(crimsonTyphoon);
        tacitRonin.repair();

        crimsonTyphoon.repair();
        crimsonTyphoon.stop();
        crimsonTyphoon.repair();

        tacitRonin.attack(crimsonTyphoon);
        tacitRonin.attack(crimsonTyphoon);
        tacitRonin.attack(crimsonTyphoon);
        tacitRonin.attack(crimsonTyphoon);
    }
}