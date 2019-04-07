public class MainClass {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Skotobaza", 10), new Cat("Murka", 15), new Cat("Koshak", 20)
        };
        Bowl bowl = new Bowl(40, 20);
        System.out.println(bowl);

        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println(cat);
        }

        System.out.println(bowl);
        bowl.addFood(50);
        System.out.println(bowl);

        for (Cat cat : cats) {
            cat.setFull(false);
            cat.eat(bowl);
            System.out.println(cat);
        }
        System.out.println(bowl);
    }
}