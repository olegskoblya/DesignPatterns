package com.company.deputy.firstimpl.person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by oleg on 23.07.15.
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, objects);
            } else if (method.getName().equals("setHotOrNotRating")) {
                return method.invoke(person, objects);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
