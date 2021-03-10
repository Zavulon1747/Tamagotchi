package sample;

public class Stats {

    public int fullness, clearness, happiness, health, fatigue;

    public Stats() {
        this.fullness = 100;
        this.clearness = 100;
        this.happiness = 100;
        this.health = 100;
        this.fatigue = 0;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "fullness=" + fullness +
                ", clearness=" + clearness +
                ", happiness=" + happiness +
                ", health=" + health +
                ", fatigue=" + fatigue +
                '}';
    }
}