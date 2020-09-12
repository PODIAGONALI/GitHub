import java.util.*;
public class S4E2 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int array[] = new int[25];
        for(int i = 0;  i < 25; i++) {
            array[i] = rand.nextInt();
            System.out.println(i + ": " + array[i]);
            if(i == 0)
                continue;
            else if(array[i] > array[i-1])
                System.out.println("      " + array[i] + ">" + array[i-1] );
            else if(array[i] < array[i-1])
                System.out.println("      " + array[i] + "<" + array[i-1] );
            else
                System.out.println("      " + array[i] + "=" + array[i-1] );
        }


    }
}
