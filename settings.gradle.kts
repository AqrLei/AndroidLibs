include(":app")

includeModules(arrayOf("BannerView","WidgetCollection","Guide"), "librarys")

includeModules(arrayOf("LogHelper","UtilCollection","Cache","Permission","Net","ImageHandler"), "librarys")

rootProject.buildFileName = "build.gradle.kts"

fun includeModule(name: String, path: String) {
    val moduleName = ":$name"
    include(name)
    project(moduleName).projectDir = file("$path/$name")
}

fun includeModules(names: Array<String>, path: String) {
    for (name in names) {
        includeModule(name, path)
    }
}
