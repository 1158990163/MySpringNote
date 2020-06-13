package com.lty.AOC;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao o = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        System.out.println(o.add(1, 2));
        System.out.println(o.update("12312"));

    }
}

class UserDaoProxy implements InvocationHandler {

    //把创建的需要代理的对象传过来
    Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //写增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        方法之前
        System.out.println("方法执行前执行" + method.getName() + Arrays.toString(args));
//        方法执行
        Object invoke = method.invoke(obj, args);
//        方法之后
        System.out.println("方法执行后输出" + obj);
        return invoke;
    }
}
