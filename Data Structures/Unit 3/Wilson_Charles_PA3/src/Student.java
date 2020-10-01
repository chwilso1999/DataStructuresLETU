/**
 *
 * @author Charles
 */

//needs methods [Add NewStu@End, Add NewStu@Beginning, Remove Stu@Beginning, 
//and  Remove Stu:ByName]

import java.util.LinkedList;


public class Student { // Java LinkedList doc used
                        // https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
    
    // Student list (As per Section 2.5 "Single-LinkedList")
    private static LinkedList stuList = new LinkedList();
    
    //Adds Stu to end of LinkedList
    public static void addStuEnd(String stu){
        stuList.addLast(stu);
    }
    
    //Adds Stu to front of LinkedList
    public static void addStuFront(String stu){
        stuList.addFirst(stu);
    }
    
    //Removes Stu from front of LinkedList
    public static void removeStu(){
        stuList.removeFirst();
    }
    
    //Removes Stu by name from LinkedList
    public static void removeStuName(String stu){
        stuList.remove(stu);
    }
    
    
    //Easy get function for stuList
    public static LinkedList getStuList() {
        return stuList;
    }
}
