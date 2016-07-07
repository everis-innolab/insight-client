/*
 * The MIT License
 *
 * Copyright 2016 mrmx.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.everis.blockchain.insight.client.model.tx;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

/**
 *
 * @author mrmx
 */
public class TransactionInput {

    @JsonProperty("txid")
    private String id;

    @JsonProperty("coinbase")
    private String coinbase;

    @JsonProperty("addr")
    private String address;

    @JsonProperty("valueSat")
    private long valueRaw;

    private double value;

    @JsonProperty("vout")
    private long outputIndex;

    private long sequence;

    @JsonProperty("n")
    private int index;

    @JsonProperty("scriptSig")
    private Script script;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the coinbase
     */
    public String getCoinbase() {
        return coinbase;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the valueRaw
     */
    public long getValueRaw() {
        return valueRaw;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @return the outputIndex
     */
    public long getOutputIndex() {
        return outputIndex;
    }

    /**
     * @return the sequence
     */
    public long getSequence() {
        return sequence;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @return the script
     */
    public Script getScript() {
        return script;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("address", address)
                .add("valueRaw", valueRaw)
                .add("value", value)
                .add("script", script)
                .toString();
    }

}
