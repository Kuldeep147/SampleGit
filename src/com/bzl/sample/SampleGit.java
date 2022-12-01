package com.bzl.sample;
public class SampleGit {
    public static void main(String[] args) {

        System.out.println("UC1");
        System.out.println("welcome to sample git");
        SampleGit ob = new SampleGit();
        ob.add(3,8);

    }
    void add(int a, int b){
        System.out.println("addition "+(a + b));
    }
}