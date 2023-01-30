
package person;

import java.util.Arrays;

public class Student extends Personn {
    
    int numCourses =0;
    String[] courses=new String[10];
    int[] grades=new int[10];
    
    public Student(String name, String address) {
        super(name, address);
    }
 
    @Override
    public String toString(){
        System.out.println(super.toString()+Arrays.toString(courses)+Arrays.toString(grades));
        return "";
        
    }
    public void addCourseGrade(String course,int grade){
        
    }
    public void printGrades(){
        
    }

    @Override
    public void Yaz() {
        System.out.println("yazıldı");
    }
    
}
