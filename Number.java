//add number.java code from lab 4

public class Number 
{
//private instance variable (must be an Integer)
private Integer num;

//constructor
public Number()
{
  num = 0;
}

public Number(Integer n)
{
  num = n;
}
//getter method
public Integer getNum()
{
  return num;
}

//setter method
public void setNum(int n)
{
  num = n; 
}

//isOdd method
public boolean isOdd()
{
  //if the remainder of dividing the number by 2 is 1 return true
  if (num % 2 == 1)
  {
    return true;
  }
  //else return false
  else
  {
    return false;
  }
}
//isPerfect method
public boolean isPerfect()
{
  //create an int variable called sum equal to zero
  int sum = 0;
  //create a for loop that starts from 1 and goes up to the number - 1
  for (int i = 1; i <= num - 1; i++)
  {
    //if the remainder of the number divided by the value of the loop is zero add value of the loop to sum
    if (num % i == 0)
    {
      sum = sum + i;
    }
    //end for loop
  }
  //if sum is equal to the number return true
  if (sum == num)
  {
    return true;
  }
  //else return false 
  else
  {
    return false;
  }
}

//toString
  public String toString()
  {
    return String.valueOf(num);
  }
}