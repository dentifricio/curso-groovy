package io.loco.groovy.dsl

class MyDSL {

    def print = 0
    def please(print) {
        [the: {println it}]
        // [the: System.out.&println]
    }

    void dsl1(){
        //this.please(print).the(123)
        // como na mesma classe, pode ser please(print).the(123) (sem this)
        please print the 123
    }

    class operacoesMatematicas(){

        def valor

        operacoesMatematicas(valor){
            this.valor = valor
        }

    }

    def carc(int n){


                //mais: {n + it},
                //meno: {n -it}
        def mais(def num) {
            valor+= numero
            this
        }

                def meno(def num) {carc(n-it)}
                def vezes(def num) { carc(n * it)}
                def dividepor(def num) {carc(n.intdiv(it))}
                def fim() { n }

    }

    int dsl2(int a, int b) {
        // carc(a).plus(b)
        carc a mais b fim()

        // def plus1 = carc 1
    }

    int dsl3(int a, int b) {
        // carc(a).plus(b)
        carc a meno b fim()
    }

    int dsl4(int a, int b, int c) {
        // carc(a).plus(b).minus(c)
        carc a mais b meno c fim()
    }

    int dsl5(int a, int b, int c, int d, int e) {
        // carc(a).plus(b).minus(c)
        carc a mais b meno c vezes d dividepor e fim() // não multiplica c por d antes de fazer o resto
    }

}
