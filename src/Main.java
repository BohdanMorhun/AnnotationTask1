import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        MyClass a = new MyClass();
        Class<?> someClass = a.getClass();

        try {
            Method method = someClass.getDeclaredMethod("mul", int.class, int.class);
            Test myAnnotation = method.getAnnotation(Test.class);

           int res =(Integer)method.invoke(a, myAnnotation.a(), myAnnotation.b());
            System.out.println(res);

        } catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException e) {
        }

    }
}
