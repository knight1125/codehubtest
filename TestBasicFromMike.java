import java.util.*;

public class TestBasic {
    public static void main(String[] args)  {
        /*
        int a = 2;
        int b = 2;
        System.out.println(hashCode(a));
        System.out.println(hashCode(b));
        */
        /*
        for(int i = 0; i <= 32; i++){
            System.out.println(indexFor(i, 32));
        }*/

        System.out.println("我爱你\r\n呵呵呵");
    }
    public static int hashCode(int value){
        int hash = new Integer(value).hashCode();
        hash =(int) (hash* Math.PI *10000);
        return hash;

    }
    public static int indexFor(int hash, int length) {
        return hash & (length - 1);
    }
}
