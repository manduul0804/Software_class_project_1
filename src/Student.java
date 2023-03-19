
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akatsuki
 */
public class Student {
    private String fName = "";
    private String lName = "";
    private int password = 0;
    private String user = "Student";
    
    private boolean currUser = false;
    
//    Inner Class
    public class Course{

        /**
         * @return the quizAve
         */
        public int getQuizAve() {
            return quizAve;
        }

        /**
         * @param quizAve the quizAve to set
         */
        public void setQuizAve(int quizAve) {
            this.quizAve = quizAve;
        }

        /**
         * @return the finalExam
         */
        public int getFinalExam() {
            return finalExam;
        }

        /**
         * @param finalExam the finalExam to set
         */
        public void setFinalExam(int finalExam) {
            this.finalExam = finalExam;
        }

        /**
         * @return the GPA
         */
        public double getGPA() {
            return GPA;
        }

        /**
         * @param GPA the GPA to set
         */
        public void setGPA(double GPA) {
            this.GPA = GPA;
        }
        private int quizAve = 0;
        private int finalExam =0;
        private double GPA =0.0;
    }
    private Map<String, Course> courses = new TreeMap<String, Course>(String.CASE_INSENSITIVE_ORDER);
    
    public void addCourse(String courseName, Course stClass){
        courses.put(courseName, stClass);
    }
    public Map<String,Course> getCourse(){
        return courses;
    }
    public String getfName(){
        return this.fName;
    }
    public void setfName(String fName){
        this.fName = fName;
    }
    public String getlName(){
        return this.lName;
    }
    public void setlName(String lName){
        this.lName = lName;
    }
    public int getPass(){
        return this.password;
    }
    public void setPass(int password){
        this.password = password;
    }
    public String getUser(){
        return this.user;
    }
    public boolean isCurrUser() {
        return currUser;
    }

    /**
     * @param currUser the currUser to set
     */
    public void setCurrUser(boolean currUser) {
        this.currUser = currUser;
    }
    
}
