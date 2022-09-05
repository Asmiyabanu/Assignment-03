import java.util.Scanner;

public class english {
    public static void main(String[] args)
{
showGrade();
}


 
static void showGrade(){
 
    float term_paper,mid_score,final_score,avg;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your First name:");
    sc.next();
    System.out.print("Enter your lastname:");
    sc.next();
    System.out.print("Enter your course:");
    sc.next();
    System.out.print("Enter you term_score:");
    term_paper=sc.nextFloat();
    System.out.print("Enter your Mid-term score:");
    mid_score=sc.nextFloat();
    System.out.print("Enter your Final score:");
    final_score=sc.nextFloat(); 
    avg=(term_paper+mid_score+final_score)/3;
 
    if(avg>=90) System.out.println("Your grade A.");
    else if((avg>=70) && (avg<90)) System.out.println("Your grade B.");
    else if((avg>=50) && (avg<70)) System.out.println("Your grade C.");
    else if(avg<50) System.out.println("Your grade F.");
    else System.out.println("Invalid");
 
 
    }
 
}
    

