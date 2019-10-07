import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 * Write a description of class MyListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyShape
{
    private Circle myCircle;

    public MyShape(){
        Canvas canvas=Canvas.getCanvas();
        myCircle = new Circle();
        myCircle.makeVisible();
    }

    public void getPriority(){
        Canvas.getCanvas().addKeyListener(listener);
    }

    
    private KeyListener listener = new KeyListener() {
            @Override
            public void keyPressed(KeyEvent event) {

                int code=event.getKeyCode();
                //   printEventInfo("Key Pressed", event);

                if (code==KeyEvent.VK_RIGHT)
                    myCircle.moveRight();
                if (code==KeyEvent.VK_LEFT)
                    myCircle.moveLeft();    

            }

            @Override
            public void keyReleased(KeyEvent event) {
            }

            @Override
            public void keyTyped(KeyEvent event) {
            }

        };
}
