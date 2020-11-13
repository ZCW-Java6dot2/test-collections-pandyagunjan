package rocks.zipcode;
import org.junit.Test;
import gettestie.src.main.java.rocks.zipcode.Person;

import java.util.ArrayDeque;
import java.util.PriorityQueue;


import static org.junit.Assert.*;
public class TestPriorityQueue {
    @Test
    public void testPQAdd(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<Person>();
        expected.add(me);
        expected.add(santosh);
        assertTrue(expected.add(tom));;
    }

    @Test
    public void testPQClearAndIsEmpty(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<Person>();
        expected.add(me);
        expected.add(santosh);
        expected.clear();
        assertTrue(expected.isEmpty());
    }


    @Test
    public void testPQcontains(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<Person>();
        expected.add(me);
        expected.add(santosh);
        assertTrue(expected.contains(me));
    }


    @Test
    public void testPQPeek(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<Person>();
        expected.add(me);
        expected.add(santosh);
        assertEquals(santosh,expected.peek());
    }

    @Test
    public void testPQPoll(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<Person>();
        expected.add(me);
        expected.add(santosh);
        assertEquals(santosh ,expected.poll());
       // assertEquals()
    }

    @Test
    public void testPQSize(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<Person>();
        expected.add(me);
        expected.add(santosh);
        assertEquals(2 ,expected.size());
        // assertEquals()
    }
    @Test
    public void testPQRemove(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<Person>();
        expected.add(me);
        expected.add(santosh);
        assertEquals(true ,expected.remove(me));
        // assertEquals()
    }


}
