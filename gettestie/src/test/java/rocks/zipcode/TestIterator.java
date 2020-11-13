package rocks.zipcode;
import org.junit.Test;
import static org.junit.Assert.*;
import gettestie.src.main.java.rocks.zipcode.Person;
import java.util.Iterator;
import java.util.LinkedList;


public class TestIterator {
    @Test
    public void testIteratorHasNext(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        LinkedList<Person> expected = new LinkedList<Person>();
        expected.add(me);
        expected.add(santosh);
        Iterator itr= expected.iterator();
        int size=expected.size();
        int count=0;
        while( itr.hasNext())
           {
               if(itr.next() == me)
               {
                   System.out.println("Hello");;
               }
               count++;
           }
        assertEquals(2,count);
        }


    @Test
    public void testIteratorNext(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        me.setAddress("Street 1","Town 1" ,"Postal Code");
        LinkedList<Person> expected = new LinkedList<Person>();
        expected.add(me);
        expected.add(santosh);
        Iterator itr= expected.iterator();
        int size=expected.size();
        int count=0;
        while( itr.hasNext())
        {
            if(itr.next() == me)
            {
                count++;
            }

        }
        assertEquals(1,count);
    }





}





