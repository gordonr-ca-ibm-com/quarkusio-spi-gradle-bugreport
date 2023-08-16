A reproducer for Quarkus issue #35388

`./gradle clean build`

```
Caused by: java.util.ServiceConfigurationError: io.smallrye.config.ConfigSourceFactory: Provider org.acme.ConfigSourceFactoryImpl not found
        at io.smallrye.config.SmallRyeConfigBuilder.discoverSources(SmallRyeConfigBuilder.java:126)
        at io.smallrye.config.SmallRyeConfig$ConfigSources.buildSources(SmallRyeConfig.java:587)
        at io.smallrye.config.SmallRyeConfig$ConfigSources.<init>(SmallRyeConfig.java:537)
        at io.smallrye.config.SmallRyeConfig.<init>(SmallRyeConfig.java:69)
        at io.smallrye.config.SmallRyeConfigBuilder.build(SmallRyeConfigBuilder.java:629)
        at io.quarkus.deployment.configuration.BuildTimeConfigurationReader.initConfiguration(BuildTimeConfigurationReader.java:418)
        at io.quarkus.deployment.CodeGenerator.getConfig(CodeGenerator.java:271)
        at io.quarkus.deployment.CodeGenerator.initAndRun(CodeGenerator.java:67)
        ... 26 more
```