package com.example.service;

/**
 * @author Ansel Zhong
 * @description:
 * @date 2024/9/14 7:08
 * @ProjectName Jenkins_Test1
 **/
public class AddService {
    public Result add(int a, int b) {
        int sum = a / 0;
        return new Result(sum);
    }
}
