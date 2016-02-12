/**
 * Created by vivigorkal on 2/12/2016.
 */
import java.util.HashMap;

public class CandlesCount {

    public static void main(String[] args) {

        System.out.println(ConvertingTheCandiesShape(8));
    }

    // TODO Auto-generated method stub
    public static int ConvertingTheCandiesShape (int input1)
    {
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        hashMap.put(2, 1);
        hashMap.put(3, 2);
        if(input1==2)
        {
            return 1;
        }
        else if(input1==3)
        {
            return 2;
        }
        else
        {
            for(int i=4;i<=input1;i++)
            {
                int result=0;
                result=(i-1)+hashMap.get(i-2);
                hashMap.put(i, result);
            }

            return hashMap.get(input1);
        }
    }


}

