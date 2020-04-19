package com.Spring.SpringBootPhrases;

public class RobotPhrases {

    //  1.1   define/let,   the use of private is optional
    private String message;


    // 1.2   getter and setter
    public void  getMessage() {
        System.out.println("Robot's phrase is : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public void init(){
        System.out.println("Bean is going through init");
    }

    public void destroy(){
        System.out.println("Bean will destroy it now");
    }



}
