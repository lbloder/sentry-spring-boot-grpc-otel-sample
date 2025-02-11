# Spring Boot Sentry GRPC with OpenTelemetry Sample

This project is a copy one of the samples from the [gRPC Spring Boot Starter](https://github.com/yidongnan/grpc-spring-boot-starter/blob/master/examples/local-grpc-server/build.gradle), adapted to showcase Sentry and OpenTelemetry integration with gRPC.

```
$ ./gradlew runWithAgent
```

Adapt `sentry.properties` to your needs.

The server starts by default on port 8080. Test with [gRPCurl](https://github.com/fullstorydev/grpcurl):

```
$ grpcurl -d '{"name":"Hi"}' -plaintext localhost:8080 Simple.SayHello
```