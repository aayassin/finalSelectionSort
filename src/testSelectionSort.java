import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class testSelectionSort {
	
	FinalSort sort = new FinalSort();

    @Test
    public void testPositive(){
        int[] arr = new int[]{8,9,7,10,2};
        int[] res = new int[]{2,7,8,9,10};
        FinalSort.sort(arr);
        assert(Arrays.equals(arr,res));
    }

    @Test
    public void testNegatives(){
        int[] arr = new int[]{-8,-9,-7,-10,-2};
        int[] res = new int[]{-10,-9,-8,-7,-2};
        FinalSort.sort(arr);
        assert(Arrays.equals(arr,res));
    }

    @Test
    public void testMixed(){
        int[] arr = new int[]{-8,-9,7,-10,2,0};
        int[] res = new int[]{-10,-9,-8,0,2,7};
        FinalSort.sort(arr);
        assert(Arrays.equals(arr,res));
    }


}
