package model_package;

import java.awt.*;

public class StartTile extends PathTile{
    
    public static final char CHAR = 'S';
    public static final Color COLOR = new Color(196, 21, 212); // purple colour
    
    public StartTile(Point point)
    {
        super(point);
    }
    
    public StartTile(int x, int y)
    {
        super(x, y);
    }
    
}
