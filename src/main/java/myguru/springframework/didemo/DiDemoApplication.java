package myguru.springframework.didemo;

import myguru.springframework.didemo.controllers.ConstructorInjectedController;
import myguru.springframework.didemo.controllers.GetterInjectedController;
import myguru.springframework.didemo.controllers.PropertyInjectedController;
import myguru.springframework.didemo.controllers.myController;
import myguru.springframework.didemo.examplebeans.FakeDataSource;
import myguru.springframework.didemo.examplebeans.FakeJmsBroker;
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

        FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker)ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUser());



    }
}
