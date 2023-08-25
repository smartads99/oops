import java.util.Arrays;
import java.util.Scanner;

public class oops1 {
    public static void main(String[] args) {
    int num=123;
    String name="boobesh";
    float mark=78.3f;
//        System.out.println(num);
//        System.out.println(name);
//        System.out.println(mark);
//        Student boobesh=new Student();
//        boobesh.roll=2324;
//        boobesh.name="boobesh";
//        boobesh.mark=78.5f;

//        System.out.println(boobesh.roll);
//        System.out.println(boobesh.name);
//        System.out.println(boobesh.mark);

        Student test=new Student(55,"testname",88.7f);
       test.display();
        Student withname=new Student();
       withname.display();
        Student test2=new Student(33,"test2",44.5f);
        test2.display();
    }
}
class Student{
    Scanner in=new Scanner(System.in);
    int roll;
    String name;
    float mark;
    Student(){
        System.out.println("you do not have any val so pls Enter the val of the class ");
        System.out.println("Enter the roll number:");
        int rn= in.nextInt();
        System.out.println("Enter the Name:");
        String n=in.next();
        System.out.println("Enter the mark");
        float m= in.nextFloat();
        this.roll=rn;
        this.name=n;
        this.mark=m;
    }
    void display(){
        System.out.println(this.roll);
        System.out.println(this.name);
        System.out.println(this.mark);
    }
    Student(int roll,String name, float mark){
        this.roll=roll;
        this.name=name;
        this.mark=mark;
    }
}