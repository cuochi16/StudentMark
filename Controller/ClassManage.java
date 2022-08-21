/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interface.Action;
import java.util.ArrayList;
import StudentManagement.Class;
import java.util.Scanner;

/**
 *
 * @author H
 */
public class ClassManage implements Action<Class>{

    @Override
    public Class add() {
        Class cl = new Class();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ClassID:");
        cl.setclassID(s.nextLine());
        System.out.print("Enter ClassName:");
        cl.setclassName(s.nextLine());
        return cl;
    }

    @Override
    public boolean edit(ArrayList<Class> listcl) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can sua: ");
        String classID = s.nextLine();
        for (int i = 0; i < listcl.size(); i++) {
            if(listcl.get(i).equals(classID)){
                System.out.print("Nhap ten can sua:");
                listcl.get(i).setclassName(s.nextLine());
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
    public boolean delete(ArrayList<Class> listcl) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can xoa: ");
        String classID = s.nextLine();
        for (int i = 0; i < listcl.size(); i++) {
            if(listcl.get(i).equals(classID)){
                System.out.print("Nhap ten can sua:");
                listcl.get(i).setclassName(s.nextLine());
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
    public void show(ArrayList<Class> listcl) {
        for (int i = 0; i < listcl.size(); i++) {
            System.out.printf("| %-10s | %-10s |%n", listcl.get(i).getclassID(),listcl.get(i).getclassName());
        }
    }

    
}
