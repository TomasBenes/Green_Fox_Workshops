package com.company.Apples;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Apple_exerciseTest {

    Apple_exercise apple_exercise;

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
        apple_exercise = new Apple_exercise();

    }
    @AfterEach
    public void afterTest(){
        System.out.println("Test was done");
    }

    @Test
    public void getAppleTest () {
        String actual = apple_exercise.getApple();
        String expected = "apple";
        assertEquals(actual, expected);
    }
}