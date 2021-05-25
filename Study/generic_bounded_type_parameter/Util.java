package generic_bounded_type_parameter;

public class Util {

    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        System.out.println(v1 + " " + v2);

        return Double.compare(v1, v2);
    }
}
