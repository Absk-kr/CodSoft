import java.util.*;
public class Number_Game 
{
    public static void Numgame()
    {
        Scanner s=new Scanner(System.in);
        Random rg=new Random();
        int TA=0; //TA-> Total_Attempts
        int win=0;
        int c=rg.nextInt(100);  //c-> Random No
        int A=0; // A -> Attempts

        while(true){
            System.out.print("Guess a Number : ");
            int g=s.nextInt();
            A++;

            if(g>c){
                System.out.println("Its Greater");
            }
            else if(g<c){
                System.out.println("Its lower");
                        
            }
            else{
                System.out.println("Hooray,Correct guess!");
                win++;
                break;
            }
        }
        TA=TA+A;
        System.out.println("Attempt="+A);
        System.out.println("Wins="+win);
        double winrate=(double) win/TA*100;
        System.out.printf("Your winrate is %.2f%%\n",winrate);
    }
    public static void main(String[] args)
    {
        String ans="y";
        do{
            Numgame();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter (y/n) to play again");
            ans=sc.next();
        }
        while(ans.equalsIgnoreCase("y"));
    }

}
