package franxxcode.reflection;

import franxxcode.reflection.data.Car;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    void proxy() {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                if (method.getName().equals("getName")) {
                    return "Car Proxy";
                }

                if (method.getName().equals("run")) {
                    System.out.println("Car is Running");
                }

                return null;
            }
        };

        Car car = (Car) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Car.class}, handler);

        System.out.println(car.getClass());
        System.out.println(car.getName());
        car.run();

    }
}
