package reflection;

import reflection.data.BasicData;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FieldV1 {

    public static void main(String[] args) {
        Class<BasicData> helloClass = BasicData.class;

        System.out.println("filed");
        Field[] fields = helloClass.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        System.out.println("declared");
        Field[] declaredField = helloClass.getDeclaredFields();
        for (Field field : declaredField) {
            System.out.println("field = " + field);
        }

    }
}
