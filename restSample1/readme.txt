最简单的基于web项目的rest框架demo


maven settings.xml

mirrors:
  <mirrors>
    <mirror>
      <id>nexus-osc</id>
      <mirrorOf>*</mirrorOf>
      <name>Nexus osc</name>
      <url>http://maven.oschina.net/content/groups/public/</url>
    </mirror>
	<mirror>
        <id>nexus-osc-thirdparty</id>
        <mirrorOf>thirdparty</mirrorOf>
        <name>Nexus osc thirdparty</name>
        <url>http://maven.oschina.net/content/repositories/thirdparty/</url>
    </mirror>
  </mirrors>


profiles:
    <profiles>
	<profile>
		<id>jdk-1.4</id>
		<activation>
			<jdk>1.4</jdk>
		</activation>
		<repositories>
			<repository>
				<id>nexus</id>
				<name>local private nexus</name>
				<url>http://maven.oschina.net/content/groups/public/</url>
				<releases>
					<enabled>true</enabled>
				</releases>
				<snapshots>
					<enabled>false</enabled>
				</snapshots>
			</repository>
		</repositories>
		<pluginRepositories>
			<pluginRepository>
				<id>nexus</id>
				<name>local private nexus</name>
				<url>http://maven.oschina.net/content/groups/public/</url>
				<releases>
					<enabled>true</enabled>
				</releases>
				<snapshots>
					<enabled>false</enabled>
				</snapshots>
			</pluginRepository>
		</pluginRepositories>
	</profile>
  </profiles>