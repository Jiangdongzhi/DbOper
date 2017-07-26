package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dorianns on 15/5/4.
 */
public interface Sort {
    <T extends Comparable<T>> List<T> sort(List<T> list);
}
