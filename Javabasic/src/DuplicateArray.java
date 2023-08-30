import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= { 2, 3, 5, 4, 3, 1, 3, 2, 1, };
        Arrays.sort(arr);
        int i, j, frequency;
        
        for(i=0;i<arr.length;i++) {
        	frequency=1;
        	for ( j = i+1; j < arr.length; j++) {
				if (arr[j]==arr[i]) {
					frequency++;
				}else
					break;
			}
        	i=j-1;
        	if(frequency > 1){
                
                //printing the output
                System.out.println(arr[i] + " --> " + frequency);
             }
        }
	}

}
