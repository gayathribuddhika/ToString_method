
package tostring;


public class SubToString {
    private int year;
    private int month;
    private int day;
    
    public SubToString(int d, int m, int y){
        year = y;
        month = m;
        day = d;
        
        System.out.printf("The Constructor of this is %s\n", this);
    }
    
    public String toString(){
        return String.format("%d/%d/%d", day, month, year);
    }
}
