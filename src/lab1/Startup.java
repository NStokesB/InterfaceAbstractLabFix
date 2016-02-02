/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author nstokesbeamon
 */
public class Startup {
    public static void main(String[] args){
        
    AdvancedJavaCourse AJC = new AdvancedJavaCourse();
    IntroJavaCourse IJC = new IntroJavaCourse();
    IntroToProgrammingCourse ITPC = new IntroToProgrammingCourse();
       
        AJC.setCourseName("Advanded Java");
        AJC.setCourseNumber("152-978");
        AJC.setCredits(4.0);
        AJC.setPrerequisites("Intro Java");
        
        AJC.getCourseName();
        AJC.getCourseNumber();
        AJC.getCredits();
        AJC.getPrerequisites();

        IJC.setCourseName("Intro Java");
        IJC.setCourseNumber("152-475");
        IJC.setCredits(5.0);
        IJC.setPrerequisites("Intro to Programming"); 
        
        IJC.getCourseName();
        IJC.getCourseNumber();
        IJC.getCredits();
        IJC.getPrerequisites();

        ITPC.setCourseName("Intro to Programming");
        ITPC.setCourseNumber("152-635");
        ITPC.setCredits(4.0);
        ITPC.setPrerequisites("No Prerequisites");
            
        ITPC.getCourseName();
        ITPC.getCourseNumber();
        ITPC.getCredits();
        ITPC.getPrerequisites();
            
      
            
            
        
        
       
        
    }
}

