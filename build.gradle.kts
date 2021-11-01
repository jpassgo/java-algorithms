
plugins {
    'org.springframework.boot'
    'io.spring.dependency-management'
    'com.diffplug.gradle.spotless'
    'java'
}

project.group = 'com.jpassgo'
project.version = '1.0.1'
project.sourceCompatibility = '11'

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("com.google.googlejavaformat:google-java-format:1.10.0")
    compileOnly("org.projectlombok:lombok")
    compile("com.google.googlejavaformat:google-java-format:1.6")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.2.2.RELEASE") {
        exclude group: 'junit'
        exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
    }

    testImplementation('org.junit.jupiter:junit-jupiter-api:5.5.2')
    testImplementation('org.junit.jupiter:junit-jupiter-engine:5.5.2')
    testImplementation('org.junit.jupiter:junit-jupiter-params:5.5.2')
}

test {
    useJUnitPlatform()
}

repositories {
    mavenCentral()
}

spotless {
    java {
        googleJavaFormat()
    }
}