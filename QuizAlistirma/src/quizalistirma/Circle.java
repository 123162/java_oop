
package quizalistirma;

public class Circle extends Shape{
    private int radius;
  
    @Override
    public void draw(){
        System.out.println("drawable a circle");
    }

    public Circle() {
        
    }
    
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
}
