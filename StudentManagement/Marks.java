/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhva
 */
public class Marks
{
    private String markID;
    private Student student;
    private Subject subject;
    private String mark;
          
//    public Marks(String markId, Student student, Subject subject, String mark)
//    {
//      this.markID = markId;
//      this.student = student;
//      this.subject = subject;
//      this.mark = mark;
//    }
    public String getmarkID(){
        return markID;
    }
    public void setmarkID(String a){
        markID = a;
    }
    public Student getstudent(){
        return student;
    }
    public void setstudent(Student b){
        student = b;
    }
    public Subject getsubject(){
        return subject;
    }
    public void setsubject(Subject a){
        subject = a;
    }
    public String getmark(){
        return mark;
    }
    public void setmark(String b){
        mark = b;
    }
}

