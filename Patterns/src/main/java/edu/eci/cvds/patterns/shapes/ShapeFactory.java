package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {

	public static Shape create(RegularShapeType type) {
		Shape object =null;
		switch(type)
		{
			case Triangle:
				object = new Triangle();
				break;
			case Quadrilateral:
				object = new Quadrilateral();
				break;
			case Pentagon:
				object = new Pentagon();
				break;
			case Hexagon:
				object = new Hexagon();
				break;
		}
		return object;
	}

}
