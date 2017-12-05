class SpaceAge {
    double seconds;
    private final double MERCURY_YEAR = 0.2408467;
    private final double VENUS_YEAR = 0.61519726;
    private final double MARS_YEAR = 1.8808158;
    private final double JUPITER_YEAR = 11.862615;
    private final double SATURN_YEAR = 29.447498;
    private final double URANUS_YEAR = 84.016846;
    private final double NEPTUNE_YEAR = 164.79132;


    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double getEarthYear(){
        return seconds/60/60/24/365.25;
    }

    double onEarth() {
        return getEarthYear();
    }

    double onMercury() {
        return getEarthYear()/MERCURY_YEAR;
    }

    double onVenus() {
        return getEarthYear()/VENUS_YEAR;
    }

    double onMars() {
        return getEarthYear()/MARS_YEAR;
    }

    double onJupiter() {
        return getEarthYear()/JUPITER_YEAR;
    }

    double onSaturn() {
        return getEarthYear()/SATURN_YEAR;
    }

    double onUranus() {
        return getEarthYear()/URANUS_YEAR;
    }

    double onNeptune() {
        return getEarthYear()/NEPTUNE_YEAR;
    }
}
