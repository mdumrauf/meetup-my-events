# saibaman

## What?
Sample project that wraps the Meetup API and exposes an endpoint to retrieve [your events] (https://secure.meetup.com/meetup_api/console/?path=/self/events).


The [auth key](https://secure.meetup.com/meetup_api/key/) is passed as a query parameter.

## Prerequisites

1. Java JDK 8+
2. Maven 3.0+ 

## How?

```
$ mvn dependency:resolve
$ mvn exec:java
```
A Jetty server will be started by the Spark framework on **127.0.0.1:4567**. The endpoint available will be: http://127.0.0.1:4567/events?key={your_key}.

```
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building saibaman 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- exec-maven-plugin:1.5.0:java (default-cli) @ saibaman ---
[Thread-1] INFO org.eclipse.jetty.util.log - Logging initialized @3513ms
[Thread-1] INFO spark.embeddedserver.jetty.EmbeddedJettyServer - == Spark has ignited ...
[Thread-1] INFO spark.embeddedserver.jetty.EmbeddedJettyServer - >> Listening on 0.0.0.0:4567
[Thread-1] INFO org.eclipse.jetty.server.Server - jetty-9.3.6.v20151106
[Thread-1] INFO org.eclipse.jetty.server.ServerConnector - Started ServerConnector@17ef272c{HTTP/1.1,[http/1.1]}{0.0.0.0:4567}
[Thread-1] INFO org.eclipse.jetty.server.Server - Started @3681ms
```

## License

[MIT License] (https://github.com/mdumrauf/meetup-my-events/blob/master/LICENSE)
