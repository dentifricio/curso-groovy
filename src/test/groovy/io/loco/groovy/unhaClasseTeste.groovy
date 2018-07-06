package io.loco.groovy

import groovy.transform.TypeChecked
import org.junit.Test

// usar TypeChecked na classe que chama a coisa a ter o tipo estático
// @TypeChecked // não compila se tiver um cast louco
class unhaClasseTeste {

    @Test
    void testNewClassWithAMap() {
        def unhaClasse = new unhaClasse(a: 1, b: 2, c: 'batata')

        assert unhaClasse.a == 1
        assert unhaClasse.b == 2
        assert unhaClasse.c == 'batata'
    }

    @Test
    void testNewClassWithAMapOnlyC() {
        def unhaClasse = new unhaClasse(c:'arroz')

        assert unhaClasse.a == 0
        assert unhaClasse.b == 0
        assert unhaClasse.c == 'arroz'
    }

    @Test
    void testNewClassWithAMapOnlyAAsString() {
        def unhaClasse = new unhaClasse(a: "9", c: "75")

        assert unhaClasse.a.intdiv(50) == 1
        assert unhaClasse.a == 57
        assert unhaClasse.b == 0
        assert unhaClasse.c == '75'
        assert unhaClasse.c.toInteger().intdiv(3) == 25
    }

}

// exemplos apenas, para ver como os bagaços retornam o próprio
// método em situações em que normalmente (java) não retornaria nada

/*
class Email() {
        public Email setSubject(String subject) {
            this.subject = subject
            return this
        }
    }

new Email()
.setSubject('')
.magicMethod {this -> this.setTo('')}
.setBody('..')
.send()
}*/
