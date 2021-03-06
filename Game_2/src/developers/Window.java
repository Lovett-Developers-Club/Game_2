/*
	Game_2 
    Copyright (C) 2016  Lovett Developers Club
*/

package developers;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static JLabel name = new JLabel("Game_2");
	
	public static JLabel returnName(){
		return name;
	}
	
	static JLabel logo;
	
	public static void makeLogo(String path){
		try {
		File file = new File(path);
        BufferedImage image = ImageIO.read(file);
        logo = new JLabel(new ImageIcon(image));
		} catch (IOException e){
			System.out.println(e + " Window.java:33");
		}
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Game2.getPlayer().paintComponent(g);
	}
	
	
	
	
}
