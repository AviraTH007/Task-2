
package com.mycompany.studentgradecalculator;

import java.util.*;

public class StudentGradeCalculator {
     public static void main(String[] args) {
       //int sub;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of subjects ");
       int sub=sc.nextInt();
       int marks[]=new int[sub];
       for(int i=0;i<sub;i++){
            System.out.println("Enter subject"+(i+1)+" marks");
            marks[i]=sc.nextInt();
       }
       StudentGradeCalculator obj=new StudentGradeCalculator();
       obj.GradeCalculator(marks,sub);
    
    }
     
   public void GradeCalculator(int marks[],int sub){
       int total=0;
       char grade;
       for(int i=0;i<sub;i++){
            total=total+marks[i];
       }
       float avg=total/sub;
       if(avg>=90 && avg<=100)
           grade='S';
       else if(avg>=80 && avg<90)
           grade='A';
       else if(avg>=70 && avg<80)
           grade='B';
       else if(avg>=60 && avg<70)
           grade='C';
       else if(avg>=50 && avg<60)
           grade='D';
       else if(avg>=40 && avg<50)
           grade='E';
       else
           grade='F';
        
       StudentGradeCalculator obj1=new StudentGradeCalculator();
       obj1.display(marks, sub,total,avg,grade);

 }
   
   public void display(int marks[],int sub,int total,float avg,char grade){
       System.out.println("\nRESULTS");
       for(int i=0;i<sub;i++){
            System.out.println("Subject"+(i+1)+" marks="+marks[i]);
       }
       System.out.println("Total of "+sub+" subjects="+total);
       System.out.println("Average of "+sub+" subjects="+avg);
       System.out.println("Grade="+grade);
   }
}
