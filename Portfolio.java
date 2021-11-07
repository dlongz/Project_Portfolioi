import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Object> projects;

    // Setter
    public void setPortfolio(ArrayList<Object> project){
        this.projects = project;
    }

    
    // getter
    public ArrayList<Object> getPorfolio(){
        return this.projects;
    }

    // Constructor
    public Portfolio(){};
    
    public Portfolio(ArrayList<Object> projects){
        this.projects = projects;
    }
    
    // Methods
    public void addProject(Object proj){
        this.projects.add(proj);
    
    }
    public Object getProject(int index){
        return this.projects.get(index);
    }

}
