package draw;

import java.util.*;

public abstract class FileFormat {
	
	// The variables for a specific Format. shapes is the
	// list of DrawingPrimitives that are used in the Draw
	// program. shapeLines are the lines of converted 
	// DrawingPrimitives needed to save or load a file.
	
	protected ArrayList<DrawingPrimitive> shapes;
	protected ArrayList<String> shapeLines;
	
	/*
	 * The constructor.
	 */
	
	public FileFormat(ArrayList<DrawingPrimitive> s) {
		shapes = s;
	}
	
	/*
	 * This method takes the list of shapes and creates
	 * a list of Strings in the format of either a line
	 * for Text or a line for XML.
	 */
	
	public abstract ArrayList<String> makeShapeList();
	
	/*
	 * This method reads in the lines of a specific file type
	 * and converts it into a list of DrawingPrimitives for
	 * Draw to read in.
	 */
	
	public abstract ArrayList<DrawingPrimitive> makeShapes();
}
