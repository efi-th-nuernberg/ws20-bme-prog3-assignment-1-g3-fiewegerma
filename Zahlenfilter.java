class Zahlenfilter{
  public static void main(String[] args) {
    int previousNumber = 0;
    for(int i = 1; i <= 200; i++){
      divisibleByFive(i);
      endOnNine(i);
      sumDivisibleByThree(i, previousNumber);
      previousNumber++;
      }
    }
  

  public static void divisibleByFive (int i){
    if(i % 5 == 0){
      System.out.println(i + " ist durch 5 teilbar!");
    }
  }
  public static void endOnNine (int i){
    if(i % 10 == 9){
      System.out.println(i + " endet auf 9!");
    }
  }
  public static void sumDivisibleByThree(int i, int j){
    int sum = (i + j);
    if(sum % 3 == 0){
      System.out.println(i + " und " + j + " ergeben " + sum + " und " + sum + " ist durch 3 teilbar!");
    }
  }
}