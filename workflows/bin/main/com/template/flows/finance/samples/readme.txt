Andrew Stakiwicz - R3 

Two important disclaimers here: 



This project is an early attempt to build out some structured derivative content using Corda

Key aspects to the build here...

QuantLib - Open source project for financial math, this will be used at first for daycount conventions holiday calanders and the like. 
Eventually utilizing quantlib for valuing products with optionality is a stretch goal 

Quantlib_SWIG - Quantlib is a C++ library, whereas Corda is a JVM based platform. Swig bindings are used to package the C++ code into a 
jar file using a dark sorcery that I won't pretend to understand, but that I'm grateful for. 

Quandl - Things are always more fun with real market data, quandl.com is an online aggregation of free and paid market data sources. Here 
I've leveraged freely available MD sources, eventually it would be nice to work with paid or other MD providers to build more complex and 
interesting curves and such.  

What follows are mostly notes to self of things I needed to do to get things working harmoniously...

In order for VS-Code to have access to org.quantlib I add the following path to my local quantlib jar file to the .classpath file 
	<classpathentry exported="true" kind="lib" path="/Users/andrewstakiwicz/quantlib_swig/QuantLib-SWIG-1.16.1/Java/QuantLib.jar"/>

IN order to get the library visible at run-time I added this vm argument to the debug configuration 
	vmArgs=-Djava.library.path=/Users/andrewstakiwicz/quantlib_swig/QuantLib-SWIG-1.16.1/Java



