 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

/**
 *
 * @author nguye
 */
public class Admin extends Person {

    private String position;
//    public Admin(String adminId, String adminName, Date dob, String email, int phonenumber, String address)
//      {
//        adminId = Id;
//        adminName = Name;
//        this.dob = dob;
//        this.email= email;
//        this.phonenumber = phonenumber;
//        this.address= address;
//      }
    public String getPosition(){
        return position;
    }
    public void setPosition(String a){
        position = a;
    }
}
