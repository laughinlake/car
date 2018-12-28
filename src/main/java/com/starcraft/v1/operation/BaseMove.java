package com.starcraft.v1.operation;

public class BaseMove implements IMove{

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void faster() {
        System.out.println("faster");
    }

    @Override
    public void slower() {
        System.out.println("slower");
    }

    @Override
    public void turn() {
        System.out.println("turn");
    }

    @Override
    public void forward() {
        System.out.println("forward");
    }

    @Override
    public void backward() {
        System.out.println("backward");
    }
}
