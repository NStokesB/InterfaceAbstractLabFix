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
        ProgrammingCourse[] courses = {
            new AdvancedJavaCourse(), new IntroJavaCourse(), new IntroToProgrammingCourse()};
        
        for(ProgrammingCourse pc : courses){
            pc.setCourseName(null);
        }
        
         for(ProgrammingCourse pc : courses){
            pc.setCourseNumber(null);
        }
          for(ProgrammingCourse pc : courses){
            pc.setCredits(0.0);
        }
           for(ProgrammingCourse pc : courses){
            pc.setPrerequisites(null);
        }
        }
    }

