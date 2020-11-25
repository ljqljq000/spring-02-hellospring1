import com.kuang.pojo.hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    //psvm
    public static void main(String[] args) {
        //可传多个，获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们对象由spring管理，要是用直接拿
        hello hel = (hello) context.getBean( "hello");
        System.out.println(hel.toString());


    }
}
