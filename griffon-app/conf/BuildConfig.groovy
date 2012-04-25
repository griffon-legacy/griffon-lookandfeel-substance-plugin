griffon.project.dependency.resolution = {
    inherits("global")
    log "warn"
    repositories {
        griffonHome()
        mavenCentral()
    }
    dependencies {
        String substanceVersion = '7.1'
        compile("com.github.insubstantial:substance:$substanceVersion",
                "com.github.insubstantial:laf-widget:$substanceVersion",
                "com.github.insubstantial:laf-plugin:$substanceVersion",
                "com.github.insubstantial:substance-swingx:$substanceVersion",
                "com.github.insubstantial:substance-flamingo:$substanceVersion",
                "com.github.insubstantial:trident:$substanceVersion") {
            transitive = false
        }
    }
}

griffon {
    doc {
        logo = '<a href="http://griffon.codehaus.org" target="_blank"><img alt="The Griffon Framework" src="../img/griffon.png" border="0"/></a>'
        sponsorLogo = "<br/>"
        footer = "<br/><br/>Made with Griffon (@griffon.version@)"
    }
}

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}
