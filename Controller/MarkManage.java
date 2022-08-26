/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interface.ActionMark;
import StudentManagement.Student;
import StudentManagement.Marks;
import StudentManagement.Subject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author H
 */
public class MarkManage implements ActionMark<Marks,Student,Subject>{

    @Override
    public Marks add(ArrayList<Marks> listma, ArrayList<Student> listst, ArrayList<Subject> listsub) {
        Marks mark = new Marks();        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter MarkID:");
        mark.setmarkID(s.nextLine());
        boolean checkst = true;
        while(checkst){
            System.out.print("Enter StudentID:");
            String student =  s.nextLine();
            for (int i = 0; i < listst.size(); i++) {
                if(student.equals(listst.get(i).getID())){
                    mark.setstudent(listst.get(i));
                    checkst=false;
                    break;
                }
            }
            if(checkst){
                System.out.println("Khong co sinh vien nay xin moi nhap lai");
            }
        }
        
        boolean checksub = true;
        while(checksub){
            System.out.print("Enter SubjectID:");
            String subject =  s.nextLine();
            for (int i = 0; i < listsub.size(); i++) {
                if(subject.equals(listsub.get(i).getsubjectID())){
                    mark.setsubject(listsub.get(i));
                    checksub=false;
                }
            }
            if(checksub){
                System.out.println("Khong co mon hoc nay xin moi nhap lai");
            }
        }
        System.out.print("Enter Mark ( P | M | D ):");
        String marks = s.nextLine();
        if(marks.equals("P")||marks.equals("M")||marks.equals("D")){
                mark.setmark(marks);
            }
            else{
                System.out.println("!!! Khong co diem nay !!!");
            }
        return mark;
    }

    @Override
    public boolean edit(ArrayList<Marks> listma, ArrayList<Student> listst, ArrayList<Subject> listsub) {
        Scanner s = new Scanner(System.in);
        boolean check = true;
        while(check){
            System.out.print("Nhap ID can sua: ");
            String tempID = s.nextLine();
            for (int i = 0; i < listma.size(); i++) {
                Marks mark = listma.get(i);
                if(mark.getmarkID().equals(tempID)){
                    boolean a = true;
                    while(a)
                    {
                        System.out.println("****************************");
                        System.out.println("1.Edit studentID");
                        System.out.println("2.Edit subjectID");
                        System.out.println("3.Edit mark");
                        System.out.println("4.Exit");
                        System.out.print("Chon chuc nang : ");
                                int choose1 = s.nextInt();
                                switch (choose1) {
                                case 1:
                                        s = new Scanner(System.in);
                                        boolean check1 = true;
                                            while(check1){
                                                System.out.print("Enter StudentID:");
                                                String student =  s.nextLine();
                                                for (int j = 0; j < listst.size(); j++) {
                                                    if(student.equals(listst.get(j).getID())){
                                                        mark.setstudent(listst.get(j));
                                                        check1 = false;
                                                    }
                                                }
                                                if(check1){
                                                    System.out.println("Khong co sinh vien nay");
                                                }
                                            }
                                        break;

                                case 2:
                                    boolean check2 = true;
                                    while(check2){
                                        System.out.print("Enter SubjectID:");
                                        String subject =  s.nextLine();
                                        for (int j = 0; j < listsub.size(); j++) {
                                            if(subject.equals(listsub.get(j).getsubjectID())){
                                                mark.setsubject(listsub.get(j));
                                                check2 = false;
                                            }
                                        }
                                        if(check2){
                                                    System.out.println("Khong co mon hoc nay");
                                                }
                                    }
                                    break;
                                case 3:
                                        System.out.println("Edit mark");
                                        s = new Scanner(System.in);
                                        mark.setmark(s.nextLine());
                                        break;
                                case 4:
                                        System.out.println("Exit");
                                        a = false;
                                        break;
                                default:
                                        System.out.println("Thang ngu co dau ma chon");
                                        break;
                                }
                    }
                    check = false;
                }
            }
            if(check){
                System.out.println("Khong co diem nay");
            }
        }
        return true;
    }

    @Override
    public boolean delete(ArrayList<Marks> listma) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can xoa: ");
        String tempID = s.nextLine();
        for (int i = 0; i < listma.size(); i++) {
            if(listma.get(i).getmarkID().equals(tempID)){
                listma.remove(i);
                System.out.println("Xoa thanh cong diem cua 1 thang ngu");
                return true;
            }
            else{
                System.out.println("Co diem nay dau ma xoa!!!");
            }
        }
        return false;
    }

    @Override
    public void show(ArrayList<Marks> listma) {
        for (int i = 0; i < listma.size(); i++) {
            System.out.printf("| %-3s | %-15s | %-15s | %-15s | %-15s| %-15s |%n",i+1, listma.get(i).getmarkID(),listma.get(i).getstudent().getID(),listma.get(i).getstudent().getName(),listma.get(i).getsubject().getsubjectName(),listma.get(i).getmark());
        }
    }

    @Override
    public Object add(ArrayList<Marks> items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(ArrayList<Marks> items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean findID(ArrayList<Marks> items, String id) {
        for (int i = 0; i < items.size(); i++) {
            if(id.equals(items.get(i).getmarkID())){
                return true;
            }
        }
        return false;
    }
  
}
