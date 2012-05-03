grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
		mavenRepo 'http://repo.9ci.com:8081/artifactory/repo'
    }
    dependencies {
		runtime ('mysql:mysql-connector-java:5.1.16') { export:false }
		runtime ('net.sourceforge.jtds:jtds:1.2.5')	{ export:false }
    }
	plugins {
		compile ':spring-security-core:1.1.3'	// 1.1.3	1.1.3
		compile ':audit-trail:1.2'				// 1.2		1.2
	}
}
