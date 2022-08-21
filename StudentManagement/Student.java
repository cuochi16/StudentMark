/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.util.Date;

/**
 *
 * @author anhva
 */
public class Student extends Person {
    private Date dob;
    private int phonenumber;
    private String address;
    private Class classs;
 
//      public Student(String studentId, String studentName, Date dob, String email, int phonenumber, String address)
//      {
//      studentId = Id;
//      studentName = Name;
//      this.dob = dob;
//      this.email= email;
//      this.phonenumber = phonenumber;
//      this.address= address;
//      }

      public Date getDoB()
      {
        return dob;
      }
      public void setDoB(Date a)
      {
        dob=a;
      }
      public int getPhonenumber()
      {
        return phonenumber;
      }
      public void setPhonenumber(int a)
      {
        phonenumber=a;
      }
      public String getAddress()
      {
        return address;
      }
      public void setAddress(String a)
      {
        address=a;
      }
      public Class getClass()
      {
        return classs;
      }
      public void setClass(Class a)
      {
        classs=a;
      }
      
}
