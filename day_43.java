import java.util.*;
public class day_43 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array.. ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter Array Element.. ");
        for(int i=0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int e = 0 ;
        int o = 0 ;
        for(int i=0 ;i<size ; i++ )
        {
            if ( (arr[i] % 2) == 0 )
            {
                e++;
            }
            else
            o++;
        }

        if(e == size)
        System.out.println("Even");

        else if (o == size)
        System.out.println("odd");

        else
        System.out.println("Mixed");
    }
}
