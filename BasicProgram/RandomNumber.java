package BasicProgram;

import java.util.Random;
/** Random number generation */
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** creating random class */
		Random random = new Random();
		/** printing random integer format */
		System.out.println(random.nextInt(50));
		System.out.println(random.nextInt(1000));
		
		/** printing random double format */
		System.out.println(random.nextDouble());
		System.out.println(random.nextDouble());
		
		/** printing random float format */
		System.out.println(random.nextFloat());
		System.out.println(random.nextFloat());
		
		/** printing random long format */
		System.out.println(random.nextLong());
		System.out.println(random.nextLong());
		
		/** printing random boolean format */
		System.out.println(random.nextBoolean());
		System.out.println(random.nextBoolean());

	}

}
