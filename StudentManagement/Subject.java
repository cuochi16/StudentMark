/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author anhva
 */
public class Subject {
     private String subjectID;
     private String subjectName;
     
//     public Subject(String subjectID,String subjectName)
//     {
//      this.subjectID=subjectID;
//      this.subjectName=subjectName;
//     }
    public String getsubjectID(){
        return subjectID;
    }
    public void setsubjectID(String a){
        subjectID = a;
    }
    public String getsubjectName(){
        return subjectName;
    }
    public void setsubjectName(String b){
        subjectName = b;
    }
}
