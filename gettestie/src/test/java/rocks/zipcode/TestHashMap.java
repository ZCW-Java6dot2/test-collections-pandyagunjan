package rocks.zipcode;


import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import gettestie.src.main.java.rocks.zipcode.Person;
import gettestie.src.main.java.rocks.zipcode.Address;


public class TestHashMap {

    @Test
    public void testHashMapPut(){
        //Person person=new Person;
        HashMap<Person,Address> personAddress= new HashMap<Person,Address>();
        Person me = new Person("Gunjan", 1988);
        Person sam = new Person("Sam", 1975);
        Person tom = new Person("Tom", 1955);
        Address addressForMe=new Address("Street 1","Town 1" ,"Postal Code","Country1");
        Address addressForSam=new Address("Street Sam","Town Sam" ,"Postal Code Sam","Country Sam");
        Address addressForTom=new Address("Street Tom","Town Tom" ,"Postal Code Tom","Country Tom");
        personAddress.put(me,addressForMe);
        personAddress.put(sam,addressForSam);
        personAddress.put(tom,addressForTom);

        assertTrue(personAddress.containsKey(me));
    }
    @Test
    public void testHashMapRemove(){
        //Person person=new Person;
        HashMap<Person,Address> personAddress= new HashMap<Person,Address>();
        Person me = new Person("Gunjan", 1988);
        Person sam = new Person("Sam", 1975);
        Person tom = new Person("Tom", 1955);
        Address addressForMe=new Address("Street 1","Town 1" ,"Postal Code","Country1");
        Address addressForSam=new Address("Street Sam","Town Sam" ,"Postal Code Sam","Country Sam");
        Address addressForTom=new Address("Street Tom","Town Tom" ,"Postal Code Tom","Country Tom");
        personAddress.put(me,addressForMe);
        personAddress.put(sam,addressForSam);
        personAddress.put(tom,addressForTom);
        assertTrue(personAddress.remove(me,addressForMe));
        assertFalse(personAddress.containsKey(me));
    }

    @Test
    public void testHashMapIsEmpty(){
        //Person person=new Person;
        HashMap<Person,Address> personAddress= new HashMap<Person,Address>();
        Person me = new Person("Gunjan", 1988);
        Person sam = new Person("Sam", 1975);
        Person tom = new Person("Tom", 1955);
        Address addressForMe=new Address("Street 1","Town 1" ,"Postal Code","Country1");
        Address addressForSam=new Address("Street Sam","Town Sam" ,"Postal Code Sam","Country Sam");
        Address addressForTom=new Address("Street Tom","Town Tom" ,"Postal Code Tom","Country Tom");
        personAddress.put(me,addressForMe);
        personAddress.put(sam,addressForSam);
        personAddress.put(tom,addressForTom);
        personAddress.clear();
        assertTrue(personAddress.isEmpty());

    }
    @Test
    public void testHashMapGetKey(){
        //Person person=new Person;
        HashMap<Person,Address> personAddress= new HashMap<Person,Address>();
        Person me = new Person("Gunjan", 1988);
        Person sam = new Person("Sam", 1975);
        Person tom = new Person("Tom", 1955);
        Address addressForMe=new Address("Street 1","Town 1" ,"Postal Code","Country1");
        Address addressForSam=new Address("Street Sam","Town Sam" ,"Postal Code Sam","Country Sam");
        Address addressForTom=new Address("Street Tom","Town Tom" ,"Postal Code Tom","Country Tom");
        personAddress.put(me,addressForMe);
        personAddress.put(sam,addressForSam);
        personAddress.put(tom,addressForTom);
        Address actual=personAddress.get(me);
        assertEquals(addressForMe,actual);
    }
    @Test
    public void testHashMapReplace(){
        //Person person=new Person;
        HashMap<Person,Address> personAddress= new HashMap<Person,Address>();
        Person me = new Person("Gunjan", 1988);
        Address addressForMe=new Address("Street 1","Town 1" ,"Postal Code","Country1");
        Person tom = new Person("Tom", 1955);
        Address addressForTom=new Address("Street Tom","Town Tom" ,"Postal Code Tom","Country Tom");
        personAddress.put(me,addressForMe);

        //Boolean actual = personAddress.replace(me,addressForMe,addressForTom);
        assertTrue( personAddress.replace(me,addressForMe,addressForTom));
    }


}
