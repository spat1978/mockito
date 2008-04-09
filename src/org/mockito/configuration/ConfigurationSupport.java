/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.configuration;

import java.lang.reflect.Modifier;

import org.mockito.invocation.InvocationOnMock;

/**
 * Helps configuring Mockito
 * <p>
 * See examples from mockito/test/org/mockitousage/examples/configure subpackage. 
 * You may want to check out the project from svn repository to easily browse Mockito's test code.
 */
public class ConfigurationSupport {
    
    /**
     * this is what Mockito returns by default for given invocation 
     * 
     * @param invocation
     * @return default return value
     */
    public static Object defaultValueFor(InvocationOnMock invocation) {
        return MockitoProperties.DEFAULT_RETURN_VALUES.valueFor(invocation);
    }

    /**
     * @param clazz
     * @return returns true if Mockito CAN create mocks of the clazz
     */
    public static boolean isMockable(Class<?> clazz) {
        return Modifier.isFinal(clazz.getModifiers());
    }
}