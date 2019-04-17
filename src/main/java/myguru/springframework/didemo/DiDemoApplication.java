package myguru.springframework.didemo;

import myguru.springframework.didemo.controllers.ConstructorInjectedController;
import myguru.springframework.didemo.controllers.GetterInjectedController;
import myguru.springframework.didemo.controllers.PropertyInjectedController;
import myguru.springframework.didemo.controllers.myController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.plaf.SliderUI;
import java.lang.invoke.ConstantCallSite;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
      ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        myController controller = (myController)ctx.getBean("myController");

        System.out.println(controller.hello());

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }
}
