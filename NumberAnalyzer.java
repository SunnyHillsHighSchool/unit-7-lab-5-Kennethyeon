//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kenneth Yeon

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int[]n)
  {
    list = new ArrayList<Number>();
    for (int a:n)
    {
      list.add(new Number(a));
    }
  }
	//write count odds
  public int countOdds()
  {
    //initiate an int called oddCount and set it equal to 
    int oddCount = 0;
    //use a for each loop to loop through each number in the arraylist
    for (Number i : list)
    {
      //if isOdd is true add one to oddCount
      if (i.isOdd() == true)
      {
        oddCount++;
      }
    }
    //return oddCount
    return oddCount;

  }
	//write count evens
  public int countEvens()
  {
    //inititate an int called evenCount and set it equal to 0
    int evenCount = 0;
    //use a for each loop to loop through each number in the arraylist
    for(Number num : list)
    {
      //if isOdd is false add one to evenCount
      if (num.isOdd() == false)
      {
        evenCount++;
      }
    }
    //return evenCount
    return evenCount;
  }
	//write count perfects
	public int countPerfects()
  {
    //initiate an in called perfectCount and set it equal to 0
    int perfectCount = 0;
    //use a for each loop to loop through each number in the arraylist
    for(Number a: list)
    {
      //if isPerfect is true add one to perfectCount
      if (a.isPerfect() == true)
      {
        perfectCount++;
      }
    }
    //return perfectCount
    return perfectCount;
  }
	//write a toString
  public String toString()
  {
    return ""+list;
  }
  //""+list;
}