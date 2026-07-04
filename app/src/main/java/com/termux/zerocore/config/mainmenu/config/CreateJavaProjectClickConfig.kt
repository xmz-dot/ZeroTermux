package com.termux.ai.ai.zerocore.config.mainmenu.config

import com.termux.ai.ai.R
import com.termux.ai.ai.zerocore.editor.EditorHelloProjectType

class CreateJavaProjectClickConfig : CreateEditorProjectClickConfig(
    EditorHelloProjectType.JAVA,
    R.drawable.ic_project_java,
    R.string.menu_create_project_java
)
