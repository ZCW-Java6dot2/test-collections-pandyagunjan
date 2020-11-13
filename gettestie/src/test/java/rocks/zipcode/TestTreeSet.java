package rocks.zipcode;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.TreeSet;
import gettestie.src.main.java.rocks.zipcode.Person;
import gettestie.src.main.java.rocks.zipcode.Address;


public class TestTreeSet {

    @Test
    public void testTreeSetAdd(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        TreeSet<Person> expected = new TreeSet<Person>();
        expected.add(me);
        expected.add(santosh);
        assertTrue(expected.add(tom));;
    }
    @Test
    public void testTreeSetRemove(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        TreeSet<Person> expected = new TreeSet<Person>();
        expected.add(me);
        expected.add(santosh);
        assertTrue(expected.remove(me));;
    }
    @Test
    public void testTreeSetSize(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        TreeSet<Person> expected = new TreeSet<Person>();
        expected.add(me);
        expected.add(santosh);
        assertEquals(2,expected.size());;
    }

    @Test
    public void testTreeSetClearAndIsEmpty(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        TreeSet<Person> expected = new TreeSet<Person>();
        expected.add(me);
        expected.add(santosh);
        expected.clear();
        assertTrue(expected.isEmpty());
    }

    @Test
    public void testTreeSetLast(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        TreeSet<Person> expected = new TreeSet<Person>();
        expected.add(me);
        expected.add(santosh);

        assertEquals(me,expected.last());
    }

}
