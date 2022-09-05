import java.util.Scanner;

public class science {

    public static void main(String[] args)
{
showGrade();
}
 
class advanced extends StudentClass
{

    public advanced(String firstname, String lastname, String course) {
        super(firstname, lastname, course);
        //TODO Auto-generated constructor stub
    }

}
static void showGrade(){
 
    float attendance,project,mid_score,final_score,avg;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter your First name:");
        sc.next();
        System.out.print("Enter your lastname:");
        sc.next();
        System.out.print("Enter your course:");
        sc.next();
        System.out.print("Enter you attendance:");
        attendance=sc.nextFloat();
        System.out.print("Enter your project score:");
        project=sc.nextFloat(); 
        System.out.print("Enter your Mid-term score:");
        mid_score=sc.nextFloat();
        System.out.print("Enter your Final score:");
        final_score=sc.nextFloat();
    
    }
    avg=(attendance+project +mid_score+final_score)/4;
 
    if(avg>=90) System.out.println("Your grade A.");
    else if((avg>=70) && (avg<90)) System.out.println("Your grade B.");
    else if((avg>=50) && (avg<70)) System.out.println("Your grade C.");
    else if(avg<50) System.out.println("Your grade F.");
    else System.out.println("Invalid");
 
 
    }
 
}
    

