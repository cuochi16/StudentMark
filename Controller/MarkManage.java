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
        System.out.print("Enter StudentID:");
        String student =  s.nextLine();
        int countst = 0;
        for (int i = 0; i < listst.size(); i++) {
            if(student.equals(listst.get(i).getstudentId())){
                mark.setstudent(listst.get(i));
                break;
            }
            else{
                countst++;
            }
        }
        if(countst==listst.size()){
            System.out.println("Khong co sinh vien nay");
        }
        System.out.print("Enter SubjectID:");
        String subject =  s.nextLine();
        int countsub=0;
        for (int i = 0; i < listsub.size(); i++) {
            if(subject.equals(listsub.get(i).getsubjectID())){
                mark.setsubject(listsub.get(i));
                break;
            }
            else{
                countsub++;
            }
        }
        if(countsub==listsub.size()){
            System.out.println("Khong co mon hoc nay");
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
                                    System.out.print("Edit studentID: ");
                                    s = new Scanner(System.in);
                                    String student =  s.nextLine();
                                    int countst = 0;
                                    for (int j = 0; j < listst.size(); i++) {
                                        if(student.equals(listst.get(j).getstudentId())){
                                            mark.setstudent(listst.get(j));
                                            break;
                                        }
                                        else{
                                            countst++;
                                        }
                                    }
                                    if(countst==listst.size()){
                                        System.out.println("Khong co sinh vien nay dau ma sua");
                                    }
                                    break;

                            case 2:
                                    System.out.println("Edit subjectID");
                                    String subject =  s.nextLine();
                                    int countsub = 0;
                                    for (int j = 0; j < listsub.size(); j++) {
                                        if(subject.equals(listsub.get(j).getsubjectID())){
                                            mark.setsubject(listsub.get(j));
                                            break;
                                        }
                                        else{
                                            countsub++;
                                        }
                                    }
                                    if(countsub==listsub.size()){
                                        System.out.println("Khong co mon hoc nay");
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
            }
            else{
                System.out.println("Khong tim thay ID nay");
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
            }
            else{
                System.out.println("Co diem nay dau ma xoa!!!");
            }
        }
        return true;
    }

    @Override
    public void show(ArrayList<Marks> listma) {
        for (int i = 0; i < listma.size(); i++) {
            System.out.printf("| %-15s | %-15s | %-15s | %-15s| %-15s |%n", listma.get(i).getmarkID(),listma.get(i).getstudent().getstudentId(),listma.get(i).getstudent().getstudentName(),listma.get(i).getsubject().getsubjectName(),listma.get(i).getmark());
        }
    }

    @Override
    public Object add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(ArrayList<Marks> items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
