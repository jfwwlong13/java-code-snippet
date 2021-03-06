/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.rules.*;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.model.Statement;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AppTest {
    @Rule
    public final TemporaryFolder tempFolder = new TemporaryFolder();

    @Rule
    public final ExternalResource resource = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            System.out.println("I'm before");
            super.before();
        }

        @Override
        protected void after() {
            System.out.println("I'm after");
            super.after();
        }
    };

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Rule
    public Timeout timeout = Timeout.seconds(10);

    @Rule
    public final Verifier collector = new Verifier() {
        @Override
        protected void verify() {
            sequence += "verify ";
        }
    };

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {28, "jianfu"}, {27, "xinxing"}
        });
    }

    @Parameterized.Parameter(1)
    public String name;
    @Parameterized.Parameter(0)
    public int age;

    private String sequence = "";

    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test(expected = IOException.class, timeout = 1000L)
    public void testThrowException() throws IOException {
        throw new IOException();
    }

    @Test
    public void testThrowExceptionAndMessage() throws IOException {
        thrown.expect(IOException.class);
        thrown.expectMessage("Testing thrown");
        thrown.expectMessage(CoreMatchers.startsWith("Test"));
        throw new IOException("Testing thrown");
    }

    @Ignore("Not testing")
    @Test
    public void testIgnore() {
        fail();
    }

    @Test
    public void testParameter() {
        System.out.println(name + "_" + age);
    }

    @Test
    public void testThat() {
        int i = 3;
        assertThat(i, is(3));
    }

    @Test
    public void testTempFolder() throws IOException {
        File file = tempFolder.newFile("my_test");
        System.out.println(file.getAbsolutePath());
        assertTrue(file.exists());
    }

    @Test
    public void testVerifier() {
        assertFalse(true);
        assertEquals("verify " , sequence);
    }

    private static String watchedLog = "";

    @Rule
    public final TestRule watchman = new TestWatcher() {
        @Override
        public Statement apply(Statement base, Description description) {
            return super.apply(base, description);
        }

        @Override
        protected void succeeded(Description description) {
            watchedLog += description.getDisplayName() + " " + "success!\n";
        }

        @Override
        protected void failed(Throwable e, Description description) {
            watchedLog += description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n";
        }

        @Override
        protected void skipped(AssumptionViolatedException e, Description description) {
            watchedLog += description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n";
        }

        @Override
        protected void starting(Description description) {
            super.starting(description);
        }

        @Override
        protected void finished(Description description) {
            super.finished(description);
        }
    };

    @Before
    public void setUp() {
        System.out.println("set up");
    }

    @After
    public void tearDown() {
        System.out.println("tear down");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("set up class");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tear down class");
    }

    @Rule
    public final TestName testName = new TestName();

    @Test
    public void testA() {
        System.out.println(testName.getMethodName());
    }

    @Test
    public void testB() {
        System.out.println(testName.getMethodName());
    }
}
