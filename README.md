<p align="center">
  <img src="https://www.corda.net/wp-content/uploads/2016/11/fg005_corda_b.png" alt="Corda" width="500">
</p>

# financial_derivatives_demo

Welcome to the Financial Derivatives Demo in Corda.  

This is for demonstration purposes only, and it comes as-is, open source with no warantees of any kind.  Do not use this pricing information for the purposes of real-world valuations. I cant stress enough that this is all pretty approximate, and not to be used as is in a real world financial application.
If you ignore those warning, and come to regret it, please don't sue me. 

This project is built on top of the Cordapp Template in Kotlin, so the stucture is borrowed from there. 

Critical components here beyond Corda are as follows.

1) QuantLib - Quantlib is a free open source library for quantitative finance written in C++ by people way smarter than me. 
I'm greatful to the community around it, find more info here: https://www.quantlib.org/

2) SWIG (Simplified Wrapper and Interface Generator) - Because the quantlib library is written in C++ in order to access it from a Java context we require swig bindings.  This is also a wonderful opensource library, see details here:   http://www.swig.org/

3) Quandl - The hope eventually is to build against multiple market data sources, Boomberg, Reuters etc. for now building using the freely available API from Quandl and some treasury data. Quandl info here https://www.quandl.com/

Quandl is conveniently repackaging US treasury data found here: 
https://www.treasury.gov/resource-center/data-chart-center/interest-rates/pages/textview.aspx?data=yield

The rest of this is doc included with the original COrDapp template... I will clean it up in time  

# CorDapp Template - Kotlin

Welcome to the Kotlin CorDapp template. The CorDapp template is a stubbed-out CorDapp that you can use to bootstrap 
your own CorDapps.

**This is the Kotlin version of the CorDapp template. The Java equivalent is 
[here](https://github.com/corda/cordapp-template-java/).**

# Pre-Requisites

See https://docs.corda.net/getting-set-up.html.

# Usage

## Running tests inside IntelliJ

We recommend editing your IntelliJ preferences so that you use the Gradle runner - this means that the quasar utils
plugin will make sure that some flags (like ``-javaagent`` - see below) are
set for you.

To switch to using the Gradle runner:

* Navigate to ``Build, Execution, Deployment -> Build Tools -> Gradle -> Runner`` (or search for `runner`)
  * Windows: this is in "Settings"
  * MacOS: this is in "Preferences"
* Set "Delegate IDE build/run actions to gradle" to true
* Set "Run test using:" to "Gradle Test Runner"

If you would prefer to use the built in IntelliJ JUnit test runner, you can run ``gradlew installQuasar`` which will
copy your quasar JAR file to the lib directory. You will then need to specify ``-javaagent:lib/quasar.jar``
and set the run directory to the project root directory for each test.

## Running the nodes

See https://docs.corda.net/tutorial-cordapp.html#running-the-example-cordapp.

## Interacting with the nodes

### Shell

When started via the command line, each node will display an interactive shell:

    Welcome to the Corda interactive shell.
    Useful commands include 'help' to see what is available, and 'bye' to shut down the node.
    
    Tue Nov 06 11:58:13 GMT 2018>>>

You can use this shell to interact with your node. For example, enter `run networkMapSnapshot` to see a list of 
the other nodes on the network:

    Tue Nov 06 11:58:13 GMT 2018>>> run networkMapSnapshot
    [
      {
      "addresses" : [ "localhost:10002" ],
      "legalIdentitiesAndCerts" : [ "O=Notary, L=London, C=GB" ],
      "platformVersion" : 3,
      "serial" : 1541505484825
    },
      {
      "addresses" : [ "localhost:10005" ],
      "legalIdentitiesAndCerts" : [ "O=PartyA, L=London, C=GB" ],
      "platformVersion" : 3,
      "serial" : 1541505382560
    },
      {
      "addresses" : [ "localhost:10008" ],
      "legalIdentitiesAndCerts" : [ "O=PartyB, L=New York, C=US" ],
      "platformVersion" : 3,
      "serial" : 1541505384742
    }
    ]
    
    Tue Nov 06 12:30:11 GMT 2018>>> 

You can find out more about the node shell [here](https://docs.corda.net/shell.html).

### Client

`clients/src/main/kotlin/com/template/Client.kt` defines a simple command-line client that connects to a node via RPC 
and prints a list of the other nodes on the network.

#### Running the client

##### Via the command line

Run the `runTemplateClient` Gradle task. By default, it connects to the node with RPC address `localhost:10006` with 
the username `user1` and the password `test`.

##### Via IntelliJ

Run the `Run Template Client` run configuration. By default, it connects to the node with RPC address `localhost:10006` 
with the username `user1` and the password `test`.

### Webserver

`clients/src/main/kotlin/com/template/webserver/` defines a simple Spring webserver that connects to a node via RPC and 
allows you to interact with the node over HTTP.

The API endpoints are defined here:

     clients/src/main/kotlin/com/template/webserver/Controller.kt

And a static webpage is defined here:

     clients/src/main/resources/static/

#### Running the webserver

##### Via the command line

Run the `runTemplateServer` Gradle task. By default, it connects to the node with RPC address `localhost:10006` with 
the username `user1` and the password `test`, and serves the webserver on port `localhost:10050`.

##### Via IntelliJ

Run the `Run Template Server` run configuration. By default, it connects to the node with RPC address `localhost:10006` 
with the username `user1` and the password `test`, and serves the webserver on port `localhost:10050`.

#### Interacting with the webserver

The static webpage is served on:

    http://localhost:10050

While the sole template endpoint is served on:

    http://localhost:10050/templateendpoint
    
# Extending the template

You should extend this template as follows:

* Add your own state and contract definitions under `contracts/src/main/kotlin/`
* Add your own flow definitions under `workflows/src/main/kotlin/`
* Extend or replace the client and webserver under `clients/src/main/kotlin/`

For a guided example of how to extend this template, see the Hello, World! tutorial 
[here](https://docs.corda.net/hello-world-introduction.html).
# financial_derivatives_demo
