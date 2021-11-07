import java.util.ArrayList;

public class ProjectTest {
    public static void main(String[] args) {
        Project bannas = new Project();

        bannas.setName("Really Yellow");
        bannas.setDescription("The new world order and not only for Monkeys. Yellow is the new Black! Get in on the highest level of fashion before its old like this add!");
        bannas.setInitialCost(120.00);

        String projName = bannas.getName();
        String projDescription = bannas.getDescription();

        Project faded = new Project("Faded by Caress");

        faded.setDescription("This is an all new spring collection that encourages those of you who are usually bright to stand out with more of a new designed faded pastell collection of colors.\nThese are new inks personnally picked out by non other than Caress.\nSo you know these are picked out with a very carefull eye.\nKeep a look out for Faded by Caress Comming Spring 2022");
        faded.setInitialCost(599.99);

        Project rugged = new Project("Beef N Broc", "For the stylish who wants to get dirty. Introducing our rugged collection. Beef N Broc. Available now.");
        rugged.setInitialCost(357.87);
        


        // System.out.println(projName);
        // System.out.println(projDescription);
        // System.out.println(bannas.elevatorPitch());
        // System.out.println(faded.elevatorPitch());
        // System.out.println(rugged.elevatorPitch());


        // Created Portforlio
        Portfolio projectPortfolio = new Portfolio();
        System.out.println(projectPortfolio);
        // Add ProjectList to Portforlio
        ArrayList<Object> projectsList = new ArrayList<Object>();
        projectPortfolio.setPortfolio(projectsList);
        projectPortfolio.getPorfolio();

        // Add project to proejedt list
        projectPortfolio.addProject(bannas);

        // Print projects in porfolio
        for(Object project : projectsList){
            System.out.println(project);
        }
    }
}
