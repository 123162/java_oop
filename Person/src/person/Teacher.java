
package person;

import java.util.Arrays;

public class Teacher extends Personn implements IAraba{
    int numCourses=0;
    
    String[] courses={"mat","kimya","fizk","a","b","c","f","H","J","jü","D"};
    
    
    public Teacher(String name, String address) {
        super(name, address);
    }
    @Override
    public String toString(){
        System.out.println(super.toString()+Arrays.toString(courses));
        return "";
    }
    public boolean addCourse(String course){//ders varsa false
        while(true){
            for(int i=0;i<10;i++){
                System.out.println(courses[i]);  
            }
            
            return false;
        }
    }
    public boolean removeCourse(String course){//yoksa false
        return false;
    }

    @Override
    public void Yaz() {
        System.out.println("yazıldı");
    }

    @Override
    public void EkranaYaz() {
    }
   
    
}
