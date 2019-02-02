/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.test.testng.Lesson10Parallel;

import org.testng.annotations.Test;

/**
 * 在这里编写类的功能描述
 *
 * @author binger
 * @created 2018/9/7
 */
public class ParallelTest {
    @Test(invocationCount = 10)
    public void testParallel() {
        System.out.println("Parallel-threadId-" + Thread.currentThread().getId());
    }
}
