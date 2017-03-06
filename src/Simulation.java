public class Simulation {

    public static final String CONFIG_FILE_NAME = "config.json";
    public static final String ENVIRONMENT_CONFIG_FILE_NAME = "environment.csv";
    public static final String SCENARIO_CONFIG_FILE_NAME = "scenarios.json";

    private static Data previousData;
    private static Data currentData;

    private static DataList dataList;
    private static Building building;
    private static Outside outside;
    private static EnvironmentParser environmentParser;
    private static ConfigParser configParser;
    private static ScenarioParser scenarioParser;

    public static void main(String args[]){


        configParser = new ConfigParser(CONFIG_FILE_NAME, false);
        environmentParser = new EnvironmentParser(ENVIRONMENT_CONFIG_FILE_NAME, false);
//        scenarioParser = new ScenarioParser(SCENARIO_CONFIG_FILE_NAME);

        while(environmentParser.hasData()){
            currentData = environmentParser.getDataAt(102869);

            System.out.println("Date: " + currentData.getDate() + ", Time: " + currentData.getTime() + ", Date and Time string: " + currentData.getDateInString() +
                ", Rain (mm): " + currentData.getRainInMilimeters() + ", Temperature was " + currentData.getTemperatureCelcius() +
                " celcius, Wetbulb Temperature was " + currentData.getWetBulbTemperatureCelcius() + " celcius, Dew Point Temperature was " + currentData.getDewPointTemperatureCelcius() +
                " celcius, Relative Humidity was " + currentData.getRelativeHumidityPercentage() + " percent, Vapour Pressure was " + currentData.getVapourPressureHPA() +
                " hector pascals, Average Wind Speed was " + currentData.getWindSpeedKnots() + " knots.");

            previousData = currentData;
        }


    }

    public void setInitialBuildingValues(){
        
    }
}