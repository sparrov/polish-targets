package pl.sw.model;

public abstract class Location {
    private String name;
    private String vivodeship;
    private LocationType type;

    public Location(String name, String vivodeship, LocationType type) {
        this.name = name;
        this.vivodeship = vivodeship;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getVivodeship() {
        return vivodeship;
    }

    public LocationType getType() {
        return type;
    }

    public abstract String sayGreeting(String message);
}
