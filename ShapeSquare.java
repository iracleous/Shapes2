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
public class  ShapeSquare
{
    private Square myCircle;

    public ShapeSquare(){
        Canvas canvas=Canvas.getCanvas();
       
        myCircle = new Square();
        myCircle.makeVisible();
        
       
        canvas.addKeyListener(listener);
    }
public void getPriority(){
                Canvas.getCanvas().addKeyListener(listener);
    }
    
    private KeyListener listener = new KeyListener() {
            @Override
            public void keyPressed(KeyEvent event) {
                
                 
                int x=event.getKeyCode();
             //   printEventInfo("Key Pressed", event);
                  
                if (x==KeyEvent.VK_RIGHT)
                    myCircle.moveRight();
                if (x==KeyEvent.VK_LEFT)
                    myCircle.moveLeft();    
                          
            }

            @Override
            public void keyReleased(KeyEvent event) {
            //    printEventInfo("Key Released", event);
            }

            @Override
            public void keyTyped(KeyEvent event) {
           //     printEventInfo("Key Typed", event);
            }

            private void printEventInfo(String str, KeyEvent e) {
                System.out.println(str);
                int code = e.getKeyCode();
                System.out.println("   Code: " + KeyEvent.getKeyText(code));
                System.out.println("   Char: " + e.getKeyChar());
                int mods = e.getModifiersEx();
                System.out.println("    Mods: "
                    + KeyEvent.getModifiersExText(mods));
                System.out.println("    Location: "
                    + keyboardLocation(e.getKeyLocation()));
                System.out.println("    Action? " + e.isActionKey());
            }

            private String keyboardLocation(int keybrd) {
                switch (keybrd) {
                    case KeyEvent.KEY_LOCATION_RIGHT:
                    return "Right";
                    case KeyEvent.KEY_LOCATION_LEFT:
                    return "Left";
                    case KeyEvent.KEY_LOCATION_NUMPAD:
                    return "NumPad";
                    case KeyEvent.KEY_LOCATION_STANDARD:
                    return "Standard";
                    case KeyEvent.KEY_LOCATION_UNKNOWN:
                    default:
                    return "Unknown";
                }
            }
        };

}
