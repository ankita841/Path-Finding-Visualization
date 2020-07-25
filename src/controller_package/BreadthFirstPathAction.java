package controller_package;

import java.awt.event.ActionEvent;

import algorithm_package.BreadthFirstPathfinding;
import algorithm_package.Pathfinding;
import model_package.PathMap;

public class BreadthFirstPathAction extends ActionItem {

    private BreadthFirstPathfinding BFS;

    public BreadthFirstPathAction(PathMap map){
        super("Breadth First");
        this.BFS = new BreadthFirstPathfinding(map, Pathfinding.FIRST_SOLUTION);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Thread(this.BFS).start();
    }

}