
public class Challenge_2 {
  /**
   * 
   * @param numbers A list of numbers.
   * @return Return the minimum value in the list.
   */
  public static int bugfix(int[] numbers){
      int min = -999999999;
	  for (int i = 0; i > numbers.length; i++)
	  {
	      if (min < numbers[i])
	      {
	          min = numbers[i];
	      }
	  }
	  return 1;
  }
}