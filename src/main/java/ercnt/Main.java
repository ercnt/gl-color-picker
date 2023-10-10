package ercnt;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Main {

	public static void main(String[] args) {
		try {
			
			Display.setTitle("Color Picker");
			Display.setDisplayMode(new DisplayMode(500, 500));
			Display.create();

			GL11.glViewport(0, 0, Display.getWidth(), Display.getHeight());
			
			while (!Display.isCloseRequested()) {
				GL11.glClear(256);
				GL11.glMatrixMode(5889);
				GL11.glLoadIdentity();
				GL11.glOrtho(0, Display.getWidth(), Display.getHeight(), 0, 1000D, 3000D);
				GL11.glMatrixMode(5888);
				GL11.glLoadIdentity();
				GL11.glTranslatef(0, 0, -2000.0F);
				
				// DRAW
				
				Display.update();
			}
			
			Display.destroy();
			
		} catch (Throwable e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

}
