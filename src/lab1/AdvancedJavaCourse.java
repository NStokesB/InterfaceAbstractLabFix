package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{
        private String courseName;
        private String courseNumber;
        private double credits;
        private String prerequisites;
      
    
    @Override
     public void setCourseName(String courseName) {
         if(courseName == null || courseName.length() < 2){
             System.out.print("sorry course name is mandoatory");
         } else {
            this.courseName = courseName;
         }
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() < 6){
             System.out.print("sorry course number is mandoatory");
         } else {
            this.courseNumber = courseNumber;
         }
    }

    @Override
    public void setCredits(double credits) {
    if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null){
             System.out.print("sorry there is no Prerequisite");
    }
}
}
