package reflection;

import reflection.data.BasicData;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class BasicV2 {

    public static void main(String[] args) {
        Class<BasicData> basicData = BasicData.class;

        System.out.println("basicData.getName() " +basicData.getName());
        System.out.println("basicData.getSimpleName() " +basicData.getSimpleName());
        System.out.println("basicData.getPackage() " +basicData.getPackage());

        System.out.println("basicData.getSuperclass() " + basicData.getSuperclass());
        System.out.println("basicData.getInterfaces() " + Arrays.toString(basicData.getInterfaces()));

        System.out.println("basicData.isInterface() " + basicData.isInterface());
        System.out.println("basicData.isAnnotation() " + basicData.isAnnotation());
        System.out.println("basicData.isEnum() " + basicData.isEnum());

        System.out.println("basicData.isPrimitive() " + basicData.isPrimitive());
        System.out.println("basicData.isSynthetic() " + basicData.isSynthetic());
        System.out.println("basicData.isArray() " + basicData.isArray());

        int modifiers = basicData.getModifiers();
        System.out.println("modifiers " + modifiers);
        System.out.println("isPublic = " + Modifier.isPublic(modifiers));
        System.out.println("isProtected = " + Modifier.isProtected(modifiers));

    }
}
