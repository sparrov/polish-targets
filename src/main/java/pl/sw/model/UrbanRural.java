package pl.sw.model;

public class UrbanRural extends Location {
    private LocationType type = LocationType.URBAN_RURAL;

    public UrbanRural(String name, String vivodeship, LocationType type) {
        super(name, vivodeship, LocationType.URBAN_RURAL);
    }

    @Override
    public String sayGreeting(String message) {
        return "Witaj! Pozdrowienia z" + getName();
    }
}
