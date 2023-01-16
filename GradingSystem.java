import java.util.*;

public class GradingSystem{
    public static void main(String[] args){
        System.out.println("Please input marks: ");
        Scanner scn = new Scanner(System.in);
        int grad_marks = scn.nextInt();
        if(grad_marks > 90){
            System.out.println("Excellent");
        }
        else if(grad_marks > 80){
            System.out.println("Good");
        }
        else if(grad_marks > 70){
            System.out.println("Fair");
        }
        else if(grad_marks > 60){
            System.out.println("Meets Expectations");
        }
        else{
            System.out.println("Below par");
        }
    }
}
