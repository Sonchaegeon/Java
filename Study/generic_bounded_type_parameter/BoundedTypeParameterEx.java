package generic_bounded_type_parameter;

public class BoundedTypeParameterEx {

    public static void main(String[] args) {
        int result1 = Util.compare(10, 20);
        System.out.println(result1);

        int result2 = Util.compare(3.4, 3);
        System.out.println(result2);
    }
}
