package _11_enum;

public class EnumDemo {

    public static void main(String[] args) {
        System.out.println(Planet.JUPITER.name());
        System.out.println(Planet.JUPITER.mass());
        System.out.println(Planet.JUPITER.radius());
        System.out.println(Planet.JUPITER);
        System.out.println(Planet.JUPITER.surfaceGravity());
        System.out.println("==============================");
        
        for(Planet planet: Planet.values()){
            System.out.println(planet);
        }
        System.out.println("==============================");
        
        for(Planet planet: Planet.values()){
            System.out.println(planet.name() + " " + planet.mass());
        }
        
        Planet p = Enum.valueOf(Planet.class, "EARTH");
        System.out.println(p);
    }

}
