package com.netty.practice;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        new RedisServer().run(6379);
    }
}
