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
public class TransactionOutput {

    private Long valueRaw;
    private double value;

    @JsonProperty("n")
    private int index;

    @JsonProperty("scriptPubKey")
    private Script script;

    private String spentTxId;
    private int spentIndex;
    private long spentHeight;

    /**
     *
     * @return
     */
    public double getValue() {
        return value;
    }

    /**
     *
     * @return
     */
    public long getValueRaw() {
        if (valueRaw != null) {
            return valueRaw.longValue();
        }
        return valueRaw = (long) (value * 100000000d);
    }

    /**
     *
     * @return
     */
    public int getIndex() {
        return index;
    }

    /**
     *
     * @return
     */
    public Script getScript() {
        return script;
    }

    /**
     * @return the spentTxId
     */
    public String getSpentTxId() {
        return spentTxId;
    }

    /**
     * @return the spentIndex
     */
    public int getSpentIndex() {
        return spentIndex;
    }

    /**
     * @return the spentHeight
     */
    public long getSpentHeight() {
        return spentHeight;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("valueRaw", getValueRaw())
                .add("value", value)
                .add("index", index)
                .add("script", script)
                .add("spentTxId", spentTxId)
                .add("spentIndex", spentIndex)
                .add("spentHeight", spentHeight)
                .toString();
    }

}
