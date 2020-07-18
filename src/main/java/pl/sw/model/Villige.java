package pl.sw.model;

public class Villige extends Location {
    private LocationType type = LocationType.VILLIGE;

    public Villige(String name, String vivodeship, LocationType type) {
        super(name, vivodeship, LocationType.VILLIGE);
    }

    @Override
    public String sayGreeting(String message) {
        return "Witaj! Pozdrowienia z " + getName();
    }
}
