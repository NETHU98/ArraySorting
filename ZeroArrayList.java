import java.util.*;
import java.lang.*;
import java.util.ArrayList;

public class ZeroArrayList {

    public static void main(String []args)

    {
        System.out.println("Enter elements: \n");
        Scanner in=new Scanner(System.in);
        int j;

        ArrayList <Integer>arr=new ArrayList<Integer>();
        for(int i=0;i<7;i++)
        { j=in.nextInt();
            arr.add(j);
        }
        System.out.println("before removing element :");
        System.out.println(arr);

        System.out.println("\nafter removing element :\n");
        removeZero(arr);

    }


    static void removeZero(ArrayList<Integer> arr)
    {

        arr.removeAll(Arrays.asList(0));
        System.out.println(arr);
    }

}