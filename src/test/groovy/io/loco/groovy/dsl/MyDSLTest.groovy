package io.loco.groovy.dsl

import org.junit.Before
import org.junit.Test

class MyDSLTest {


    MyDSL myDSL

    @Before
    void setup() {
        myDSL = new MyDSL()
    }

    @Test
    void testDsl1(){
        myDSL.dsl1()
    }

    @Test
    void testDsl2() {

        //def result = myDSL.dsl2(1, 2)

        def result = myDSL.dsl2(1, 2)
        assert result == 3
    }

    @Test
    void testDsl3() {

        //def result = myDSL.dsl2(1, 2)

        def result = myDSL.dsl3(2, 2)
        assert result == 0
    }

    @Test
    void testDsl4() {

        //def result = myDSL.dsl2(1, 2)

        def result = myDSL.dsl4(2, 2, 1)
        assert result == 3
    }

    @Test
    void testDsl5() {

        //def result = myDSL.dsl2(1, 2)

        def result = myDSL.dsl5(2, 2, 1, 4, 3)
        assert result == 4
    }


}
