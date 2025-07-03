# simple_log_j

This is a simple library to log artifacts in your java code.

# Install

On your pom file add this repository:

```
    	<repositories>
		<repository>
			<id>github</id>
			<url>https://github.com/inatagan/simple_log_j</url>
			<snapshots>
				<enabled>true</enabled>
			</snapshots>
		</repository>
	</repositories>
```

On your pom file add this dependency:

```
    <dependency>
        <groupId>io.github.inatagan</groupId>
        <artifactId>simple_log_j</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
```

Then install with maven:

```
mvn install
```

# Usage

This package provides logging tools with the folowing messages levels:

* Info
* Error
* Degug
* Success
* Warning
