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
    public Subject add() {
        Subject sub = new Subject();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter SubjectID:");
        sub.setsubjectID(s.nextLine());
        System.out.print("Enter SubjectName:");
        sub.setsubjectName(s.nextLine());
        return sub;
    }

    @Override
    public boolean edit(ArrayList<Subject> listsub) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can sua: ");
        String subjectID = s.nextLine();
        for (int i = 0; i < listsub.size(); i++) {
            if(listsub.get(i).equals(subjectID)){
                System.out.print("Nhap ten can sua:");
                listsub.get(i).setsubjectName(s.nextLine());
                System.out.println("Sua thanh cong!!");
                break;
            }
            else{
                System.out.println("Khong co thang nay dau ma sua!!!");
            }
        }
        return true;
    }

    @Override
    public boolean delete(ArrayList<Subject> listsub) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can xoa: ");
        String subjectID = s.nextLine();
        for (int i = 0; i < listsub.size(); i++) {
            if(listsub.get(i).equals(subjectID)){
                System.out.print("Nhap ten can sua:");
                listsub.get(i).setsubjectName(s.nextLine());
                System.out.println("Xoa thanh cong!!");
                break;
            }
            else{
                System.out.println("Khong co thang nay dau ma xoa!!!");
            }
        }
        return true;
    }

    @Override
    public void show(ArrayList<Subject> listsub) {
        for (int i = 0; i < listsub.size(); i++) {
            System.out.printf("| %-10s | %-10s |%n", listsub.get(i).getsubjectID(),listsub.get(i).getsubjectName());
        }
    }

    
}
