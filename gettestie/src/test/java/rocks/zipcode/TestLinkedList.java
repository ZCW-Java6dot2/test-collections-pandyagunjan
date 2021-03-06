package rocks.zipcode;
import org.junit.Test;
import gettestie.src.main.java.rocks.zipcode.Person;

import java.util.LinkedList;

import static org.junit.Assert.*;


public class TestLinkedList {

    @Test
    public void testLinkedListAdd(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        LinkedList<Person> expected = new LinkedList<Person>();
        expected.add(me);
        expected.add(santosh);
        assertTrue(expected.add(tom));;
    }
    @Test
    public void testLinkedListRemove(){
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        LinkedList<Person> expected = new LinkedList<Person>();
        expected.add(me);
        expected.add(santosh);
        expected.add(tom);

        assertEquals(me, expected.remove());;
    }

    @Test
    public void testLinkedListRemoveFirst(){
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        LinkedList<Person> expected = new LinkedList<Person>();
        expected.add(me);
        expected.add(santosh);
        expected.add(tom);

        assertEquals(me, expected.removeFirst());;
    }
    @Test
    public void testLinkedListRemoveLast(){
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        LinkedList<Person> expected = new LinkedList<Person>();
        expected.add(me);
        expected.add(santosh);
        expected.add(tom);

        assertEquals(tom, expected.removeLast());;
    }

    @Test
    public void testLinkedListClearAndEmpty(){
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        LinkedList<Person> expected = new LinkedList<Person>();
        expected.add(me);
        expected.add(santosh);
        expected.add(tom);
        expected.clear();

        assertTrue(expected.isEmpty());;
    }

    @Test
    public void testLinkedListOfferFirst(){
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        Person setP=new Person("To Set" ,1981);
        LinkedList<Person> expected = new LinkedList<Person>();
        expected.add(me);
        expected.add(santosh);
        expected.add(tom);
        Boolean output = expected.offerFirst(setP);
       // assertEquals(true,expected.offerFirst(tom));;
        assertEquals(setP,expected.peekFirst());
        assertEquals(4,expected.size());
    }
    @Test
    public void testLinkedListPeek(){
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        LinkedList<Person> expected = new LinkedList<Person>();
        expected.add(me);
        expected.add(santosh);
        expected.add(tom);
       assertEquals(me, expected.peek());;
    }

    @Test
    public void testLinkedListSet(){
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        Person setP=new Person("To Set" ,1981);
        LinkedList<Person> expected = new LinkedList<Person>();
        expected.add(me);
        expected.add(santosh);
        expected.add(tom);
        assertEquals(santosh, expected.set(1,setP));;
    }

    @Test
    public void testLinkedListSize(){
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        LinkedList<Person> expected = new LinkedList<Person>();
        expected.add(me);
        expected.add(santosh);
        expected.add(tom);
        assertEquals(3, expected.size());;
    }
    @Test
    public void testLinkedListPush(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        LinkedList<Person> expected = new LinkedList<Person>();
        expected.push(me);
        expected.push(santosh);
        expected.push(tom);

        assertEquals(tom,expected.pop());;  //LIFO concept of Stack
    }

}

