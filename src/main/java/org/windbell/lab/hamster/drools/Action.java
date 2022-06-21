package org.windbell.lab.hamster.drools;

public class Action {
    private String msg;

    public Action(String msg) {
        this.msg = msg;
    }

    public void doSomeThing() {
        System.out.println(msg);
    }
}