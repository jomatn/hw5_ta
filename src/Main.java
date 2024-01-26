public class Main {
            public static void main(String[] args) {
                boss boss = new boss();
                boss.setBossHealth(450);
                boss.setBossAttack(45);
                boss.setBossSheild("Kinetic");
                System.out.println("Boss Information:");
                System.out.println("Boss health: " + boss.getBossHealth());
                System.out.println("Boss attack: "+ boss.getBossAttack());
                System.out.println("Boss sheild: "+ boss.getBossSheild());

                Hero[] heroes = createHeroes();


                System.out.println("\nHeroes Information:");
                for (Hero hero : createHeroes()) {
                    System.out.println("Health: " + hero.getHeroHealth());
                    System.out.println("Damage: " + hero.getHeroAttack());
                    System.out.println("Superpower: " + hero.getHeroSuperAbility());
                    System.out.println();
                }
            }
            public static Hero[] createHeroes() {
                Hero hero = new Hero(145,54,"fire");
                Hero heroOne = new Hero(145, 55, "thunder");
                Hero heroTwo = new Hero(100,30, "water");

                Hero[] heroes = {hero, heroOne, heroTwo};
                return heroes;
            }
        }
