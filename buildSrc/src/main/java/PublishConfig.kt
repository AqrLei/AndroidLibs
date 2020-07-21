/**
 * created by AqrLei on 2020/6/10
 */
object PublishConfig {
    const val repoUserName = "admin"
    const val repoPassword = "Aqr123456"

    const val nexusReleaseUrl = "http://localhost:8081/repository/android-lib-release/"

    const val groupId = "com.aqrlei.lib"
    const val websiteUrl = "https://github.com/AqrLei/"

    const val licenseName = "The Apache Software License, Version 2.0"
    const val licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0.txt"

    val defaultDeveloper = DeveloperEntity.default()
}

object LibKey {
    const val artifactIdKey = "artifactId"
    const val versionKey = "version"
    const val descKey = "desc"

    const val developerKey = "developer"
}

object Libs {
    val bannerView = PublishEntity("bannerview", "1.0.0-beta03", "BannerView of Android's ui widget")

    val logHelper = PublishEntity("loghelper", "1.0.0-beta02", "Log util ")

    val widgets = PublishEntity("widget-collection","1.0.0-alpha02","widget collection")

    val utils = PublishEntity("util-collection","1.0.0-alpha02","util collection")

    val guide = PublishEntity("guide","1.0.0-alpha01","guide manager")

    val cache = PublishEntity("cache","1.0.0-alpha01","cache")

    val imagehandler = PublishEntity("image-handler","1.0.0-alpha01","image-handler")

    val net = PublishEntity("net","1.0.0-alpha01","net")

    val permission = PublishEntity("permission","1.0.0-alpha01","permission")

}

data class PublishEntity(
    val artifactId: String,
    val version: String,
    val desc: String,
    val developer: DeveloperEntity = DeveloperEntity.default()) {
    override fun toString(): String {
        return "${PublishConfig.groupId}:$artifactId:$version"
    }
}

data class DeveloperEntity(val id: String, val name: String, val email: String) {
    companion object {
        fun default() = DeveloperEntity("aqrlei", "AqrLei", "aqrdeveloper@gmail.com")
    }
}