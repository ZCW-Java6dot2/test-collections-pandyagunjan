package rocks.zipcode;
import org.junit.Test;
import gettestie.src.main.java.rocks.zipcode.Person;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestComparable {

    @Test
    public void testComparableReverse() {
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        List<Person> list = new ArrayList<>();
        list.add(me);
        list.add(santosh);
        list.add(tom);
        Collections.sort(list);
        Collections.reverse(list);
        Person[] expected = {me, santosh, tom};
        Person[] actual = list.toArray(new Person[list.size()]);
        assertEquals(expected, actual);
    }
    @Test
    public void testComparableSort() {
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1", "Town 1", "Postal Code");
        List<Person> list = new ArrayList<>();
        list.add(me);
        list.add(santosh);
        list.add(tom);
        Collections.sort(list);
        Person[] expected = {tom, santosh, me};
        Person[] actual = list.toArray(new Person[list.size()]);
        assertEquals(expected, actual);
    }

}
