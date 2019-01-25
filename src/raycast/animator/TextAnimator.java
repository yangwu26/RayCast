package raycast.animator;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * this class handles the job of drawing on the canvas. it must extend {@link AbstractAnimator}
 * 
 * @author Shahriar (Shawn) Emami
 * @version Jan 13, 2019
 */
public class TextAnimator extends AbstractAnimator{

	/**
	 * <p>
	 * Inherited the abstract method {@link AbstractAnimator#handle(GraphicsContext, long)} as public.
	 * </p>
	 * <p>
	 * inside of the method:
	 * <ol>
	 * <li>call {@link GraphicsContext#save()} which saves the current state of {@link GraphicsContext}</li>
	 * <li>create a new larger {@link Font} using <code>Font.font( gc.getFont().getFamily(), FontWeight.BLACK, 50)</code></li>
	 * <li>call {@link GraphicsContext#setFont} and set the newly created font</li>
	 * <li>call {@link GraphicsContext#setFill} and set a {@link Color} of your choice</li>
	 * <li>call {@link GraphicsContext#fillText} and use "CST 8288 - Ray Cast" and mouse.x() and mouse.y()</li>
	 * <li>call {@link GraphicsContext#setStroke} and set a {@link Color} of your choice</li>
	 * <li>call {@link GraphicsContext#strokeText} and use "CST 8288 - Ray Cast" and mouse.x() and mouse.y()</li>
	 * <li>call {@link GraphicsContext#restore} which restores the state of {@link GraphicsContext}</li>
	 * </ol>
	 * </p>
	 */

	/**
	 * create a toString method and return "Text animator" as the name of this class
	 */
}
