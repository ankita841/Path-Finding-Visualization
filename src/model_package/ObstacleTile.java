package model_package;

import java.awt.*;

public class ObstacleTile {
    
    public static final char CHAR = 'O';
    public static final Color COLOR = new Color(103, 103, 103); // Grey color
    
    public ObstacleTile(Point point)
    {
        super(point);
    }
    
    public ObstacleTile(int x, int y)
    {
        super(x, y);
    }
    
}
