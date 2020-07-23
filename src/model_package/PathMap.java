package model_package;

import java.awt.Point;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PathMap extends Observable{
    
    //2-D map of all the tiles of the map.
    private PathTile[][] tileMap; 

    public PathMap(int width, int height)
    {
        tileMap = new PathTile[width][height];
        
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                tileMap[i][j] = new PathTile(new Point(i, j));
        
    }
    
    
}
