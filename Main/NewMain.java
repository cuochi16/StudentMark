/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.AdminManage;
import Controller.ClassManage;
import Controller.MarkManage;
import Controller.StudentManage;
import Controller.SubjectManage;
import StudentManagement.Admin;
import StudentManagement.Student;
import StudentManagement.Class;
import StudentManagement.Marks;
import StudentManagement.Subject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AdminManage adm = new AdminManage();
        ArrayList<Admin> admin = new ArrayList<>();
        StudentManage stm = new StudentManage();
        ArrayList<Student> student = new ArrayList<>();
        SubjectManage subm = new SubjectManage();
        ArrayList<Subject> subject = new ArrayList<>();
        ClassManage clm = new ClassManage();
        ArrayList<Class> classs = new ArrayList<>();
        MarkManage markm = new MarkManage();
        ArrayList<Marks> mark = new ArrayList<>();
        while(true)
        {
            System.out.println("****************************");
            System.out.println("||    1.Admin Manage       ||");
            System.out.println("||    2.Student Manage     ||");
            System.out.println("||    3.Subject Manage     ||");
            System.out.println("||    4.Class Manage       ||");
            System.out.println("||    5.Mark Manage        ||");
            System.out.println("||    6.Exit               ||");
            System.out.println("****************************");
            System.out.print("Chon chuc nang : ");
            int choose = s.nextInt();
            switch (choose) {
            case 1:
                    MenuAdmin(adm, admin);
                    break;
            case 2:
                    MenuStudent(stm, student);
                    break;
            case 3:
                    MenuSubject(subm, subject);
                    break;
            case 4:
                    MenuClass(clm, classs);
                    break;
            case 5:
                    MenuMark(markm, mark, student, subject);
                    break;
            default:
                    System.out.println("Thang ngu co dau ma chon");
                    break;
            }
        }
        
    }

    private static void MenuAdmin(AdminManage adm, ArrayList<Admin> admin){
        Scanner s = new Scanner(System.in);
        boolean menuad = true;
        while(menuad)
        {
            System.out.println("*******Admin Manage******");
            System.out.println("||       1.Add         ||");
            System.out.println("||       2.Edit        ||");
            System.out.println("||       3.Delete      ||");
            System.out.println("||       4.Show        ||");
            System.out.println("||       5.Exit        ||");
            System.out.println("*************************");
                System.out.print("Chon chuc nang : ");
			int choosead = s.nextInt();
			switch (choosead) {
			case 1:
				System.out.println("Add");
                                admin.add(adm.add());
				break;
			case 2:
				System.out.println("Edit");
                                adm.edit(admin);
				break;
			case 3:
				System.out.println("Delete");
                                adm.delete(admin);
				break;
                        case 4:
				System.out.println("Show");
                                System.out.printf("| %-3s | %-10s | %-30s | %-20s | %-15s |%n","ID","Name","DoB","Email","PhoneNumber","Address");
                                adm.show(admin);
				break;
			case 5:
                                menuad = false;
				break;
			default:
				System.out.println("Thang ngu co dau ma chon");
				break;
			}
        }
    }
    private static void MenuStudent(StudentManage stm, ArrayList<Student> student){
        Scanner s = new Scanner(System.in);
        boolean menuad = true;
        while(menuad)
        {
            System.out.println("*****Student Manage******");
            System.out.println("||       1.Add         ||");
            System.out.println("||       2.Edit        ||");
            System.out.println("||       3.Delete      ||");
            System.out.println("||       4.Show        ||");
            System.out.println("||       5.Exit        ||");
            System.out.println("*************************");
            System.out.print("Chon chuc nang : ");
            int choosead = s.nextInt();
            switch (choosead) {
            case 1:
                    System.out.println("Add");
                    student.add(stm.add());
                    break;   
            case 2:
                    System.out.println("Edit");
                    stm.edit(student);
                    break;
            case 3:
                    System.out.println("Delete");
                    stm.delete(student);
                    break;
            case 4:
                    System.out.println("Show");
                    System.out.printf("|%-10s |%-15s | %-30s | %-15s| %-15s|%-10s |%n","ID","Name","DoB","Email","PhoneNumber","Address");
                    stm.show(student);
                    break;
            case 5:
                    menuad = false;
                    break;
            default:
                    System.out.println("Thang ngu co dau ma chon");
                    break;
            }
        }
    }
    private static void MenuSubject(SubjectManage subm, ArrayList<Subject> subject){
        Scanner s = new Scanner(System.in);
        boolean menusub = true;
        while(menusub)
        {
            System.out.println("*****Student Manage******");
            System.out.println("||       1.Add         ||");
            System.out.println("||       2.Edit        ||");
            System.out.println("||       3.Delete      ||");
            System.out.println("||       4.Show        ||");
            System.out.println("||       5.Exit        ||");
            System.out.println("*************************");
            System.out.print("Chon chuc nang : ");
            int choosead = s.nextInt();
            switch (choosead) {
            case 1:
                    System.out.println("Add");
                    subject.add(subm.add());
                    break;   
            case 2:
                    System.out.println("Edit");
                    subm.edit(subject);
                    break;
            case 3:
                    System.out.println("Delete");
                    subm.delete(subject);
                    break;
            case 4:
                    System.out.println("Show");
                    System.out.printf("| %-10s | %-10s |%n","ID","Name");
                    subm.show(subject);
                    break;
            case 5:
                    menusub = false;
                    break;
            default:
                    System.out.println("Thang ngu co dau ma chon");
                    break;
            }
        }
    }
    private static void MenuClass(ClassManage clm, ArrayList<Class> classs){
        Scanner s = new Scanner(System.in);
        boolean menucl = true;
        while(menucl)
        {
            System.out.println("******Class Manage******");
            System.out.println("||       1.Add         ||");
            System.out.println("||       2.Edit        ||");
            System.out.println("||       3.Delete      ||");
            System.out.println("||       4.Show        ||");
            System.out.println("||       5.Exit        ||");
            System.out.println("*************************");
            System.out.print("Chon chuc nang : ");
            int choosecl = s.nextInt();
            switch (choosecl) {
            case 1:
                    System.out.println("Add");
                    classs.add(clm.add());
                    break;   
            case 2:
                    System.out.println("Edit");
                    clm.edit(classs);
                    break;
            case 3:
                    System.out.println("Delete");
                    clm.delete(classs);
                    break;
            case 4:
                    System.out.println("Show");
                    System.out.printf("| %-10s | %-10s |%n","ID","Name");
                    clm.show(classs);
                    break;
            case 5:
                    menucl = false;
                    break;
            default:
                    System.out.println("Thang ngu co dau ma chon");
                    break;
            }
        }
    }
    private static void MenuMark(MarkManage markm, ArrayList<Marks> listma, ArrayList<Student> listst, ArrayList<Subject> listsub){
        Scanner s = new Scanner(System.in);
        boolean menuma = true;
        while(menuma)
        {
            System.out.println("*****Student Marks******");
            System.out.println("||       1.Add         ||");
            System.out.println("||       2.Edit        ||");
            System.out.println("||       3.Delete      ||");
            System.out.println("||       4.Show        ||");
            System.out.println("||       5.Exit        ||");
            System.out.println("*************************");
            System.out.print("Chon chuc nang : ");
            int choosead = s.nextInt();
            switch (choosead) {
            case 1:
                    System.out.println("Add");
                    listma.add(markm.add(listma,listst,listsub));
                    break;   
            case 2:
                    System.out.println("Edit");
                    markm.edit(listma,listst,listsub);
                    break;
            case 3:
                    System.out.println("Delete");
                    markm.delete(listma);
                    break;
            case 4:
                    System.out.println("Show");
                    System.out.printf("| %-15s | %-15s | %-15s | %-15s| %-15s |%n","ID","StudentID","StudentName","SubjectName","Mark");
                    markm.show(listma);
                    break;
            case 5:
                    menuma = false;
                    break;
            default:
                    System.out.println("Thang ngu co dau ma chon");
                    break;
            }
        }
    }
}
