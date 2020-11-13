package rocks.zipcode;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TreeMap;
import gettestie.src.main.java.rocks.zipcode.Person;
import gettestie.src.main.java.rocks.zipcode.Address;
/* NOT : THIS WAS the TEST which required Person to use Comparable interface and override the method CompareTo */
public class TestTreeMap {

    @Test
    public void testTreeMapPut(){
        //Person person=new Person;
        TreeMap<Person,Address> personAddress= new TreeMap<Person,Address>();
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
    public void testTreeMapGetValue(){
        //Person person=new Person;
        TreeMap<Person,Address> personAddress= new TreeMap<Person,Address>();
        Person me = new Person("Gunjan", 1988);
        Person sam = new Person("Sam", 1975);
        Person tom = new Person("Tom", 1955);
        Address addressForMe=new Address("Street 1","Town 1" ,"Postal Code","Country1");
        Address addressForSam=new Address("Street Sam","Town Sam" ,"Postal Code Sam","Country Sam");
        Address addressForTom=new Address("Street Tom","Town Tom" ,"Postal Code Tom","Country Tom");
        personAddress.put(me,addressForMe);
        personAddress.put(sam,addressForSam);
        personAddress.put(tom,addressForTom);

        assertEquals(addressForMe,personAddress.get(me));
     /// Gets the value belonging to key

    }
    @Test
    public void testTreeMapFirstKey(){

        TreeMap<Person,Address> personAddress= new TreeMap<Person,Address>();
        Person me = new Person("Gunjan", 1988);
        Person sam = new Person("Sam", 1975);
        Person tom = new Person("Tom", 1955);
        Address addressForMe=new Address("Street 1","Town 1" ,"Postal Code","Country1");
        Address addressForSam=new Address("Street Sam","Town Sam" ,"Postal Code Sam","Country Sam");
        Address addressForTom=new Address("Street Tom","Town Tom" ,"Postal Code Tom","Country Tom");
        personAddress.put(me,addressForMe);
        personAddress.put(sam,addressForSam);
        personAddress.put(tom,addressForTom);

        assertEquals(tom,personAddress.firstKey());


    }

    @Test
    public void testTreeMapSize(){
        //Person person=new Person;
        TreeMap<Person,Address> personAddress= new TreeMap<Person,Address>();
        Person me = new Person("Gunjan", 1988);
        Person sam = new Person("Sam", 1975);
        Person tom = new Person("Tom", 1955);
        Address addressForMe=new Address("Street 1","Town 1" ,"Postal Code","Country1");
        Address addressForSam=new Address("Street Sam","Town Sam" ,"Postal Code Sam","Country Sam");
        Address addressForTom=new Address("Street Tom","Town Tom" ,"Postal Code Tom","Country Tom");
        personAddress.put(me,addressForMe);
        personAddress.put(sam,addressForSam);
        personAddress.put(tom,addressForTom);

        assertEquals(3,personAddress.size()) ;


    }
    @Test
    public void testTreeMapReplace(){
        //Person person=new Person;
        TreeMap<Person,Address> personAddress= new TreeMap<Person,Address>();
        Person me = new Person("Gunjan", 1988);
        Person sam = new Person("Sam", 1975);
        Person tom = new Person("Tom", 1955);
        Address addressForMe=new Address("Street 1","Town 1" ,"Postal Code","Country1");
        Address addressForSam=new Address("Street Sam","Town Sam" ,"Postal Code Sam","Country Sam");
        Address addressForTom=new Address("Street Tom","Town Tom" ,"Postal Code Tom","Country Tom");
        personAddress.put(me,addressForMe);
        personAddress.put(sam,addressForSam);
        //personAddress.put(tom,addressForTom);

        assertEquals(true, personAddress.replace(me,addressForMe,addressForTom));


    }



}
