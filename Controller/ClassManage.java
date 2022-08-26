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
    public Class add(ArrayList<Class> listcl) {
        Class cl = new Class();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ClassID:");
        String id = s.nextLine();
        while(findID(listcl,id)){
            System.out.println("Da co ID nay");
            System.out.print("Xin moi nhap lai ID:");
            id = s.nextLine();
        }
        cl.setclassID(id);
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
            if(listcl.get(i).getclassID().equals(classID)){
                System.out.print("Nhap ten can sua:");
                listcl.get(i).setclassName(s.nextLine());
                System.out.println("Sua thanh cong!!");
                return true;
            }
        }
        System.out.println("Khong co lop nay");
        return false;
    }

    @Override
    public boolean delete(ArrayList<Class> listcl) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can xoa: ");
        String classID = s.nextLine();
        for (int i = 0; i < listcl.size(); i++) {
            if(listcl.get(i).getclassID().equals(classID)){
                listcl.remove(i);
                return true;
            }
        }
        System.out.println("Khong co lop nay dau ma xoa");
        return false;
    }

    @Override
    public void show(ArrayList<Class> listcl) {
        for (int i = 0; i < listcl.size(); i++) {
            System.out.printf("| %-3s | %-10s | %-10s |%n",i+1, listcl.get(i).getclassID(),listcl.get(i).getclassName());
        }
    }

    @Override
    public boolean findID(ArrayList<Class> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getclassID())){
                return true;
            }
        }
        return false;
    }

    
}
