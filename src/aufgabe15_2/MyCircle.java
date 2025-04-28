package aufgabe15_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MyCircle {
	public float radius;
	
	public MyCircle(float r) {
		radius = r;
		createPoints();
	}
	
	private void createPoints() {
		class Point {
			private float x, y;
			
			public Point(float x, float y) {
				this.x = x;
				this.y = y;
			}
			
			public void output(PrintWriter pw) {
				pw.println(x + " " + y);
			}
		}
		
		ArrayList<Point> points = new ArrayList<>();
		for (int i = 0;i < 90;i++) {
			points.add(new Point( 
					(float) Math.cos(Math.toRadians(i))*radius,  
					(float) (Math.sin(Math.toRadians(i))*radius) ));
		}
		
		File f = new File("kreis2.txt");
		PrintWriter pw;
		try {
			pw = new PrintWriter(f);
			for (Point p: points) {
				p.output(pw);
			}
			
			pw.flush();
			pw.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		}
	}
}
