import java.util.*;
public class studGradeCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total No of Subjects : ");
        int ts=sc.nextInt();
        float avg=0;
        for(int i=1;i<=ts;i++){
            System.out.print("Enter Subject "+i+" Marks : ");
            int mks=sc.nextInt();
            avg+=mks;
        }
       int maxmks=ts*100;
        avg/=maxmks;
        avg*=100;
        System.out.println("Student Average percentage is : "+avg);
        System.out.print("Student Grade is : ");
        if(avg>=97 && avg<=100){
            System.out.println("A+");
        }
        if(avg>=93 && avg<=96){
            System.out.println("A");
        }
        else if(avg<=92 && avg>=90){
            System.out.println("A-");
        }
        else if(avg>=87 && avg<=89){
            System.out.println("B+");
        }
        else if(avg>=83 && avg<=86){
            System.out.println("B");
        }
        else if(avg>=80 && avg<=82){
            System.out.println("B-");
        }
        else if(avg>=77 && avg<=79){
            System.out.println("C+");
        }
        else if(avg>=73 && avg<=76){
            System.out.println("C");
        }
        else if(avg>=70 && avg<=72){
            System.out.println("C-");
        }
        else if(avg>=67 && avg<=69){
            System.out.println("D+");
        }
        else if(avg>=65 && avg<=66){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}