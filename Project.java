public class Project {
    // Member variables aka attributes, instance variables, fields
    private String name, description;
    private double initialCost;

    // setters
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String desc){
        this.description = desc;
    }
    public void setInitialCost(double cost){
        this.initialCost = cost;
    }

    // getters
    public String getName() {
        return this.name;        
    }
    public String getDescription(){
        return this.description;
    }
    public double getInitialCost(){
        return this.initialCost;
    }

    // Constructors
    public Project(){}

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    // class Methods
    public String elevatorPitch(){
        return String.format("%s (%f): %s\n",name,initialCost,description);
    }


}
