package rocks.zipcode;
import org.junit.Test;
import gettestie.src.main.java.rocks.zipcode.Person;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;
public class TestArrayDeque {

    @Test
    public void testArrayDequeAdd(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.add(me);
        expected.add(santosh);
        assertTrue(expected.add(tom));;
    }
    @Test
    public void testArrayDequeClearAndIsEmpty(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.add(me);
        expected.add(santosh);
        expected.clear();
        assertTrue(expected.isEmpty());;
    }
    @Test
    public void testArrayDequeContains(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.add(me);
        expected.add(santosh);

        assertTrue(expected.contains(me));;
    }
    @Test
    public void testArrayDequePeek(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.add(me);
        expected.add(santosh);

        assertEquals(me,expected.peek());;
    }
    @Test
    public void testArrayDequeOffer(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.add(me);
        expected.offerFirst(santosh);

        assertEquals(santosh,expected.peek());;
    }

    @Test
    public void testArrayDequePollOnEmpty(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.add(me);
        expected.offerFirst(santosh);
        expected.clear();
        assertEquals(null,expected.poll());;
    }


    @Test
    public void testArrayDequeRemove(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.add(me);
        expected.offerFirst(santosh);

        assertEquals(true,expected.remove(santosh));;
    }
    @Test
    public void testArrayDequePushAndPop(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.push(me);
        expected.push(tom);
        assertEquals(tom,expected.pop());;
    }
    @Test
    public void testArrayDequeSize(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.push(me);
        expected.push(tom);
        assertEquals(2,expected.size());;
    }



}
