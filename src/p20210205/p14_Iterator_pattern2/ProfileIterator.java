package p20210205.p14_Iterator_pattern2;


public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
