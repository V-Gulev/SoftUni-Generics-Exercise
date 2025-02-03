package array_creator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {
    static <T> T[] create(int length, T item){
        T[] array = (T[]) Array.newInstance(item.getClass(), length);
        Arrays.fill(array, item);
        return array;
    }

    static <T> T[] create(Class<T> clazz, int length, T item){
        T[] array = (T[]) Array.newInstance(clazz, length);
        Arrays.fill(array, item);
        return array;
    }
}
