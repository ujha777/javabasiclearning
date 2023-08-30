
public class SumOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		int n=arr.length;
		int sum=9;
		SumOfSubArray obj=new SumOfSubArray();
		obj.subArraySum(arr,n,sum);
		
	}

	private void subArraySum(int[] arr, int n, int sum) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			int CurrentSum=arr[i];
			//System.out.println(CurrentSum);
			if (CurrentSum==sum) {
				System.out.println("Sum found at indexe "
                        + i);
				return ;
			}
			else {
				for(int j=i+1;j<n;j++) {
					CurrentSum=CurrentSum+arr[j];
					if (CurrentSum==sum) {
						System.out.println("Sum found between"+i+ "and"+j);
						return ;
					}
				}
			}
			
		}
		System.out.println("No array found");
		return;
	}

}
