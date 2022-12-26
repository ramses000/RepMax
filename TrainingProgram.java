import java.util.Scanner;
public class TrainingProgram {
    public static void main (String[] args) throws Exception {
        double lowRep, highRep;
        double repMax=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Do you know your one-rep max?");
        String question1= inp.next();
//Find One-Rep Max
        if(question1.toLowerCase().equals("no")){
            System.out.println("Please find your one-rep max to continue");
            System.out.println("Input your point of failure weight and reps");
            double failweight = inp.nextDouble();
            int failReps = inp.nextInt();
            if (failReps>12){
                System.out.println("Please increase the weight until you fail under 13 reps");
                System.out.println("Input your point of failure weight and reps");
                failweight = inp.nextDouble();
                failReps = inp.nextInt();
            }
            repMax = findMax(failweight, failReps);
        } else if(question1.toLowerCase().equals("yes")){
            System.out.println("Please input your one-rep max");
            repMax = inp.nextDouble();
        } else {
            System.out.println("Please enter yes or no");
            System.exit(0); 
        }
//Hypertrophy or Strength
        System.out.println("Would you like to train for strength or hypertrophy? ");
        String question2= inp.next();
        if(question2.toLowerCase().equals("strength")){
            System.out.println("Optimal repetitions for strength is 2-5 repetitions");
            lowRep = repMax*.97;
            highRep = repMax*.89;
            System.out.printf("%s%.2f%s%.2f%n","Your optimal weight range for strength is ", highRep , "-",lowRep);
            System.out.println("Optimal rest periods for strength is 2-5 minutes");
        }
        if(question2.toLowerCase().equals("hypertrophy")){
            System.out.println("Optimal repetitions for hypertrophy is 6-9 repetitions");
            lowRep = repMax*.86;
            highRep = repMax*.78;
            
            System.out.printf("%s%.2f%s%.2f%n","Your optimal weight range for hypertrophy is ", highRep , "-",lowRep);
            System.out.println("Optimal rest periods for strength is 30-90 seconds");
        }
        
            System.out.println();
        
        System.out.println("Would you like a table of your weight and assumed rep range displayed: ");
        

        String question3= inp.next();
//Find One-Rep Max
        if(question3.toLowerCase().equals("no")){
            System.exit(0);
        } else if(question3.toLowerCase().equals("yes")){
            System.out.printf("%-9s %-4s %-7s %-4s %-4s%n", "Weight", "x", "Reps", "=", "%");
            double j=1;
            int z = 100;
            
        
            for(int i=1; i<=10; i++){
                System.out.printf("%-10.2f%-7s%-6d%-4s%-4d%n", repMax*j, "x", i, "=", z);
                j-=.0278;
                z-=3;
            }
        } else {
            System.out.println("Please enter yes or no");
            System.exit(0); 
        }


       
        
    }
    public static double findMax (double weight, int reps){
        double max =0;
        switch (reps) {
        case 1:
            max = weight;
            break;
        case 2:
            max = weight/.9722;
            break;
        case 3:
            max = weight/.9444;
            break;
        case 4:
            max = weight/.9166;
            break;
        case 5:
            max = weight/.8888;
            break;
        case 6:
            max = weight/.861;
            break;
        case 7:
            max = weight/.8332;
            break;
        case 8:
            max = weight/.8054;
            break;
        case 9:
            max = weight/.7767;
            break;
        case 10:
            max = weight/.750;
            break;
        case 11:
            max = weight /.7317;
            break;
        case 12:
            max = weight /.7143;
            break;
        }
        return max;
    }
}
