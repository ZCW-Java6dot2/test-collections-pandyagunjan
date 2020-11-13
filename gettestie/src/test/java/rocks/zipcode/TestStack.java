package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStackPush() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @org.junit.Test
    public void TestStackPop() {
        Stack<String> stack = new Stack<>();
        String expected = "Hello world";
        stack.push(expected);
        String actual = stack.pop();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestStackIsEmpty() {
        Stack<String> stack = new Stack<>();
        String expected = "Hello world";
        stack.push(expected);
        String actual = stack.pop();
        assertEquals(true, stack.empty());
    }
    @org.junit.Test
    public void TestStackPeek() {
        Stack<String> stack = new Stack<>();
        String expected = "Hello world";
        stack.push(expected);
        String actual = stack.peek();
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void TestStackSearch() {
        Stack<String> stack = new Stack<>();
        String expected = "Hello world";
        stack.push(expected);
       int result = stack.search(expected);
        assertEquals(1,result);
    }

}
