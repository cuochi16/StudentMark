/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interface.Action;
import StudentManagement.Admin;
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
public class AdminManage implements Action<Admin> {

    @Override
    public Admin add() {
        Admin ad = new Admin();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter AdminID:");
        ad.setID(s.nextLine());
        System.out.print("Enter Name:");
        ad.setName(s.nextLine());
        System.out.print("Enter Email:");
        ad.setEmail(s.nextLine());
        System.out.print("Enter Position:");
        ad.setPosition(s.nextLine());
        return ad;
    }

    @Override
    public boolean edit(ArrayList<Admin> listad) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can sua: ");
        String tempID = s.nextLine();
        for (int i = 0; i < listad.size(); i++) {
            Admin admin = listad.get(i);
            if(admin.getID().equals(tempID)){
                boolean a = true;
                while(a)
                {
                    System.out.println("****************************");
                    System.out.println("1.Edit name");
                    System.out.println("2.Edit email");
                    System.out.println("3.Edit position");
                    System.out.println("4.Exit");
                    System.out.print("Chon chuc nang : ");
                            int check = s.nextInt();
                            switch (check) {
                            case 1:
                                    System.out.print("Edit name: ");
                                    s = new Scanner(System.in);
                                    String temp = s.nextLine();
                                    admin.setName(temp);
                                    break;
                            case 2:
                                    System.out.print("Edit email");
                                    s = new Scanner(System.in);
                                    admin.setEmail(s.nextLine());
                                    break;
                            case 3:
                                    System.out.print("Edit position");
                                    s = new Scanner(System.in);
                                    admin.setPosition(s.nextLine());
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
    public boolean delete(ArrayList<Admin> listad) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can xoa: ");
        String tempID = s.nextLine();
        for (int i = 0; i < listad.size(); i++) {
            if(listad.get(i).getID().equals(tempID)){
                System.out.println("Ban co chac chan muon xoa?? Yes || No");
                String comfirm = s.nextLine();
                if(comfirm.equals("Yes"))
                listad.remove(i);
                System.out.println("Xoa thanh cong 1 thang ngu");
            }
            else{
                System.out.println("Co thang nay dau ma xoa thang dan don!!!");
            }
        }
        return true;
    }

    @Override
    public void show(ArrayList<Admin> listad) {
        for (int i = 0; i < listad.size(); i++) {
            System.out.printf("| %-3s | %-15s | %-30s | %-15s | %-15s |%n",i+1, listad.get(i).getID(),listad.get(i).getName(),listad.get(i).getEmail(),listad.get(i).getPosition());
        }
        
    }

}
