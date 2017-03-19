import java.util.List;

public abstract class VentilationSystem{

    /*
        Things all forms of ventilation system need
     */

    //numerical values
    private double costPerUnitEnergy;
    private double volumeInput;
    private double volumeOutput;

    //Other parts of the system all Ventilation Systems need
    private Outside outside;
    private Building building;

    //Constructor
    public VentilationSystem(Builder b){

        this.costPerUnitEnergy = b.costPerUnitEnergy;
        this.volumeInput= b.volumeInput;
        this.volumeOutput = b.volumeOutput;

        this.outside = b.outside;
        this.building = b.building;
    }

    //
    public static Builder createSCV(){
        return new SCV.Builder();
    }

    public static DCV.Builder createDCV(){
        return new DCV.Builder();
    }


    public abstract void simulate();


    public static abstract class Builder{

        double costPerUnitEnergy;
        double volumeInput;
        double volumeOutput;

        Outside outside;
        Building building;

        public Builder costPerUnitEnergy(double costPerUnitEnergy){
            this.costPerUnitEnergy = costPerUnitEnergy;
            return this;
        }

        public Builder volumeInput(double volumeInput){
            this.volumeInput = volumeInput;
            return this;
        }

        public Builder volumeOutput(double volumeOutput){
            this.volumeOutput = volumeOutput;
            return this;
        }

        public Builder outside(Outside outside){
            this.outside = outside;
            return this;
        }

        public Builder building(Building building){
            this.building = building;
            return this;
        }

        public abstract VentilationSystem build();

    }






}
