package com.company.deputy.firstimpl.person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by oleg on 23.07.15.
 */
public class PersonRunner {
    public static void main(String[] args) {

    }

    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }
    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }

    PersonBean getProxy(PersonBean person, InvocationHandler handler) {
        InvocationHandler iHandler;
        if (handler instanceof OwnerInvocationHandler) {
            iHandler = new OwnerInvocationHandler(person);
        } else {
            iHandler = new NonOwnerInvocationHandler(person);
        }

        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                iHandler
        );
    }
}
