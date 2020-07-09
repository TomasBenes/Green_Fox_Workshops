package com.company.Sum;

import com.company.Apples.Apple_exercise;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum sum1;
    ArrayList<Integer> testNumbers;


    @BeforeAll
    public static void beforeAllTests () {
        System.out.println("Executed only once before all tests, TESTS ARE RUNNING");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("TESTS ARE DONE");
    }

    @BeforeEach
    public void init(){
        sum1 = new Sum();
        testNumbers = new ArrayList<>();

    }
    @AfterEach
    public void afterTest(){
        System.out.println("Test was done");
    }

    @Test
    public void testForCheckingSomething () {
        testNumbers.add(0,5);
        testNumbers.add(1,10);
        testNumbers.add(2,15);
        int actual = sum1.summing(testNumbers);
        int expected = 30;
        assertEquals(actual, expected);
    }

    @Test
    public void testEmptyList () {
        testNumbers.clear();
        int actual = sum1.summing(testNumbers);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    public void testOneElementList () {
        testNumbers.add(0,5);
        int actual = sum1.summing(testNumbers);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test
    public void testMultipleElementList () {
        testNumbers.add(0,5);
        testNumbers.add(1,10);
        testNumbers.add(2,15);
        int actual = sum1.summing(testNumbers);
        int expected = 30;
        assertEquals(actual, expected);
    }

    @Test
    public void testNullElementList () {
        /*testNumbers.add(0,0);
        int actual = sum1.summing(testNumbers);
        int expected = 0;
        assertEquals(actual, expected);*/
        testNumbers = null;
        assertNull(testNumbers);
    }

}