
package Java_DSA.functions_and_methods;
import java.util.Arrays;
public class varargs {

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String ...v){

    }
    static void main() {
        fun(10,3,5,6,9,2,8,3,5,6,4505,50,5,565,0);
        multiple(10,20,"ashish","palls","java");
    }
}
