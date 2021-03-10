package sample;

public class Tamagotchi {

    private String name;
    private Stats stats;

    public int shit = 0;

    public Tamagotchi(String name) {
        this.name = name;
        this.stats = new Stats();
    }


    // API

    public void setName(String name) { this.name = name; }

    public void feedHim() { stats.fullness = 100; }

    public void tideHim() { stats.clearness=100; }

    public void petHim() { stats.happiness = 100; }

    public void sleep() { stats.fatigue = 0; }

    public void healHim() { stats.health = 100;}


    // Getters

    public String getName() { return this.name; }

    public Stats getStats() {
        return stats;
    }

    public int getShit() {
        return this.shit;
    }

}
