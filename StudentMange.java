package Tset01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMange {
    private static ArrayList<Object> stu = new ArrayList<>();
    public static void addstudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名:");
        String studentname=sc.nextLine();
        System.out.println("请输入学生的年龄:");
        Integer studentage = sc.nextInt();
        System.out.println("请输入学生的性别:");
        String studentsex=sc.next();
        System.out.println("请输入学生的学号:");
        String studentid = sc.next();
        Student student = getByStuId(studentid,false);
        if (student!=null){
            System.out.println("该学号被使用");
            return;
        }
        stu.add(new Student(studentname,studentage,studentsex,studentid));
    }
    public static void deleteStudent(){
        System.out.println("请输入删除的学号:");
        Scanner sc = new Scanner(System.in);
        String studentid = sc.nextLine();
        Student student = getByStuId(studentid,true);
        if (student==null){
            System.out.println("未找到该学生");
            return;
        }
        System.out.println("删除成功");
    }


    public static Student getByStuId(String studentid,boolean isDelete){
        for (int i=0;i<stu.size();i++){
           Student student = (Student) stu.get(i);
           if (student.getId().equals(studentid)){
               if (isDelete==true){
                   stu.remove(i);
               }
               return student;
           }
        }
        return null;

    }
    public static void showstudent(){
        if (stu.size()==0){
            System.out.println("无信息");
            return;
        }
        System.out.println("姓名\t\t年龄\t\t性别\t\t学号\t\t");
        for (int i=0;i<stu.size();i++){
            System.out.println(stu.get(i));
        }

    }
    public static void updatastu(){
        System.out.println("请输入学生的学号:");
        Scanner sc = new Scanner(System.in);
        String studentid = sc.nextLine();
        Student student = getByStuId(studentid,false);
        if (student == null){
            System.out.println("没有该学生");
            return;
        }
        System.out.println("请输入需要修改的新的名称：");
        String newname = sc.next();
        System.out.println("请输入需要修改的新的年龄：");
        Integer newage = sc.nextInt();
        System.out.println("请输入需要修改的新的性别：");
        String newsex = sc.next();
        student.setName(newname);
        student.setAge(newage);
        student.setSex(newsex);
        System.out.println("修改成功1");
    }

    public static void main(String[] args) {

        while (true){
            System.out.println("---欢迎来到学生管理系统---");
            System.out.println("1.新增学生");
            System.out.println("2.修改学生");
            System.out.println("3.删除学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请选择【1-5】");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number){
                case 1:
                    System.out.println("新增学生");
                    addstudent();
                    break;
                case 2:
                    System.out.println("修改学生");
                    updatastu();
                    break;
                case 3:
                    System.out.println("删除学生");
                    deleteStudent();
                    break;
                case 4:
                    System.out.println("查询学生");
                    showstudent();
                    break;
                case 5:
                    System.out.println("退出系统");
                    System.exit(0);
                    break;
            }
        }

    }
}
