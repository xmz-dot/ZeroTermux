package com.tarmux.zerocore.config.mainmenu.config

import com.tarmux.R
import com.tarmux.zerocore.editor.EditorHelloProjectType

class CreateJavaProjectClickConfig : CreateEditorProjectClickConfig(
    EditorHelloProjectType.JAVA,
    R.drawable.ic_project_java,
    R.string.menu_create_project_java
)
