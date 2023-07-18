package com.o7solutions.fragmentcontainerapp

/**
 * @Author: 017
 * @Date: 18/07/23
 * @Time: 1:56 pm
 */
interface Shape{
    fun draw()
}

class Circle : Shape{
    override fun draw(){
        System.out.println("in draw")
    }


}

fun main(){
    var circle = Circle()
    circle.draw()
}