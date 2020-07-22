package model_package;

import java.awt.*;

public class GoalTile {
    
    public static final char CHAR = 'G';
    public static final Color COLOR = new Color(51, 51, 255); // Dark blue color
    
    public GoalTile(int x, int y)
    {
        super(x, y);
    }
    
    public GoalTile(Point point)
    {
        super(point);
    }
    
}
