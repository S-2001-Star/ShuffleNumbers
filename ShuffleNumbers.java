import java.util.*;
public class ShuffleNumbers {

	public static void main(String[] args) {
		//Create linked list object  
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);  
        
        System.out.println("List before Shuffle : "+list);  
        Collections.shuffle(list);  
        System.out.println("List after shuffle : "+list); 

	}

}