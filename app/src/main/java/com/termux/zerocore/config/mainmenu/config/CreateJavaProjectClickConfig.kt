package com.termux.ai.zerocore.config.mainmenu.config

import com.termux.ai.R
import com.termux.ai.zerocore.editor.EditorHelloProjectType

class CreateJavaProjectClickConfig : CreateEditorProjectClickConfig(
    EditorHelloProjectType.JAVA,
    R.drawable.ic_project_java,
    R.string.menu_create_project_java
)
