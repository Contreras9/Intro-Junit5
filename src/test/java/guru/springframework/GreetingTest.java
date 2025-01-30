package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {
    Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each.....");
        greeting = new Greeting();
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld2() {
        System.out.println(greeting.helloWorld("Yared"));
    }

    @Test
    void testHelloWorld3() {
        System.out.println(greeting.helloWorld("Semsem"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each.....");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After!!! ***** - I am only called once!!!");
    }
}