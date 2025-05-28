package etc.lecture.p03reflecton;

public class App01 {
    public static void main(String[] args) throws ClassNotFoundException {

        String s1 = "java";

        // reflection : class 정보를 얻는 것
        Class<String> c1 = String.class;
        Class<?> c2 = Class.forName("java.lang.String");
        Class<? extends String> c3 = s1.getClass();

        System.out.println(System.identityHashCode(c1));
        System.out.println(System.identityHashCode(c2));
        System.out.println(System.identityHashCode(c3));

    }
}
