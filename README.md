Java Insight Client
========================================================

Pure java client implementation of [Bitpay](https://bitpay.com)'s [Insight](https://insight.is) blockchain rest [API](https://github.com/bitpay/insight-api).


Dependencies
---------------
- [Rescu](https://github.com/mmazi/rescu) (Lean JAX-RX implementation) - [Pending pull request](https://github.com/mrmx/rescu) -
- Slf4j (via [Logback](http://logback.qos.ch))
- Apache's commons-lang
- Google's [Guava](https://github.com/google/guava)

Features and benefits
---------------

- Small core
- Pure java api and model (Jackson's data-bind annotated pojo's)


Work in progress (aka limitations)
--------------- 
- Single parameter support
- Read-only (eg: no TX broadcast submit support)
- Relies on rescu's http and related exceptions
- No pagination support
- Websockets


Usage
---------------

#### Sample code:

    import com.everis.blockchain.insight.client;
    
    ...
    //Create an insight client:
    InsightClient client = new InsightClient.Builder() 
                .baseUrl("https://test-insight.bitpay.com/api")
                .proxyHost("<PROXY-HOST>").proxyPort(<PROXY-PORT>)
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

Contributions
---------------

This implementation does not cover the full [insight api](https://github.com/bitpay/insight-api) (see limitations above) so any contribution is very much appreciated! 


License
---------------

This code is released under the MIT License. Please see [LINCESE.txt](LICENSE.txt) for the full text.


