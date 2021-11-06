package com.jano;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        Client client;
        client = new Client("127.0.0.1");  // localhost
        client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        client.startRunning();
    }
}
