package hash;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedHashTable<K,V> implements IHashTable<K,V> {

  private static final int  DEFAULT_BUCKET_SIZE =1024;
  private List<Node>[] buckets;
  private int size;
  private int bucketSize;

  public MyLinkedHashTable() {
    this.buckets= new List[DEFAULT_BUCKET_SIZE];
    this.bucketSize= DEFAULT_BUCKET_SIZE;
    this.size=0;

    for (int i =0 ; i < bucketSize; i++){
      this.buckets[i] = new LinkedList<>();
    }
  }

  @Override
  public void put(K key, V value) {

  }

  @Override
  public V get(K key) {
    return null;
  }

  @Override
  public boolean delete(K key) {
    return false;
  }

  @Override
  public boolean contains(K key) {
    return false;
  }

  @Override
  public int size() {
    return 0;
  }

  private class Node {
    K key;
    V data;

    Node(K key, V data ){
      this.key = key;
      this.data= data;
    }

  }
}
