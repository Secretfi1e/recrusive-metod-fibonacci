public class Main {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13,21,34,55

        int last =fibonacci(7);
        System.out.println(last);

      }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }

    }
}