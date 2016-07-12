package com.everis.blockchain.insight.client;

import com.everis.blockchain.insight.client.deserialization.JacksonObjectMapperFactory;
import com.everis.blockchain.insight.client.model.Address;
import com.everis.blockchain.insight.client.model.Status;
import com.everis.blockchain.insight.client.model.tx.Transaction;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import si.mazi.rescu.ClientConfig;
import si.mazi.rescu.Interceptor;
import si.mazi.rescu.RestProxyFactory;

/**
 * Insight Client façade
 * 
 * @author mrmx
 */
public class InsightClient {

    private static final Logger log = LoggerFactory.getLogger(InsightClient.class);

    private InsightService service;
    private String baseUrl;
    private ClientConfig clientConfig;

    private InsightClient(String baseUrl, ClientConfig clientConfig) {
        this.baseUrl = baseUrl;
        this.clientConfig = clientConfig;
    }

    /**
     *
     * @return
     */
    public InsightService getService() {
        if (service == null) {
            configureService();
        }
        return service;
    }

    /**
     *
     * @param id
     * @return
     */
    public Address getAddress(String id) {
        return getService().getAddress(id);
    }

    /**
     *
     * @param txId
     * @return
     */
    public Transaction getTX(String txId) {
        return getService().getTX(txId);
    }

    /**
     *
     * @param blockHeight
     * @return
     */
    public String getBlockID(int blockHeight) {
        return getService().getBlockIndex(blockHeight).getValue();
    }

    /**
     *
     * @returnpackagepackage
     */
    public Status getStatus() {
        return getService().getStatus();
    }

    public static void main(String[] args) {
        InsightClient client = new InsightClient.Builder()                
                //.baseUrl("https://insight.bitpay.com/api")
                .baseUrl("https://test-insight.bitpay.com/api")
                .proxyHost("localhost").proxyPort(3128)
                .build();
        
        Status status = client.getStatus();
        System.out.println("Status:" + status);
        System.out.println("BlockID:" + client.getBlockID(0));        
        Transaction tx = client.getTX("df56e5ef85fafebb4e9bd55ffd199b87817ae495d43b8f8905d28c5ebbec1a50");
        System.out.println("Tx:" + tx);
        System.out.println("Tx inputs::" + tx.getInputs());
        System.out.println("Tx outputs::" + tx.getOutputs());
        Address addr = client.getAddress("mw5AsMPN1gVrngXS4g3dWXbS1ajQWgszRP");
        System.out.println("Addr:" + addr);
        System.out.println("Addr tx count:" + addr.getTransactions().size());
    }

    private void configureService() {
        service = RestProxyFactory.createProxy(InsightService.class, baseUrl, clientConfig, new Interceptor[]{});
    }

    /**
     *
     */
    public static class Builder {

        private String baseUrl;
        private ClientConfig clientConfig = new ClientConfig();

        /**
         *
         * @param baseUrl
         * @return
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         *
         * @param proxyHost
         * @return
         */
        public Builder proxyHost(String proxyHost) {
            clientConfig.setProxyHost(proxyHost);
            return this;
        }

        /**
         *
         * @param proxyPort
         * @return
         */
        public Builder proxyPort(int proxyPort) {
            clientConfig.setProxyPort(proxyPort);
            return this;
        }

        /**
         *
         * @return
         */
        public InsightClient build() {
            if (StringUtils.isBlank(this.baseUrl)) {
                throw new IllegalArgumentException("blank baseUrl");
            }
            clientConfig.setJacksonObjectMapperFactory(new JacksonObjectMapperFactory());
            return new InsightClient(baseUrl, clientConfig);
        }
    }
}
