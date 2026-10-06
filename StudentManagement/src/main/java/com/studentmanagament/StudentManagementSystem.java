package com.studentmanagament;
import java.util.*;
public class StudentManagementSystem {
   public String name;
   public int roll;
   public int telugu;
   public int hindi;
   public int english;
   public int maths;
   public int science;
   public int social;
   public String total;
   public double average;
   public String grade;
   StudentManagementSystem(String name, int roll, int telugu, int hindi, int english, int maths, int science, int social){
	   this.name=name;
	   this.roll=roll;
	   this.telugu=telugu;
	   this.hindi=hindi;
	   this.english=english;
	   this.maths=maths;
	   this.science=science;
	   this.social=social;
	   calculate();
   }
   public StudentManagementSystem(String name2, int roll2, int telugu2, int hindi2, int english2, int maths2, int science2,
		int social2) {
	// TODO Auto-generated constructor stub
}
   public void calculate() {
	 total=telugu+hindi+english+maths+science+social;
	 if(telugu<35 || hindi<35 || english<35 || maths<35 || science<35 ||social<35) {
		 average=total/6.0;
		 String result="Failed";
		 System.out.println("Average  and total of student marks:"+average+" and "+total);
	 }
	 else {
		 average=total/6.0;
		 String passed="Passed";
		 if(grade>=90) {
			 grade="A";
		 }
		 else if(grade>=75) {
			 grade="B";
		 }
		 else if(grade>=60) {
			 grade="C";
		 }
		 else if(grade>=50) {
			 grade="D";
		 }
		 else {
			 grade="You are not eligible";
		 }
	 	}
	}
   	public void display() {
   		System.out.println("Name of the Student:"+name);
   		System.out.println("Student roll:"+roll);
   		System.out.println("Telugu:"+telugu);
   		System.out.println("Hindi:"+hindi);
   		System.out.println("English:"+english);
   		System.out.println("Maths:"+maths);
   		System.out.println("Science:"+science);
   		System.out.println("Social:"+social);
   		System.out.println("Total:"+total);
   		System.out.println("Average:"+average);
   		System.out.println("Grade:"+grade);
   		System.out.println("----------------Student Report Card---------------");
   	}
}
class Main{
	public static void main(String[]args) {
		Scanner sin=new Scanner(System.in);
		ArrayList<Student> list=new ArrayList<>();
		int choice;
		do {
			System.out.println("\n=====Student Management System ======");
			System.out.println("1.Add Student");
			System.out.println("2.Display the Students");
			System.out.println("3.Search the Student");
			System.out.println("4.Update the Student");
			System.out.println("5.Delete the student");
			System.out.println("6.Exit");
			System.out.println("Enter your choice:");
			choice=sin.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter Roll:");
					int roll=sin.nextInt();
					System.out.println("Enter Name:");
					String name=sin.next();
					System.out.println("Enter Telugu marks:");
					int telugu=sin.nextInt();
					System.out.println("Enter Hindi marks:");
					int hindi=sin.nextInt();
					System.out.println("Enter English marks:");
					int english=sin.nextInt();
					System.out.println("Enter Maths marks:");
					int maths=sin.nextInt();
					System.out.println("Enter Science marks:");
					int science=sin.nextInt();
					System.out.println("Enter Social marks:");
					int social=sin.nextInt();
					StudentManagementSystem s=new StudentManagementSystem(name, roll, telugu, hindi, english, maths, science, social);
					list.add(s);
					System.out.println("Student added Successfully");
					break;
				case 2:
					for(StudentManagementSystem st:list) {
						st.display();
					}
					break;
				case 3:
					System.out.println("Enter Roll no to search the student in a list:");
					int sRoll=sin.nextInt();
					boolean found=false;
					for(StudentManagementSystem st:list) {
						if(st==sRoll) {
							System.out.println("Student found in the list ");
							st.display();
							found=true;
							
						}
						else {
							System.out.println("Student is not found");
						}
					}
					break;
				case 4:
					System.out.println("Enter Roll no to update the data");
					int sUpdate=sin.nextInt();
					for(StudentManagementSystem st:list) {
						if(st.roll==sUpdate) {
							System.out.println("Enter new Telugu marks:");
							st.telugu=sin.nextInt();
							System.out.println("Enter new hindi marks:");
							st.hindi=sin.nextInt();
							System.out.println("Enter new english marks:");
							st.english=sin.nextInt();
							System.out.println("Enter new maths marks:");
							st.maths=sin.nextInt();
							System.out.println("Enter new science marks:");
							st.science=sin.nextInt();
							System.out.println("Enter new social marks:");
							st.social=sin.nextInt();
							
						}
					}
					break;
				case 5:
					System.out.println("Enter Student Roll no to delete");
					int deleteRoll=sin.nextInt();
					Iterator<StudentManagementSystem> it=list.iterator();
					while(it.hasNext()) {
						Student st=it.next();
						if(st.roll==deleteRoll) {
							it.remove();
							System.out.println("Student deleted");
						}
					}
					break;
				case 6:
					System.out.println("Exiting......");
					break;
				default:
					System.out.println("Invalid choice");
			}
		}while(choice!=6);
		
	}
}

