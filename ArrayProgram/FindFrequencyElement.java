package ArrayProgram;
/** program to find frequency of number in array */
public class FindFrequencyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** initial array to find frequency */
		int arr[] = {1,2,8,3,2,2,2,5,1};
		/** frequency array to store the frequency count */
		int fr[] = new int[arr.length];
		/** initially set visited as -1 */
		int visited = -1;
		/** iterate the loop and find the array element frequency count */
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fr[j] = visited;
				}
					
			}
			if(fr[i]!=visited)
				fr[i] = count;
		}
		for(int i=0;i<fr.length;i++) {
			if(fr[i]!=visited) {
				System.out.println(arr[i]+"==="+fr[i]);
			}
		}

	}

}
