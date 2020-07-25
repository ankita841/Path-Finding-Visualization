package controller_package;

import model_package.PathMap;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JFileChooser;

public class SaveAction extends ActionItem {

    private PathMap map;

    public SaveAction(PathMap map)
    {
        super("Save");
        this.map = map;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        JFileChooser fc = new JFileChooser();
        int result = fc.showSaveDialog((Component) e.getSource());
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File f = fc.getSelectedFile();
            this.map.save(f.getAbsolutePath());
        }
    }
}