grails.project.class.dir = 'target/classes'
grails.project.test.class.dir = 'target/test-classes'
grails.project.test.reports.dir = 'target/test-reports'
grails.project.docs.output.dir = 'docs/manual' // for backwards-compatibility, the docs are checked into gh-pages branch

grails.project.dependency.resolution = {

    inherits('global')

    log 'warn'

    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        runtime('org.apache.solr:solr-solrj:3.4.0')
    }

    plugins {
        // grails plugins
        runtime(":hibernate:${grailsVersion}", ":tomcat:${grailsVersion}")
    }
}
