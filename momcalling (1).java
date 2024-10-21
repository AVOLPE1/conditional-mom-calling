import java.util.Scanner;
public class momcalling
{
    public static void main(String[] args) {
        int mom = (int)(Math.random() * 2);
        
        Scanner input = new Scanner (System.in);
        
        System.out.print ("what time did you go to bed last night?");
        int bedtime = input.nextInt();
        if ((bedtime > 0) && (bedtime < 5)){
        System.out.println ("you sleep through your phone alarm");
            return;
        }
        if( (bedtime > 12) && (bedtime < 24))
        System.out.println ("you wake up to your phone alarm");
        
        
        
        final int yes = 1;
        final int no = 2;
        
        System.out.print ("what time is it?");
        double time = input.nextDouble();
        if (time > 12)
        System.out.print ("you answer the phone");
        else if ((time < 12) && (time > 8))
        System.out.print ("check who is calling (1) yes (2) no");
    
        int yesno = input.nextInt();
        if (yesno != yes && yesno != no) {
            System.out.print ("you missed the call");}
            
        if (yesno == yes)
        System.out.println("you check the phone...");
        else
        System.out.println("you missed the call");
        
        if (mom == 0)
        System.out.println("your mom is calling!! answer the phone!!");
        else
        System.out.println("it is not your mom, you go back to sleep.");
        
        
        
        
    }
}
