public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");
        Boss boss = new Boss("Evil Boss", 1000, 50, bossWeapon);
        System.out.println(boss.printInfo());

        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Longbow");
        Skeleton skeleton1 = new Skeleton("Skeleton Warrior", 100, 10, skeletonWeapon1, 20);

        Weapon skeletonWeapon2 = new Weapon(WeaponType.AXE, "Battle Axe");
        Skeleton skeleton2 = new Skeleton("Skeleton Berserker", 150, 15, skeletonWeapon2, 10);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}