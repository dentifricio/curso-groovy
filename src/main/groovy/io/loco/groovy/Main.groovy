package io.loco.groovy

class Main {
    static void main(String[] args) {
        // System.out.println("c'est la guerre");
        // println 'c\'est la paix!'
        def var = new Main().foo('jesus')
        println var
    }

    String foo(String str) {
        "salut ${str}"
    }

    int sum(int num) {
        int acc = 0
        int i = 1

        num.times {
            acc += i
            i++
        }
        acc
    }

    int sumbagaca(int num) {
        int acc = 0

        (1..num).forEach() {
            acc += it
        }

        acc
    }

    //for (int i =1;i<=num;i++)
    //    acc += i

    // def para não precisar definir tipo
    def range(int num) {
        def list = []
        (1..num).forEach() {
            list.add(it)
        }
        list
    }

    def myCollect(def list) {
        list.collect() {
            it * 2
        }
    }

    def myCollectTruta(def list) {
        list.collect() {
            num -> num * 2
        }
    }

    def fun(int num) { num * 2 }


    def myCollectTrutaSeca(def list) {
        list.collect() { num -> fun(num)
        }
    }


    def f = { it * 2 }

    def myCollectTrutaMolhada(def list) {
        list.collect(f)
    }

    def str(String a, String b) {
        "${a} - ${b}"
    }

    def strLiteral(String a, String b) {
        '${a} - ${b}'
    }

    String strLoop(def list) {

        String str = list.join(', ')
/*
        def str = ''

        list.forEach() {
            str+= "${it}, "
        }
*/
        //int len = str.length()

        //str.substring( i: 0, len-2)

        //str
    }

    def func(int num) {
        //  0..100
        // pares
        //dobro
        // numeros < 20

        (0..num)
                .findAll() { it % 2 == 0 }
                .collect { it * 2 }
                .findAll { it < 20 }
    }


    def menorQue(int value) {
        def x = { it < value }
        x
    }

    def funcTreta(int num, int max) {
        //  0..100
        // pares
        //dobro
        // numeros < 20
        def pares = { it % 2 == 0 }
        def dobro = { it * 2 }
        // def menorQue20 =

        (0..num)
                .findAll(pares)
                .collect(dobro)
                .findAll(menorQue(max))
    }

    def funcTretaInv(int num, int max){
        //  0..100
        // pares
        //dobro
        // numeros < 20
        def pares = { it % 2 == 0}
        def dobro = { it * 2}
        // def menorQue20 =

        (0..num)
                .findAll(pares)
                .collect (dobro)
                .findAll (menorQue(max))
                .sort {a, b -> a <= b ? 1 : -1 }
    }

}
