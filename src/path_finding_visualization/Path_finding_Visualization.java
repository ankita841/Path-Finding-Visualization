package path_finding_visualization;
import model_package.PathMap;
import view_package.Window;

//Class containing main function to run the program
public class Path_finding_Visualization {

    public static void main(String[] args) {
        PathMap map = new PathMap(40, 40);
        Window window = new Window(map);
    }
    
}
