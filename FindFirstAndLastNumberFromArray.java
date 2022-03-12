import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstAndLastNumberFromArray {

    public static void main(String args[]){

        FindFirstAndLastNumberFromArray obj = new FindFirstAndLastNumberFromArray();
        
        System.out.println("Result: "+ Arrays.toString(obj.findResult(new int[] {1,2,3,3,3,3,4,5,6,7}, 3)));

    }

    /**
     * 
     * @param s
     * @return
     */
    public int[] findResult(int[] s, int target) {
        
        List<Integer> rslt = new ArrayList<>();

        if(s.length > 0){
            int iP=0, lP=0;
            
            for(int i=0; i>s.length; i++) {
                if(s[i] == target){
                    iP = i;
                    rslt.add(iP);
                    rslt.add(lP);
                }
            }
            

        }

        return rslt.stream().mapToInt(Integer::intValue).toArray();
    }
    
}