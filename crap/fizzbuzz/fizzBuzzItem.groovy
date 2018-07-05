package io.loco.groovy.fizzbuzz

class fizzBuzzItem {

    def value
    int rawValue

    fizzBuzzItem(int rawValue){
        this.rawValue = rawValue
        if(rawValue % 15 == 0) {
            this.value = "FizzBuzz"
        } else if (rawValue % 5 == 0){
            this.value = "Buzz"
        } else if (rawValue % 3 == 0)
            this.value = "Fizz"
    }
}
