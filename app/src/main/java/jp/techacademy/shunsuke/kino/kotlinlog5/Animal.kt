package jp.techacademy.shunsuke.kino.kotlinlog5

abstract class Animal {

    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    abstract fun say()
}