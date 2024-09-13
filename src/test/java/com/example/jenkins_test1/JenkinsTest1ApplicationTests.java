package com.example.jenkins_test1;

import com.example.service.Result;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTest1ApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public Result add(int a, int b) {
        int sum = a / 0;
        return new Result(sum);
    }
    @Test
    public Result add2(int a, int b) {
        int sum = a;
        return new Result(sum);
    }

    @Test
    public Result add3(int a, int b) {
        int sum = a + b;
        return new Result(sum);
    }
}
