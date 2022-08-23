/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Interface.ActionStudent;
import StudentManagement.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nguye
 */
public class StudentManage implements ActionStudent<Student,Class>{

    @Override
    public Student add(ArrayList<Student> listst,ArrayList<Class> listcl) {
        Student st = new Student();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter StudentID:");
        String id = s.nextLine();
        while(findID(listst,id)){
            System.out.println("Da co ID nay");
            System.out.print("Xin moi nhap lai ID:");
            id = s.nextLine();
        }
        st.setID(id);
        System.out.print("Enter Name:");
        st.setName(s.nextLine());
        System.out.print("Enter DoB:");
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            st.setDob(date.parse(s.nextLine()));
        } catch (ParseException ex) {
            Logger.getLogger(AdminManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Enter Email:");
        st.setEmail(s.nextLine());
        System.out.print("Enter Numberphone:");
        st.setPhonenumber(s.nextInt());        
        System.out.print("Enter Adress:");
        s = new Scanner(System.in);
        st.setAddress(s.nextLine());
        boolean check = false;
        do{
            System.out.print("Enter ClassID:");
            String student =  s.nextLine();
            for (int i = 0; i < listcl.size(); i++) {
                if(student.equals(listcl.get(i).())){
                    st.setClasss(listcl.get(i));
                    check = false;
                }
                else{
                    System.out.println("Khong co sv nay! Xin moi nhap lai ID!!!!!1");
                    check = true;
                }
            }
        }while(check);
        return st;
    }

    @Override
    public boolean edit(ArrayList<Student> listst) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can sua: ");
        String tempID = s.nextLine();
        for (int i = 0; i < listst.size(); i++) {
            Student student = listst.get(i);
            if(student.getID().equals(tempID)){
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
                                    student.setName(temp);
                                    break;

                            case 2:
                                    System.out.println("Edit DoB");
                                    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
                                    try {
                                        student.setDob(date.parse(s.nextLine()));
                                    } catch (ParseException ex) {
                                        Logger.getLogger(AdminManage.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    break;
                            case 3:
                                    System.out.println("Edit email");
                                    s = new Scanner(System.in);
                                    student.setEmail(s.nextLine());
                                    break;
                            case 4:
                                    System.out.println("Edit phonenumber");
                                    s = new Scanner(System.in);
                                    student.setPhonenumber(s.nextInt());
                                    break;
                            case 5:
                                    System.out.println("Edit address"); 
                                    s = new Scanner(System.in);
                                    student.setAddress(s.nextLine());
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
                return true;
            }
        }
        System.out.println("Khong co sinh vien nay");
        return false;
    }

    @Override
    public boolean delete(ArrayList<Student> listst) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can xoa: ");
        String tempID = s.nextLine();
        for (int i = 0; i < listst.size(); i++) {
            if(listst.get(i).getID().equals(tempID)){
                listst.remove(i);
                System.out.println("Xoa thanh cong 1 thang ngu");
                return true;
            }
        }
        System.out.println("Co thang nay dau ma xoa thang dan don!!!");
        return false;
    }

    @Override
    public void show(ArrayList<Student> listst) {
        for (int i = 0; i < listst.size(); i++) {
            Date date = listst.get(i).getDob();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String strDate = formatter.format(date);
            System.out.printf("|%-10s |%-15s | %-30s | %-15s| %-15s|%-10s |%n", listst.get(i).getID(),listst.get(i).getName(),strDate,listst.get(i).getEmail(),listst.get(i).getPhonenumber(),listst.get(i).getAddress());
        }
        
    }

    @Override
    public boolean findID(ArrayList<Student> items, String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(ArrayList<Student> items, ArrayList<Class> items1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object add(ArrayList<Student> items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
