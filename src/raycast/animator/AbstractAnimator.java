package raycast.animator;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import raycast.CanvasMap;
import utility.Point;

/**
 * this class must extend {@link AnimationTimer}. job of this class is to hold common functionality among animators.
 * 
 * @author Shahriar (Shawn) Emami
 * @version Jan 13, 2019
 */
public abstract class AbstractAnimator{

	/**
	 * create a protected class variable of type {@link CanvasMap} and name it map.
	 */
	/**
	 * create a protected class variable of type {@link Point} and name it mouse.
	 */
	
	/**
	 * create a protected constructor and initialize the {@link AbstractAnimator#mouse} variable
	 */
	
	/**
	 * create a setter called setCanvas to inject (set) the {@link CanvasMap}
	 * @param map - {@link CanvasMap} object
	 */

	/**
	 * create a method called mouseDragged that is called every time the position of mouse changes.
	 * @param e - {@link MouseEvent} object that hold the details of the mouse. use {@link MouseEvent#getX} and {@link MouseEvent#getY}
	 */

	/**
	 * create a method called mouseMoved that is called every time the position of mouse changes.
	 * @param e - {@link MouseEvent} object that hold the details of the mouse. use {@link MouseEvent#getX} and {@link MouseEvent#getY}
	 */
	
	/**
	 * <p>create a method called handle that is inherited from {@link AnimationTimer#handle(long)}.
	 * this method is called by JavaFX application, it should not be called directly.</p>
	 * <p>inside of this method call the abstract handle method {@link AbstractAnimator#handle(GraphicsContext, long)}.
	 * {@link GraphicsContext} can be retrieved from {@link CanvasMap#gc()}</p>
	 * @param now - current time in nanoseconds, represents the time that this function is called.
	 */

	/**
	 * create a protected abstract method called handle, this method to be overridden by subclasses.
	 * @param gc - {@link GraphicsContext} object.
	 * @param now - current time in nanoseconds, represents the time that this function is called.
	 */
}
