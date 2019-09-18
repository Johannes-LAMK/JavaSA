/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasa;

/**
 *
 * @author Johannes
 */
class A {
    class B {
        private String str;
        B(){
            System.out.println("B object created");
        }
    }
    private B b;
    A(){
        System.out.println("A object created");
        this.b = new B();
    }
}
