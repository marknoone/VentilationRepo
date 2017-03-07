package metrics;

public class Pressure {

    public enum Unit{
        PA, KPA, HPA
    }

    public static final Unit SI_UNIT = Unit.PA;
    public static final double STANDARD_ATMOSPHERIC_PRESSURE = 101325;

    public static double convert(double value, Unit from, Unit to){
        return asSpecifiedUnit(asSIunit(value,from), to);
    }

    private static double asSIunit(double value, Unit unit){
        switch (unit){
            case PA: return value;
            case KPA: return value/1000.0;
            case HPA: return value/100.0;
        }
        throw new IllegalArgumentException("Invalid unit type for Pressure");
    }

    private static double asSpecifiedUnit(double value, Unit unit){
        switch (unit){
            case PA: return value;
            case KPA: return value*1000.0;
            case HPA: return value*100.0;
        }
        throw new IllegalArgumentException("Invalid unit type for Pressure");
    }

}
