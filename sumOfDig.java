public class sumOfDig{



static int sumOfDigits(int n, int digits){

    if(digits == 1)
      return n;
    else{
      int k= (int) Math.pow(10,digits-1);

      return n/k + sumOfDigits(n%k , digits - 1);
}
  }


  static int numOfDigits(int n){
    int count = 0;
    for(; n>0; n/=10)
      count ++;
    return count;


  }

  public static void main(String[] args)
  {

    int n = 12345;
    int digits = numOfDigits(n);


    System.out.print(sumOfDigits(n, digits));
  }
}
