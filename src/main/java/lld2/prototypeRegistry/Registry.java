package lld2.prototypeRegistry;

public interface Registry<K, V> {
    V getProperty(K key);

    void setProperty(K key, V value);
}
