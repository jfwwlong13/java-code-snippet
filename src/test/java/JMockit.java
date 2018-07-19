import jmockit.Clothes;
import jmockit.Student;
import mockit.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(mockit.integration.junit4.JMockit.class)
public class JMockit {

    @Tested
    private Student student;

    @Injectable private String name = "xiong";
    @Injectable private int size = 12;
    @Injectable private int age = 28;
    @Injectable private Clothes clothes = new Clothes("coat", "shoes");

    class ExampleClass extends MockUp<App> {
            @Mock
            public final String getGreeting() {
                return "fake";
            }
        }


    @Test
    public void test(@Mocked App app) {
        new Expectations() {{
            app.getGreeting(); result = "Hello world1.";
            App.shout("zxcv"); times = 1; result = "qwer";
        }};

        String greet = app.getGreeting();
        String shout = App.shout("zxcv");
        new Verifications() {{
            app.getGreeting(); times = 1;
            assertEquals(greet, "Hello world1.");
            assertEquals("qwer", shout);
        }};
    }

    @Test
    public void testFake(@Mocked App app) {

        new ExampleClass();
        assertEquals("fake", app.getGreeting());
    }

    @Test
    public void testStudent() {
        System.out.println(student);
        System.out.println(student.getClothes().getCoat());
        Clothes clothes = new Clothes("my coat", "my shoes");
        System.out.println(clothes);
    }
}
