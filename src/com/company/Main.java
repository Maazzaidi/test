package com.company;

public class Main {

    public static void main(String[] args) {
            //a method is a block of code that can be excecuted whenever it is called upon
            int age = 8;
            tatti();
            String name = "maaz";

            hello(age,name);
        }
        static void hello(int age, String name){
            System.out.println("hello, your name is" +name );
        }
        static void tatti (){
            System.out.println("tatti time");
        }

    }

