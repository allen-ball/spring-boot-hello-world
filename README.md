# spring-boot-hello-world

Provides a [Spring Boot](https://spring.io/projects/spring-boot)
["Hello, World"](jar) application and reference implementations for a number
of packaging options.

| Subdirectory       | Description
| ---:               | ---
| [jar](jar)         | Application JAR
| [war](war)         | JAR [repackaged](https://docs.spring.io/spring-boot/docs/current/maven-plugin/repackage-mojo.html) as WAR
| [server](server)   | Self-contained JAR: `java -jar hello-server-1.0.0.jar`
| [service](service) | Self-contained executable: `./hello-service-1.0.0.jar`
| [gae](gae)         | JAR [repackaged](https://docs.spring.io/spring-boot/docs/current/maven-plugin/repackage-mojo.html) as WAR to be [deployed](https://cloud.google.com/appengine/docs/standard/java/tools/maven-reference) to [Google App Engine](https://cloud.google.com/appengine/)
| [jib](jib)         | JAR [repackaged](https://docs.spring.io/spring-boot/docs/current/maven-plugin/repackage-mojo.html) as WAR for [container](https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin)
