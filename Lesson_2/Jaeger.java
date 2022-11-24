public class Jaeger {
    private String name;
    private int speed;
    private int strength;
    private int armor;
    private int health;
    private boolean alive;
    private boolean moving;

    public Jaeger() {
        alive = true;
        health = 10;
        System.out.println("New robot is assembled");
    }

    public Jaeger(String name, int speed, int strength, int armor) {
        this.name = name;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        alive = true;
        health = 10;
        System.out.println(name + " is assembled");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public boolean getAlive() {
        return alive;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void move() {
        moving = true;
        System.out.println(name + " is moving");
    }

    public void stop() {
        moving = false;
        System.out.println(name + " is stopped");
    }

    public void repair() {
        repair(2);
    }

    public void repair(int repairUnits) {
        if (moving)
            System.out.printf("You can't repair %s while moving.\n", name);
        else {
            if (health == 0)
                alive = true;

            health += repairUnits;

            if (health > 10)
                health = 10;
            System.out.printf("%s is repaired (by %d units). Health %d .\n",
                    name, repairUnits, health);
        }
    }

    public void attack(Jaeger target) {
        System.out.println(name + " attacks " + target.getName());

        int damage = strength;
        if (moving)
            damage /= 2;
        target.hit(damage);
    }

    public void hit(int damage) {
        int strikeDamage = damage / armor;
        if (moving)
            strikeDamage /= 2;
        if (strikeDamage == 0)
            strikeDamage = 1;
        health -= strikeDamage;

        System.out.println(name + ": damage received " + strikeDamage);
        if (health <= 0) {
            alive = false;
            health = 0;
            System.out.println(name + " destroyed.");
        } else
            System.out.println(name + ": Health - " + health);
    }
}