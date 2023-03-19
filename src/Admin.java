
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akatsuki
 */
import java.util.*;

public class Admin {

    

    /**
     * @return the currUser
     */
    public boolean isCurrUser() {
        return currUser;
    }

    /**
     * @param currUser the currUser to set
     */
    public void setCurrUser(boolean currUser) {
        this.currUser = currUser;
    }
    private String fName;
    private String lName;
    private int passWord;
    private String user = "Admin";
    private boolean currUser = false;
   
        
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
        return this.passWord;
    }

    /**
     *
     * @param password
     */
    public void setPass(int passWord){
        this.passWord = passWord;
    }
    public String getUser(){
        return this.user;
    }
}
