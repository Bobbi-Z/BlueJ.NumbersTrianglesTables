 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        for (int column = 1; column <= 5 ; column++){ 
           for (int modifier = 1; modifier <= 5; modifier++){ 
                   table += String.format("%3s |",(column * modifier)); 
            }
            table += "\n"; 
        } 
        return table;
    }   
    
    public static String getLargeMultiplicationTable() {
        String table = "";
        for (int column = 1; column <= 10 ; column++){ 
           for (int modifier = 1; modifier <= 10; modifier++){ 
                   table += String.format("%3s |",(column * modifier)); 
            }
            table += "\n"; 
        } 
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for (int column = 1; column <= tableSize ; column++){ 
           for (int modifier = 1; modifier <= tableSize; modifier++){ 
                   table += String.format("%3s |",(column * modifier)); 
            }
            table += "\n"; 
        } 
        return table;
    }
}
