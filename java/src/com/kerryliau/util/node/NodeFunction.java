package com.kerryliau.util.node;

@FunctionalInterface
public interface NodeFunction<T> {
    void invoke(T data);
}
