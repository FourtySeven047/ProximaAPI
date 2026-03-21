# ![Logo](https://cdn.minevalley.eu/branding/logo_64px_cropped.png) - ProximaAPI

The ProximaAPI provides microservices and proxy-plugins access to the cloud of MineValleyEU.

> [!NOTE]\
> The repository is fully documented.

## Maven Integration

To use the ProximaAPI in your microservice, we provide a Maven repository hosted on GitHub.  
Before proceeding, ensure you’ve added a token to your `settings.xml` file (details below).

```xml

<repository>
    <id>proxima-api</id>
    <url>https://maven.pkg.github.com/MineValley/ProximaAPI</url>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>
```

```xml

<dependency>
    <groupId>minevalley.proxima</groupId>
    <artifactId>api</artifactId>
    <version>0.0.0</version>
</dependency>
```