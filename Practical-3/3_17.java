class Comparator {
        public static int max(int a, int b) //static method
        {
                if( a > b)
                        return a;
                else
                        return b;
        }
}

class Test {
  public static void main(String args[]){
        int a = 5;
        int b = 7;

        System.out.println(Comparator.max(a, b)); // which number is big
  }
}
