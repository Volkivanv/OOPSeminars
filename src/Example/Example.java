package Example;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Mathematics m = new Mathematics() {
            @Override
            public double add(double a, double b) {
                return 0;
            }
        };
        Mathematics x = (s, z) -> s + z;
      //  Mathematics x = Double::sum;

    }
}

interface Mathematics{
    double add(double a, double b);
}

class Calculator{
    static Map<Character,Calculable> map = new HashMap<>();
    static {
        map.put('+', arr -> arr[0] + arr[1]);
        map.put('-', arr -> arr[1] - arr[0]);
        map.put('*', arr -> arr[1] * arr[0]);
    }
    public static void main(String[] args) {
        System.out.println(Calculator.calculate1('+', 1, 2));


    }

    public static <throw_new> double calculate(char op, double x, double y){
        if(op == '+') return x+y;
        if(op == '-') return x-y;
        if(op == '*') return x*y;
        else {
            throw new UnsupportedOperationException("Не реализуется");
            }
    }

    public static double calculate1(char op, double ... arr){
        return map.get(op).calc(arr);
    }
}
interface Calculable{
    double calc(double... arr);
}
