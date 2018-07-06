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
        assert result == [cem:0, cinquenta:1, vinte:1, dez:1, cinco:0, dois:0, um:0]
    }

    @Test
    void testCaixa126(){
        def result = main.notas(126)
        assert result == [cem:1, cinquenta:0, vinte:1, dez:0, cinco:1, dois:0, um:1]
    }

    @Test
    void testCaixa388(){
        def result = main.notas(388)
        assert result == [cem:3, cinquenta:1, vinte:1, dez:1, cinco:1, dois:1, um:1]
    }

    @Test
    void reverso(){
        def result = main.reverse(0..10)

        assert result == [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    }


    @Test
    void testCaixa28(){
        def result = main.saque(28)
        assert result == [100:0, 50:0, 20:1, 10:0, 5:0, 2:4]
    }


    @Test
    void testCaixa90(){
        def result = main.saque(90)
        assert result == [100:0, 50:1, 20:2, 10:0, 5:0, 2:0]
    }

    @Test
    void testCaixa55(){
        def result = main.saque(55)
        assert result == [100:0, 50:1, 20:0, 10:0, 5:1, 2:0]
    }
/*
    @Test
    void testCaixa51(){
        try {
            main.saque(51)
            throw new Exception('morreu')
        }catch (valorNaoSuportadoException)
        //assert result == [100:0, 50:0, 20:2, 10:0, 5:1, 2:3]
    }*/


}
