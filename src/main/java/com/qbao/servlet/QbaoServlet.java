package com.qbao.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QbaoServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int a = 12;
        int b = 20;
        int c = a + b;
        List<Integer> list1 = new ArrayList<>();
        list1.add(a);
        list1.add(b);
        list1.add(c);
        System.out.println(list1);

        Student s1 = new Student("张三", "上市微软嫂夫人路11", 31);
        Student s2 = new Student("MyYang", "电话突然12ssss", 24);
        Student s3 = new Student("hanmeimei", "shanghai road st1201", 28);
        List<Student> ss = Arrays.asList(s1, s2, s3);
        System.out.println(ss);
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

class Student {
    String name;
    int age;
    String address;

    public Student(String name, String address, int age) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}