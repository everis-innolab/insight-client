package com.everis.blockchain.insight.client.model;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 * @author mrmx
 * @param <T>
 */
public abstract class SimpleValue<T> {
    
    private T value;

    /**
     *
     * @param value
     */
    public SimpleValue(T value) {
        this.value = value;
    }
    
    /**
     *
     * @return
     */
    @JsonValue
    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    } 
}