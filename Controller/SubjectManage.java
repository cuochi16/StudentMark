/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interface.Action;
import StudentManagement.Subject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author H
 */
public class SubjectManage implements Action<Subject> {

    @Override
    public Subject add(ArrayList<Subject> listsub) {
        Subject sub = new Subject();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter SubjectID: ");
        sub.setsubjectID(s.nextLine());
        System.out.print("Enter SubjectName: ");
        sub.setsubjectName(s.nextLine());
        return sub;
    }

    @Override
    public boolean edit(ArrayList<Subject> listsub) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can sua: ");
        String subjectID = s.nextLine();
        for (int i = 0; i < listsub.size(); i++) {
            if(listsub.get(i).getsubjectID().equals(subjectID)){
                System.out.print("Nhap ten can sua: ");
                listsub.get(i).setsubjectName(s.nextLine());
                System.out.println("Sua thanh cong!!");
                return true;
            }
        }
        System.out.println("Khong co mon hoc nay");
        return false;
    }

    @Override
    public boolean delete(ArrayList<Subject> listsub) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can sua: ");
        String subjectID = s.nextLine();
        for (int i = 0; i < listsub.size(); i++) {
            if(listsub.get(i).getsubjectID().equals(subjectID)){
                System.out.print("Nhap ten can sua:");
                listsub.remove(i);
                System.out.println("Xoa thanh cong!!");
                return true;
            }
        }
        System.out.println("Khong co mon hoc nay");
        return false;
    }

    @Override
    public void show(ArrayList<Subject> listsub) {
        for (int i = 0; i < listsub.size(); i++) {
            System.out.printf("| %-3s | %-10s | %-10s |%n",i+1, listsub.get(i).getsubjectID(),listsub.get(i).getsubjectName());
        }
    }

    @Override
    public boolean findID(ArrayList<Subject> items, String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
