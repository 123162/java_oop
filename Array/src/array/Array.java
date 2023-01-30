
package array;

import java.util.ArrayList;
import java.util.List;


public class Array {

    public static void main(String[] args) {
        //ArrayList<String> array=new ArrayList<String>();
        List<String> list=new ArrayList<String>();
        list.add("java");
        list.add("C");
        list.add("PYTHON");
       // System.out.println(list.get(0));//0. inexteki elamnı yazıdıyor
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
    }
    
}
