package src.udemy.data_structures_and_algorithms.lists.challenge;

public class Planet {
    private final String name;
    private final int numberOfMoons;

    public Planet(String name, int numberOfMoons) {
        this.name = name;
        this.numberOfMoons = numberOfMoons;
    }


    @Override
    public String toString() {
        return name + ", numberOfMoons=" + numberOfMoons + " ";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Planet)) return false;
//
//        Planet planet = (Planet) o;
//
//        if (numberOfMoons != planet.numberOfMoons) return false;
//        return name != null ? name.equals(planet.name) : planet.name == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + numberOfMoons;
//        return result;
//    }
}
