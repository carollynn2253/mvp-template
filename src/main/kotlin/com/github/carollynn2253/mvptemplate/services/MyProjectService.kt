package com.github.carollynn2253.mvptemplate.services

import com.intellij.openapi.project.Project
import com.github.carollynn2253.mvptemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
