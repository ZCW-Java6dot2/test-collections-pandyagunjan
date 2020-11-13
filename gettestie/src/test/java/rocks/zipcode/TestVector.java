package rocks.zipcode;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Vector;
import gettestie.src.main.java.rocks.zipcode.Person;
import gettestie.src.main.java.rocks.zipcode.Address;

public class TestVector {

    @org.junit.Test
    public void TestVectorAdd() {
        Vector<Person> vector = new Vector<Person>();
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");

        assertTrue(vector.add(me));
       // assertEquals(false,vector); // false
    }

     @org.junit.Test
    public void TestVectorRemove() {
        Vector<Person> vector = new Vector<Person>();
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        vector.add(me);
        vector.add(santosh);
        vector.add(tom);
        Person actual = vector.remove(0);
        assertEquals(me, actual);
    }

    @org.junit.Test
    public void TestVectorPop() {
        Vector<Person> vector = new Vector<Person>();
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        vector.add(me);
        vector.add(santosh);
        vector.add(tom);
        Person actual = vector.remove(0);
        assertEquals(me, actual);
    }

    @org.junit.Test
    public void TestVectorClearAndIsEmpty() {
        Vector<Person> vector = new Vector<Person>();
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        vector.add(me);
        vector.add(santosh);
        vector.add(tom);
        vector.clear();
       // Person actual = vector.remove(0);
        assertTrue(vector.isEmpty());
    }

    @org.junit.Test
    public void TestVectorGet() {
        Vector<Person> vector = new Vector<Person>();
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        vector.add(me);
        vector.add(santosh);
        vector.add(tom);

        // Person actual = vector.remove(0);
        assertEquals(santosh,vector.get(1));
    }

    @org.junit.Test
    public void TestVectorSet() {
        Vector<Person> vector = new Vector<Person>();
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        vector.add(me);
        vector.add(santosh);


        // Person actual = vector.remove(0);
        assertEquals(santosh,vector.set(1,tom));
    }

}
