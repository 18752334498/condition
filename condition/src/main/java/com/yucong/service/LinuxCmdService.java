package com.yucong.service;

public class LinuxCmdService implements CmdService {
    @Override
    public void print() {
        System.out.println("This is linux's environment...");
    }
}
