package reflection;

import reflection.data.BasicData;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodV2 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        BasicData helloInstance = new BasicData();
        helloInstance.call();

        // 동적 메서드 호출 - 리플렉션 사요
        Class<? extends BasicData> helloCalss = helloInstance.getClass();
        String methodName = "hello";

        // 매서드 이름을 변수로 변경할 수 있다.
        Method method1 = helloCalss.getDeclaredMethod(methodName, String.class);
        Object retrunValue = method1.invoke(helloInstance, "hi ");
        System.out.println("retrunValue: " + retrunValue);


    }
}
