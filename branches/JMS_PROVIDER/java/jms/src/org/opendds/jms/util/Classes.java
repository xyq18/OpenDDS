/*
 * $Id$
 */

package org.opendds.jms.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  Steven Stallion
 * @version $Revision$
 */
public class Classes {

    public static Method findDeclaredMethod(Class clazz,
                                            String methodName,
                                            Object[] parameters) throws NoSuchMethodException {
        Class[] parameterTypes = null;
        if (parameters != null) {
            parameterTypes = getTypes(parameters);
        }

        return clazz.getMethod(methodName, parameterTypes);
    }

    public static Class[] getTypes(Object[] parameters) {
        List<Class> types = new ArrayList<Class>();

        for (Object parameter : parameters) {
            types.add(parameter.getClass());
        }

        return types.toArray(new Class[types.size()]);
    }

    //

    private Classes() {}
}
