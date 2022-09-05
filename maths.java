import java.util.Scanner;

public class maths {
    
    public static void main(String[] args)
{
showGrade();
}
 
static void showGrade(){
 
    float quiz_score,test2,final_score,avg;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your First name:");
    sc.next();
    System.out.print("Enter your lastname:");
    sc.next();
    System.out.print("Enter your course:");
    sc.next();
    System.out.print("Enter you quiz score:");
    quiz_score=sc.nextFloat();
    System.out.print("Enter your Test1 score:");
    sc.nextFloat();
    System.out.print("Enter your test2 score:");
    test2=sc.nextFloat(); 
    System.out.print("Enter your final_score:");
    final_score=sc.nextFloat(); 
    avg=(quiz_score+test2+test2+final_score)/3;
 
    if(avg>=90) System.out.println("Your grade A.");
    else if((avg>=70) && (avg<90)) System.out.println("Your grade B.");
    else if((avg>=50) && (avg<70)) System.out.println("Your grade C.");
    else if(avg<50) System.out.println("Your grade F.");
    else System.out.println("Invalid");
 
 
    }
 
}

