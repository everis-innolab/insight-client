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
package com.everis.blockchain.insight.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;

/**
 *
 * @author mrmx
 */
@JsonRootName(value = "info")
public class Status {

    @JsonProperty("version")
    private int version;

    @JsonProperty("protocolversion")
    private int protocolVersion;

    @JsonProperty("blocks")
    private int blocks;

    @JsonProperty("connections")
    private int connections;

    @JsonProperty("difficulty")
    private long difficulty;

    @JsonProperty("testnet")
    private boolean testnet;

    @JsonProperty("relayfee")
    private long relayfee;

    @JsonProperty("network")
    private String network;

    @JsonProperty("errors")
    private String errors;

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
    public int getProtocolVersion() {
        return protocolVersion;
    }

    /**
     *
     * @return
     */
    public int getBlocks() {
        return blocks;
    }

    /**
     *
     * @return
     */
    public int getConnections() {
        return connections;
    }

    /**
     *
     * @return
     */
    public long getDifficulty() {
        return difficulty;
    }

    /**
     *
     * @return
     */
    public boolean isTestnet() {
        return testnet;
    }

    /**
     *
     * @return
     */
    public long getRelayfee() {
        return relayfee;
    }

    /**
     *
     * @return
     */
    public String getNetwork() {
        return network;
    }

    /**
     *
     * @return
     */
    public String getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("version", version)
                .add("protocolVersion", protocolVersion)
                .add("blocks", blocks)
                .add("difficulty", difficulty)
                .add("testnet", testnet)
                .add("relayfee", relayfee)
                .add("network", network)
                .add("errors", errors)
                .toString();
    }

}