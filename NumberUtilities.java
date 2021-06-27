
import static java.lang.Math.*;

public class NumberUtilities {


    public static String getRange(int stop) {
     String outcome = "";
     for (int n = 0; n < stop; n++){
         outcome += n;
        }
     return outcome;
    }
     
    public static String getRange(int start, int stop) {
    String outcome = "";
     for (int n = start; n < stop; n++){
         outcome += n;
        }
     return outcome;
    }


    public static String getRange(int start, int stop, int step) {
    String outcome = "";
     for (int n = start; n < stop; n+= step){
         outcome += n;
        }
     return outcome;
    }

    public static String getEvenNumbers(int start, int stop) {
    String outcome = "";
     for (int n = start; n < stop; n++){
         if (n % 2 == 0){
             outcome += n;
        }
    }
    
return outcome;
    }


    public static String getOddNumbers(int start, int stop) {
        String outcome = "";
            for (int n = start; n < stop; n+=2) {
                if (n % 2 != 0){
            outcome += n;
            
            } 
            
        }
      return outcome;
}


    public static String getExponentiations(int start, int stop, int exponent) {
        String outcome = "";
        
        for (int n = start; n <= stop; n++) {
             
            int o = (int)Math.pow(n,exponent);
            outcome += o;
        } return outcome;
    }
}
    

