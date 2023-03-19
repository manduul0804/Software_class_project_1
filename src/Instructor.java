/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akatsuki
 */
import java.util.*;
public class Instructor {
    private String fName = "";
    private String lName = "";
    private int password = 0;
    private String user = "Instructor";
    private Set<String> class_teaching = new HashSet<String>();
    private boolean currUser = false;
    
    public void addClass(String newClass){
        this.class_teaching.add(newClass);
    }
    public void rmClass(String x){
        this.class_teaching.remove(x);
    }
    
    
    public List<String> getClassNames(){
        return new ArrayList<String>(this.class_teaching);
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
};
