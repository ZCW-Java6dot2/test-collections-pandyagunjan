package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;
import gettestie.src.main.java.rocks.zipcode.Person;
import gettestie.src.main.java.rocks.zipcode.Address;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestHashSet {


    @Test
    public void testHashSetAdd(){

        HashSet<Person> person= new HashSet<Person>();
        Person me = new Person("Gunjan", 1988);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        assertTrue(person.add(me));
    }
    @Test
    public void testHashSetClearAndIsEmpty(){

        HashSet<Person> person= new HashSet<Person>();
        Person me = new Person("Gunjan", 1988);
        // Address addressForMe=new Address("Street 1","Town 1" ,"Postal Code");
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        person.clear();
        assertTrue(person.isEmpty());
    }

    @Test
    public void testHashSetRemove(){

        HashSet<Person> person= new HashSet<Person>();
        Person me = new Person("Gunjan", 1988);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        person.remove(me);
        assertTrue(person.isEmpty());
    }
    @Test
    public void testHashSize(){

        HashSet<Person> person= new HashSet<Person>();
        Person me = new Person("Gunjan", 1988);
        Person sam = new Person("Sam", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        sam.setAddress("Street Sam","Town Sam" ,"Postal Code Sam");
        tom.setAddress("Street 1","Town 1" ,"Postal Code");
        person.add(me);
        person.add(sam);
        person.add(tom);
        int actual = person.size();
        assertEquals(3,actual);;
    }

    @Test
    public void testHashSetContains(){

        HashSet<Person> person= new HashSet<Person>();
        Person me = new Person("Gunjan", 1988);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        Person sam = new Person("Sam", 1975);
        Person tom = new Person("Tom", 1955);
        sam.setAddress("Street Sam","Town Sam" ,"Postal Code Sam");
        tom.setAddress("Street 1","Town 1" ,"Postal Code");
        person.add(me);
        person.add(sam);
        person.add(tom);
        Boolean result=person.contains(sam);
        assertTrue(result);
    }

    @Test
    public void testHashSetClonesAndEquals(){

        HashSet<Person> person= new HashSet<Person>();
        Person me = new Person("Gunjan", 1988);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        Person sam = new Person("Sam", 1975);
        Person tom = new Person("Tom", 1955);
        sam.setAddress("Street Sam","Town Sam" ,"Postal Code Sam");
        tom.setAddress("Street 1","Town 1" ,"Postal Code");
        person.add(me);
        person.add(sam);
        person.add(tom);
        Boolean result=person.contains(sam);
        HashSet<Person> personClone= (HashSet<Person>) person.clone();

        assertTrue(personClone.equals(person));
    }

}
