package com.github.desertfoxnv.virtualfolderfolding.services

import com.intellij.openapi.project.Project
import com.github.desertfoxnv.virtualfolderfolding.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
