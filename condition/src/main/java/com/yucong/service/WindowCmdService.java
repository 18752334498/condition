package com.yucong.service;

public class WindowCmdService implements CmdService {
    @Override
    public void print() {
        System.out.println("This is window's environment...");
    }
}
