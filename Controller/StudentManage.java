/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Interface.Action;
import StudentManagement.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nguye
 */
public class StudentManage implements Action<Student>{

    @Override
    public Student add() {
        Student st = new Student();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter StudentID:");
        st.setstudentId(s.nextLine());
        System.out.println("Enter Name:");
        st.setstudentName(s.nextLine());
        System.out.println("Enter DoB:");
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            st.setdob(date.parse(s.nextLine()));
        } catch (ParseException ex) {
            Logger.getLogger(AdminManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Enter Email:");
        st.setemail(s.nextLine());
        System.out.println("Enter Numberphone:");
        st.setphonenumber(s.nextInt());        
        System.out.println("Enter Adress:");
        s = new Scanner(System.in);
        st.setaddress(s.nextLine());
        return st;
    }

    @Override
    public boolean edit(ArrayList<Student> listst) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can sua: ");
        String tempID = s.nextLine();
        int countst = 0;
        for (int i = 0; i < listst.size(); i++) {
            Student student = listst.get(i);
            if(student.getstudentId().equals(tempID)){
                boolean a = true;
                while(a)
                {
                    System.out.println("****************************");
                    System.out.println("1.Edit name");
                    System.out.println("2.Edit DoB");
                    System.out.println("3.Edit email");
                    System.out.println("4.Edit phonenumber");
                    System.out.println("5.Edit address");
                    System.out.println("6.Exit");
                    System.out.print("Chon chuc nang : ");
                            int choose1 = s.nextInt();
                            switch (choose1) {
                            case 1:
                                    System.out.print("Edit name: ");
                                    s = new Scanner(System.in);
                                    String temp = s.nextLine();
                                    student.setstudentName(temp);
                                    break;

                            case 2:
                                    System.out.println("Edit DoB");
                                    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
                                    try {
                                        student.setdob(date.parse(s.nextLine()));
                                    } catch (ParseException ex) {
                                        Logger.getLogger(AdminManage.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    break;
                            case 3:
                                    System.out.println("Edit email");
                                    s = new Scanner(System.in);
                                    student.setemail(s.nextLine());
                                    break;
                            case 4:
                                    System.out.println("Edit phonenumber");
                                    s = new Scanner(System.in);
                                    student.setphonenumber(s.nextInt());
                                    break;
                            case 5:
                                    System.out.println("Edit address");
                                    s = new Scanner(System.in);
                                    student.setaddress(s.nextLine());
                                    break;
                            case 6:
                                    System.out.println("Exit");
                                    a = false;
                                    break;
                            default:
                                    System.out.println("Thang ngu co dau ma chon");
                                    break;
                            }
                }
            }
            else{
                countst++;
            }
            if(countst==listst.size()){
                System.out.println("Khong co sinh vien nay");
            }
        }
        return true;
    }

    @Override
    public boolean delete(ArrayList<Student> listst) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can xoa: ");
        String tempID = s.nextLine();
        int countst = 0;
        for (int i = 0; i < listst.size(); i++) {
            if(listst.get(i).getstudentId().equals(tempID)){
                listst.remove(i);
                System.out.println("Xoa thanh cong 1 thang ngu");
            }
            else{
                countst++;
            }
            if(countst==listst.size()){
                 System.out.println("Co thang nay dau ma xoa thang dan don!!!");
            }
        }
        return true;
    }

    @Override
    public void show(ArrayList<Student> listst) {
        for (int i = 0; i < listst.size(); i++) {
            System.out.printf("|%-10s |%-15s | %-30s | %-15s| %-15s|%-10s |%n", listst.get(i).getstudentId(),listst.get(i).getstudentName(),listst.get(i).getdob(),listst.get(i).getemail(),listst.get(i).getphonenumber(),listst.get(i).getaddress());
        }
        
    }

    
}
