package reflection;

import reflection.data.BasicData;
import reflection.data.User;

import java.lang.reflect.Field;

public class FieldV2 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User user = new User("id1", "userA", 20);
        System.out.println("기존 이름 " + user.getName());

        Class<? extends User> aClass = user.getClass();
        Field nameField = aClass.getDeclaredField("name");

        // private 필드에 접근 허용, private 매서드도 이렇게 호출 가능
        nameField.setAccessible(true);
        nameField.set(user, "USER_B");
        System.out.println(user.getName());


    }

    }

