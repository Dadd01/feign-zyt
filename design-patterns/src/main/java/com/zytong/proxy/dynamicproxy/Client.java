package com.zytong.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        InvocationHandler handler=null;
        AbstractUserDAO userDAO=new UserDAO();
//        handler=new DAOLogHandler(userDAO);
        AbstractUserDAO proxy=null;

        proxy=(AbstractUserDAO) Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(),new Class[]{AbstractUserDAO.class},handler);
//        proxy.findUserById("张卫戊己");

        System.out.println("-------------------------");

//        AbstractDocumentDAO documentDAO=new DocumentDAO();
    }
}
