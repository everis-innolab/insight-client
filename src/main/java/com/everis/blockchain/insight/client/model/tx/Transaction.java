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
import java.util.List;

/**
 *
 * @author mrmx
 */
public class Transaction {

    @JsonProperty("txid")
    private String id;

    private int version;
    private long lockTime;

    @JsonProperty("blockhash")
    private String blockID;

    @JsonProperty("blockheight")
    private long blockHeight;

    private long confirmations;

    @JsonProperty("blocktime")
    private long blockTime;

    @JsonProperty("size")
    private long blockSize;

    @JsonProperty("isCoinBase")
    private boolean coinbase;

    private double valueOut;

    @JsonProperty("vin")
    private List<TransactionInput> inputs;

    @JsonProperty("vout")
    private List<TransactionOutput> outputs;

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public int getVersion() {
        return version;
    }

    /**
     *
     * @return
     */
    public long getLockTime() {
        return lockTime;
    }

    /**
     *
     * @return
     */
    public String getBlockID() {
        return blockID;
    }

    /**
     *
     * @return
     */
    public long getBlockHeight() {
        return blockHeight;
    }

    /**
     *
     * @return
     */
    public long getConfirmations() {
        return confirmations;
    }

    /**
     *
     * @return
     */
    public long getBlockTime() {
        return blockTime;
    }

    /**
     *
     * @return
     */
    public long getBlockSize() {
        return blockSize;
    }

    /**
     *
     * @return
     */
    public boolean isCoinbase() {
        return coinbase;
    }

    /**
     *
     * @return
     */
    public double getValueOut() {
        return valueOut;
    }

    /**
     *
     * @return
     */
    public List<TransactionInput> getInputs() {
        return inputs;
    }

    /**
     *
     * @return
     */
    public List<TransactionOutput> getOutputs() {
        return outputs;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("version", version)
                .add("lockTime", lockTime)
                .add("blockID", blockID)
                .add("blockHeight", blockHeight)
                .add("blockTime", blockTime)
                .add("blockSize", blockSize)
                .add("confirmations", confirmations)
                .add("isCoinbase", coinbase)
                .add("valueOut", valueOut)
                .toString();
    }

}
