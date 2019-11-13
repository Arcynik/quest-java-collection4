import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        ;
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        Comparator<Hero> comparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero orig, Hero compare) {
                return orig.getName().compareTo(compare.getName());
            }
        };

        Map<Hero, Flower> favoriteFlowers = new TreeMap<>(comparator);

        favoriteFlowers.put(hulk, rose);
        favoriteFlowers.put(thor, rose);
        favoriteFlowers.put(scarletWitch, rose);
        favoriteFlowers.put(vision, tulip);
        favoriteFlowers.put(captainAmerica, lily);
        favoriteFlowers.put(doctorStrange, violet);
        favoriteFlowers.put(blackWidow, violet);

        System.out.println(favoriteFlowers.containsValue(begonia));

        for (Hero hero: favoriteFlowers.keySet()) {
            Flower flower = favoriteFlowers.get(hero);
            System.out.println(flower.getName());
        }
    }
}
