/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charles
 */


public class StudentTest{
    
    public static void main(String[] args) {
        
        //Adding Student Names to end
        Student.addStuEnd("Charles Wilson");
        Student.addStuEnd("Zac Poorman");
        Student.addStuEnd("James White");
        Student.addStuEnd("Jake Gyllenhall");
        Student.addStuEnd("Ken Rouse");
        Student.addStuEnd("Brent Baas");
        
        //Print current LinkedList
        System.out.println(Student.getStuList());
        
        //Adding Student Names to beginning
        Student.addStuFront("Billy Bob");
        System.out.println(Student.getStuList());
        
        //Remove by name from list
        Student.removeStuName("James White");
        System.out.println(Student.getStuList());
        
        //Remove from start of list
        Student.removeStu();
        System.out.println(Student.getStuList());
        
    }
    
}
