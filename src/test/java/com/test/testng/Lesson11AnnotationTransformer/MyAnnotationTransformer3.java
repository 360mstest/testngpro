/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.test.testng.Lesson11AnnotationTransformer;

import org.testng.IAnnotationTransformer3;
import org.testng.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 在这里编写类的功能描述
 *
 * @author binger
 * @created 2018/9/10
 */
public class MyAnnotationTransformer3 implements IAnnotationTransformer3 {
    public void transform(IListenersAnnotation annotation, Class testClass) {
    }

    /**
     * Transform an IConfiguration annotation.
     * <p>
     * Note that only one of the three parameters testClass,
     * testConstructor and testMethod will be non-null.
     *
     * @param annotation      The annotation that was read from your
     *                        test class.
     * @param testClass       If the annotation was found on a class, this
     *                        parameter represents this class (null otherwise).
     * @param testConstructor If the annotation was found on a constructor,
     *                        this parameter represents this constructor (null otherwise).
     * @param testMethod      If the annotation was found on a method,
     */
    public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

    }

    /**
     * Transform an IDataProvider annotation.
     *
     * @param annotation
     * @param method     The method annotated with the IDataProvider annotation.
     */
    public void transform(IDataProviderAnnotation annotation, Method method) {

    }

    /**
     * Transform an IFactory annotation.
     *
     * @param annotation
     * @param method     The method annotated with the IFactory annotation.
     */
    public void transform(IFactoryAnnotation annotation, Method method) {

    }

    /**
     * This method will be invoked by TestNG to give you a chance
     * to modify a TestNG annotation read from your test classes.
     * You can change the values you need by calling any of the
     * setters on the ITest interface.
     * <p>
     * Note that only one of the three parameters testClass,
     * testConstructor and testMethod will be non-null.
     *
     * @param annotation      The annotation that was read from your
     *                        test class.
     * @param testClass       If the annotation was found on a class, this
     *                        parameter represents this class (null otherwise).
     * @param testConstructor If the annotation was found on a constructor,
     *                        this parameter represents this constructor (null otherwise).
     * @param testMethod      If the annotation was found on a method,
     */
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

    }
}
