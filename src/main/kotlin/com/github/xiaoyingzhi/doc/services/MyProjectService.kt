package com.github.xiaoyingzhi.doc.services

import com.intellij.openapi.project.Project
import com.github.xiaoyingzhi.doc.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
