
package quizalistirma;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle() {
       
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public void draw(){
        System.out.println("drawable in rectangle");
    }
}
