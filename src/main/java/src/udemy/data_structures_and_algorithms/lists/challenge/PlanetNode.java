package src.udemy.data_structures_and_algorithms.lists.challenge;

public class PlanetNode {
    private Planet planet;
    private PlanetNode next;
    private PlanetNode prev;

    public PlanetNode(Planet planet) {
        this.planet = planet;
    }

    public Planet getCar() {
        return planet;
    }

    public void setCar(Planet planet) {
        this.planet = planet;
    }

    public PlanetNode getNext() {
        return next;
    }

    public void setNext(PlanetNode next) {
        this.next = next;
    }

    public PlanetNode getPrev() {
        return prev;
    }

    public void setPrev(PlanetNode prev) {
        this.prev = prev;
    }

    public Planet getPlanet() {
        return planet;
    }
}
