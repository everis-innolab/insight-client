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
package com.everis.blockchain.insight.client;

import com.everis.blockchain.insight.client.model.Address;
import com.everis.blockchain.insight.client.model.BlockHash;
import com.everis.blockchain.insight.client.model.Status;
import com.everis.blockchain.insight.client.model.tx.Transaction;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author mrmx
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public interface InsightService {
    
    /**
     *
     * @param id
     * @return
     */
    @GET
    @Path("addr/{id}")   
    Address getAddress(@PathParam("id") String id);
    
    /**
     *
     * @param txId
     * @return
     */
    @GET
    @Path("tx/{txid:[0-9,A-F,a-f]+}")   
    Transaction getTX(@PathParam("txid") String txId);
    
    /**
     *
     * @param blockHeight
     * @return
     */
    @GET
    @Path("block-index/{height:[0-9]+}")   
    BlockHash getBlockIndex(@PathParam("height") int blockHeight);
    
    /**
     *
     * @return
     */
    @GET
    @Path("status")      
    Status getStatus();
}
