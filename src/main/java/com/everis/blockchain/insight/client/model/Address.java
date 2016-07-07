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
import com.google.common.base.MoreObjects;
import java.util.List;

/**
 *
 * @author mrmx
 */
public class Address {

    @JsonProperty("addrStr")
    private String id;

    private double balance;
    @JsonProperty("balanceSat")
    private long balanceUnits;

    private double totalReceived;
    @JsonProperty("totalReceivedSat")
    private long totalReceivedUnits;

    private double totalSent;
    @JsonProperty("totalSentSat")
    private long totalSentUnits;

    @JsonProperty("unconfirmedBalance")
    private double balanceUnconfirmed;
    @JsonProperty("unconfirmedBalanceSat")
    private long unconfirmedBalanceUnits;

    private int unconfirmedTxApperances;
    private int txApperances;

    private List<String> transactions;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @return the balanceUnits
     */
    public long getBalanceUnits() {
        return balanceUnits;
    }

    /**
     * @return the totalReceived
     */
    public double getTotalReceived() {
        return totalReceived;
    }

    /**
     * @return the totalReceivedUnits
     */
    public long getTotalReceivedUnits() {
        return totalReceivedUnits;
    }

    /**
     * @return the totalSent
     */
    public double getTotalSent() {
        return totalSent;
    }

    /**
     * @return the totalSentUnits
     */
    public long getTotalSentUnits() {
        return totalSentUnits;
    }

    /**
     * @return the balanceUnconfirmed
     */
    public double getBalanceUnconfirmed() {
        return balanceUnconfirmed;
    }

    /**
     * @return the unconfirmedBalanceUnits
     */
    public long getUnconfirmedBalanceUnits() {
        return unconfirmedBalanceUnits;
    }

    /**
     * @return the unconfirmedTxApperances
     */
    public int getUnconfirmedTxApperances() {
        return unconfirmedTxApperances;
    }

    /**
     * @return the txApperances
     */
    public int getTxApperances() {
        return txApperances;
    }

    /**
     * @return the transactions
     */
    public List<String> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("balance", balance)
                .add("balanceUnconfirmed", balanceUnconfirmed)
                .add("totalReceived", totalReceived)
                .add("totalSent", totalSent)
                .toString();
    }

}
