package rocks.zipcode;
import org.junit.Test;
import gettestie.src.main.java.rocks.zipcode.Person;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class TestArrayList {

          @Test
       public void testArrayListAdd(){
       //Person person=new Person;
       Person me = new Person("Gunjan", 1988);
       Person santosh = new Person("Santosh", 1975);
       Person tom = new Person("Tom", 1955);
       Person [] meAndSantosh = {me,santosh};
       ArrayList<Person> actual = new ArrayList<>(Arrays.asList(meAndSantosh));
       actual.add(tom);
       Person [] all = {me,santosh,tom};
       ArrayList<Person> expected = new ArrayList<>(Arrays.asList(all));
       assertEquals(expected,actual);
            }
    @Test
    public void testArrayListRemove(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        Person [] meAndSantoshTom = {me,santosh,tom};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(meAndSantoshTom));
        actual.remove(santosh);
        Person [] all = {me,tom};
        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(all));
        assertEquals(expected,actual);
    }


    @Test
    public void testArrayListClearAndEmpty(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        Person [] meAndSantoshTom = {me,santosh,tom};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(meAndSantoshTom));
        actual.clear();
       // Person [] all = {me,tom};
        //ArrayList<Person> expected = new ArrayList<>(Arrays.asList(all));
        assertTrue(actual.isEmpty());
    }
    @Test
    public void testArrayListClone(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        Person [] meAndSantoshTom = {me,santosh,tom};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(meAndSantoshTom));
        ArrayList<Person> expected= (ArrayList<Person>) actual.clone();
         assertEquals(expected,actual);
    }
    @Test
    public void testArrayIndexOf(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        Person [] meAndSantoshTom = {me,santosh,tom};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(meAndSantoshTom));
        int expectedIndex=0;
        assertEquals(expectedIndex,actual.indexOf(me));
    }

    @Test
    public void testArrayGet(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        Person [] meAndSantoshTom = {me,santosh,tom};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(meAndSantoshTom));

        assertEquals(me,actual.get(0));
    }
    @Test
    public void testArraySet(){
        //Person person=new Person;
        Person me = new Person("Gunjan", 1988);
        Person santosh = new Person("Santosh", 1975);
        Person tom = new Person("Tom", 1955);
        Person [] meAndSantoshTom = {me,santosh,tom};
        Person tomModified = new Person("Garry", 1945);
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(meAndSantoshTom));
        actual.set(2,tomModified);
        ArrayList<Person> copyExpected= (ArrayList<Person>) actual.clone();
        assertEquals(me,actual.get(0));
    }

}

