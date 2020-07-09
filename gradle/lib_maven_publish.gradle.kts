apply(plugin = "maven-publish")


fun getLibArtifactId(): String {
    return if (extra.has(LibKey.artifactIdKey)) extra.get(LibKey.artifactIdKey).toString()
    else project.name
}

fun getLibVersion(): String {
    return if (extra.has(LibKey.versionKey)) extra.get(LibKey.versionKey).toString()
    else project.version.toString()
}

fun getLibDesc(): String {
    return if (extra.has(LibKey.descKey)) extra.get(LibKey.descKey).toString()
    else project.name
}

fun getLibDeveloper(): DeveloperEntity {
    return if (extra.has(LibKey.developerKey)) extra.get(LibKey.developerKey) as? DeveloperEntity
        ?: PublishConfig.defaultDeveloper
    else PublishConfig.defaultDeveloper
}

afterEvaluate {
    val libArtifactId = getLibArtifactId()
    val libVersion = getLibVersion()
    val libDesc = getLibDesc()
    val developer = getLibDeveloper()
    configure<PublishingExtension> {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = PublishConfig.groupId
                artifactId = libArtifactId
                version = libVersion
                pom {
                    name.set(libArtifactId)
                    description.set(libDesc)
                    url.set(PublishConfig.websiteUrl)
                    licenses {
                        license {
                            name.set(PublishConfig.licenseName)
                            url.set(PublishConfig.licenseUrl)
                        }
                    }
                    developers {
                        developer {
                            id.set(developer.id)
                            name.set(developer.name)
                            email.set(developer.email)
                        }
                    }
                }
            }
        }
        repositories {
            maven {
                url = uri(PublishConfig.nexusReleaseUrl)
                credentials {
                    username = PublishConfig.repoUserName
                    password = PublishConfig.repoPassword
                }
            }
        }
    }
}