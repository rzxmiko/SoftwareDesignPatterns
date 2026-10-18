package navigation;

public record Route(String transport, double distanceKm, double timeMinutes) {

    @Override
    public String toString() {
        return String.format("%s route: %.1f km, %.0f min", transport, distanceKm, timeMinutes);
    }
}