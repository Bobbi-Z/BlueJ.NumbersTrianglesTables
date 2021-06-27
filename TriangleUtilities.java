 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
    String out = "";
    for (int s = 1; s <= numberOfStars; s++){ 
        out += "*";
    }
    return out;
    }
    
    public static String getTriangle(int numberOfRows) {
    String out = "";
    for (int rows = 1; rows <= numberOfRows; rows++ ){
       for (int stars = 1; stars <= rows; stars++){ 
           out += "*";
    }
    out += "\n";
    }
    return out;
}


    public static String getSmallTriangle() {
        String out = "";
        int base = 4;
        for (int row = 1; row <= base; row++){
            for (int stars = 1; stars <= row; stars++){
                out += "*";
            }
            out += "\n";
        }
        return out;
    }

    public static String getLargeTriangle() {
        String out = "";
        int base = 9;
        for (int row =1; row <= base; row++){
            for (int stars = 1; stars <= row; stars++){
                out += "*";
            }
            out += "\n";
    }
    return out;
}
}