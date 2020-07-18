package pl.sw.model;

public class City extends Location {
    private LocationType type = LocationType.CITY;

    public City(String name, String vivodeship, LocationType type) {
        super(name, vivodeship, LocationType.CITY);
    }

    @Override
    public String sayGreeting(String message) {
        return "Witaj! Pozdrowienia z " + getName();
    }
}
