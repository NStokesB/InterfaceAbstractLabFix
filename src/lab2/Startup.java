/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

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
            pc.getCourseName();
        }
        }
}
