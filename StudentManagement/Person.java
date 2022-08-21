/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.util.Date;

/**
 *
 * @author nguye
 */
public class Person {
   public String ID;
   public String name;
   public String email;

      public String getID()
      {
          return ID;
      }
      public void setID(String a)
      {
          ID= a;
      }
      public String getName()
      {
          return name;
      }
      public void setName(String a)
      {
          name=a;
      }
      public String getEmail()
      {
          return email;
      }
      public void setEmail(String a)
      {
          email=a;
      }
}