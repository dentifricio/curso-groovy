package io.loco.groovy.fizzbuzz

import org.junit.Test

class fizzBuzzTest {

    @Test
    void testFizzBuzzParser(){
        def fizzBuzz = fizzBuzz.getInstance([1])

        assert fizzBuzz.parsedList.size() == 1
        assert fizzBuzz.parsedList.first().value == 1
    }

    @Test
    void listWithValues(){
        def fizzBuzz = fizzBuzz.getInstance(1..15)
        def expectedList = [1, 2, 'Fizz', 4, 'Buzz', 'Fizz', 7, 8, 'Fizz',
        'Buzz', 11, 'Fizz', 13, 14, 'FizzBuzz']
        def expectedText = '1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz'

        assert fizzBuzz.toList() == expectedList
        assert fizzBuzz.toString == expectedText
    }

    @Test
    void nonFizz(){
        def fizzBuzz = fizzBuzz.getInstance(1..15)
        def excpectedList = [1,2,4,7,8,11,13,14]

        assert fizzBuzz.extractNonFizzBuzz() == expectedList
    }

    @Test
    void rawValuesFizzOnly(){
        def fizzBuzz = FizzBuzz.getInstance(1..15)
        def expectedList = [3,6,9,12]
    }
}
