package io.loco.groovy.fizzbuzz
import io.loco.groovy.fizzbuzz.fizzBuzzItem

class fizzBuzz {

    List<fizzBuzzItem> parsedList


    static fizzBuzz getInstance(List<Integer> items) {
        def fizzBuzz = new fizzBuzz()
        fizzBuzz.parsedList = items.collect(new fizzBuzzItem(it))
        fizzBuzz
    }

    List toList() {
        parsedList.collect(){ it.value }
    }

    String toString(){
        toList().join('\n')
    }

    List<Integer> extractNonFizzBuzz() {
        toList().findAll {it.getClass()==Integer}
    }

    List<Integer> extractFizzValues() {
        parsedList.findAll { it.value == 'Fizz' }
                  .collect{ it.rawValue }
    }


}
