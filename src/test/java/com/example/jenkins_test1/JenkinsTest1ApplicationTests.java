package com.example.jenkins_test1;

import com.example.service.Result;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class JenkinsTest1ApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void testAddThrowsException() {
        assertThrows(ArithmeticException.class, () -> {
            int sum = 1 / 0; // 触发除以零的异常
        });
    }

    @Test
    void testAdd2() {
        int a = 1;
        int sum = a; // 没有操作，只返回 a
        Result result = new Result(sum);
        assertEquals(1, result.getValue()); // 确认结果为 1
    }

    @Test
    void testAdd3() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        Result result = new Result(sum);
        assertEquals(3, result.getValue()); // 验证结果是否为 3
    }
}
