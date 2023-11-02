package lld2.prototypeRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry implements Registry<String, Student> {

    private Map<String, Student> map = new HashMap<>();

    @Override
    public Student getProperty(String key) {
        return map.get(key);
    }

    @Override
    public void setProperty(String key, Student s) {
        map.put(key, s);
    }
}
