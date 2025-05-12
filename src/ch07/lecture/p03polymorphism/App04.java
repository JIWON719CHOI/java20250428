package ch07.lecture.p03polymorphism;

public class App04 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.walk();
        hero.pickWeapon(new Gun());
        hero.attack();

        hero.walk();
        hero.pickWeapon(new Sword());
        hero.attack();

        hero.walk();
        hero.pickWeapon(new Bow());
        hero.attack();
    }

}

class Weapon {
    public void use() {
        System.out.println("Use Weapon💥");
    }
}

class Gun extends Weapon {
    @Override
    public void use() {
        System.out.println("Shot Gun🔫");
    }
}

class Bow extends Weapon {
    @Override
    public void use() {
        System.out.println("Shot Bow🏹");
    }
}

class Sword extends Weapon {
    @Override
    public void use() {
        System.out.println("Use Sword⚔️");
    }
}

class Hero {
    private Weapon weapon;

    public void pickWeapon(Weapon weapon) {
        System.out.println("Pick and Change Weapon🔄️");
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println("Attack🏃‍♂️");
    }

    public void walk() {
        System.out.println("Walk🚶‍♂️");
    }
}
