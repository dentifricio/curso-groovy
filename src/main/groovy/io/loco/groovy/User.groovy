package io.loco.groovy

class User {
    // String name
    private String name
    int age

    User(String name, int age) {
        this.name = name
        this.age = age
    }


    boolean equals(Object obj) {
        false
    }

    boolean equals(io.loco.groovy.User user) {
        this.name == user.name &&
                this.age == user.age
    }

    String getName(){
        return name
    }

    void setName(String name){
        this.name = '-' + name
    }

}