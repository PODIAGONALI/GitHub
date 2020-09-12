public class s4p9 {
    public static class Fibonachi{
         static int Fibonachi(int n){
            int array[] = new int[n+1];
            array[0] = 0;
            array[1] = 1;
            for(int i = 0; i <= n; i++) {
                if(i == 0) {
                    array[i] = 0;
                    continue;
                }
                else if(i == 1)
                    array[i] = 1;
                else
                    array[i] = array[i - 2] + array[i-1];
                System.out.println(array[i]);
            }
            return n;
        }
    }

    public static void main(String[] args) {
        Fibonachi.Fibonachi(30);
    }
}
