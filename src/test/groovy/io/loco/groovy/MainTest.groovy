package io.loco.groovy

import org.junit.Before
import org.junit.Test


class MainTest {

    Main main

    @Before
    void setup() {
        main = new Main()
    }

    @Test
    void testFoo() {
        def result = main.foo "har"
        assert result == 'salut har'
    }

    @Test
    void testMagicSum6() {
        def result = main.sum (3)
        assert result == 6
    }

    @Test
    void testMagicSum10() {
        def result = main.sum (4)
        assert result == 10
    }

    @Test
    void testMagicSumBagaca10() {
        def result = main.sumbagaca (4)
        assert result == 10
    }

    @Test
    void testRange(){
        def result = main.range(5)

        assert result == [1, 2, 3, 4, 5]
    }

    @Test
    void testCollect() {
        def result = main.myCollect([1, 2, 3])

        assert result == [2, 4, 6]
    }

    @Test
    void testCollectTruta() {
        def result = main.myCollectTruta([1, 2, 3])

        assert result == [2, 4, 6]
    }

    @Test
    void testCollectTrutaSeca() {
        def result = main.myCollectTrutaSeca([1, 2, 3])

        assert result == [2, 4, 6]
    }

    @Test
    void testCollectTrutaMolhada() {
        def result = main.myCollectTrutaMolhada([1, 2, 3])

        assert result == [2, 4, 6]
    }

    @Test
    void testCollectCoisa() {
        def result = main.myCollectCoisa([1, 2, 3])

        assert result == [2, 4, 6]
    }

 /*   @Test
    void testCollectFerrado() {
        def result = main.myCollect(['1', 2, 3])

        assert result == [2, 4, 6]
    }

    @Test
    void testCollectFerrado2() {
        def result = main.myCollect(['1', 2, 3])

        assert result == [11, 4, 6] //dá erro pelo tipo, mesmo tendo "o mesmo" valor
    } */

    @Test
    void testInterpolation(){
        def result = main.str('a', 'b')

        assert result == 'a - b'
    }

    @Test
    void testStringLiteral(){
        def result = main.strLiteral('a', 'b')

        assert result == '${a} - ${b}'
    }

    @Test
    void testStrLoop() {
        def result = main.strLoop(['a', 'b', 'c'])

        assert result == 'a, b, c'
    }

    @Test
    void testFunctionalProg(){
        def result = main.func(100)

        assert result == [0,4,8,12,16]
    }

    @Test
    void testFunctionalProgTreta(){
        def result = main.funcTreta(100, 20)

        assert result == [0,4,8,12,16]
    }

    @Test
    void testFunctionalProgTretaInv(){
        def result = main.funcTretaInv(100, 21)

        assert result == [20, 16, 12, 8, 4, 0]
    }

    @Test
    void testPrimitiveIntType() {
        int param = 0

        def result = main.primitiveType(param)

        assert result == 2
    }

    @Test
    void testPrimitiveLongType() {
        long param = 0

        def result = main.primitiveType(param)

        assert result == 4
    }

    @Test
    void testPrimitiveIntTypeDef() {
        def param = 0

        def result = main.primitiveType(param)

        assert result == 2
    }

    @Test
    void testPrimitiveLongTypeDef() {
        def param = 0L

        def result = main.primitiveType(param)

        assert result == 4
    }

    @Test
    void testDynamicVar() {
        def param = 'test'

        def result = main.dynamicVar(param)

        //assert result.getClass() == int <-- falha
        assert result.getClass() == Integer // sucesso
    }

    @Test
    void testDynamicVar2() {
        def param = 1.0

        def result = main.dynamicVar(param)

        assert result.getClass() == Integer
    }

    @Test
    void testCompareClasses() {
        def user1 = new User('Troxa', 30)
        def user2 = new User('Otario', 62)

        assert user1 != user2
    }

    @Test
    void testCompareClasses2() {
        def user1 = new User('Troxa', 30)
        def user2 = new User('Troxa', 30)

        assert user1 == user2
    }
    /*
    @Test
    void testClassAttrib(){
        def user = new User('Troxa', 30)

        assert user.name == 'Troxa'

       // user.name = 'Otario'
       // assert user.name == 'Otario'

        // user.name = 'Otario'
        // assert user.getName() == 'Otario' <- falha
        user.setName('Otario')
        assert user.getName() == 'Otario'
    }
    */
/*
     @Test
     void testFB(){
       // def result = main.funcFB(15)

        // assert result == [1,2,'Fizz',4,'Buzz','Fizz',7,8,'Fizz','Buzz',11,'Fizz',13,14,'FizzBuzz']

         assert (0..0)==[0]
         //assert result == [14]
     }
*/

    @Test
    void testCaixa(){
        def result = main.notas(80)
        assert result == [cem : 0]
    }

}
