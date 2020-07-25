package controller_package;

import java.awt.event.*;
import model_package.*;

public class PanelClickListener implements MouseListener, MouseMotionListener, KeyListener 
{
	private PathMap map;
	boolean start = false;
	public static final int TILE_SIZE = 16;
	public static final int BORDER_SIZE = 2;

	public PanelClickListener(PathMap map)
        {
		this.map = map;
	}

	@Override
	public void mouseClicked(MouseEvent e)
        {
		int tileX = e.getX() / (TILE_SIZE + BORDER_SIZE);
		int tileY = e.getY() / (TILE_SIZE + BORDER_SIZE);
                //checks if the starting point is given or not. If not, 
                //then it sets the tile to goal tile
		if (!start) 
                {
			map.setTile(new StartTile(tileX, tileY));
			start = true;
		}
                else
                {
			map.setTile(new GoalTile(tileX, tileY));
			start = false;
		}
	}

	@Override
	public void mousePressed(MouseEvent e) 
        {
		System.out.println("Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e)
        {
		System.out.println("Dragged");
		int tileX = e.getX() / (TILE_SIZE + BORDER_SIZE);
		int tileY = e.getY() / (TILE_SIZE + BORDER_SIZE);
		if (tileX < map.getWidth() && tileY < map.getHeight()) 
                {
			PathTile tile = map.getTile(tileX, tileY);
			map.setTile(new ObstacleTile(tileX, tileY));
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {            
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}