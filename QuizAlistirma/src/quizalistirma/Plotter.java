
package quizalistirma;

import java.util.ArrayList;
import java.util.List;

public class Plotter {
    public static void main(String[] args){
        List<Drawable> drawables =new ArrayList<>();
       Shape s=new Circle();
    
        drawables.add(s);
        //s.draw();
        
        Shape k=new Rectangle();
        drawables.add(k);
       // k.draw();
        
        Line l=new Line();
        drawables.add(l);
        //l.draw();
        
        for(Drawable drawable: drawables){
            //System.out.println(drawables)
            drawable.draw();
            
        }
        
    }
   
}