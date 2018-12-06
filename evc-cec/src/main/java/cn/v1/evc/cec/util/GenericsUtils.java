package cn.v1.evc.cec.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Auther: wr
 * @Date: 2018/11/26
 * @Description:
 */
public class GenericsUtils {
    /**
     *  通过反射,获得定义Class时声明的父类的范型参数的类型.
     * 如public BookManager extends GenericManager<Book>
     * @param clazz The class to introspect
     */
    public static Class getSuperClassGenericType(Class clazz) {
        return getSuperClassGenericType(clazz, 0);
    }

    /**
     * 通过反射,获得定义Class时声明的父类的范型参数的类型.
     * 如public BookManager extends GenericsUtils Manager<Book>
     *
     * @param clazz clazz The class to introspect
     * @param index the Index of the generic declaration,start from 0.
     */

    public static Class getSuperClassGenericType(Class clazz, int index) throws IndexOutOfBoundsException {
        Type genType = clazz.getGenericSuperclass();
        if (!(genType instanceof ParameterizedType)) {
            return Object.class;
        }
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        if (index >= params.length || index < 0) {
            return Object.class;
        }
        if (!(params[index] instanceof Class)) {
            return Object.class;
        }
        return (Class) params[index];
    }
}
