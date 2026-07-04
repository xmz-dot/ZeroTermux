package com.termux.ai.zerocore.config.mainmenu.config

import com.termux.ai.R
import com.termux.ai.zerocore.editor.EditorHelloProjectType

class CreateCProjectClickConfig : CreateEditorProjectClickConfig(
    EditorHelloProjectType.C,
    R.drawable.ic_project_c,
    R.string.menu_create_project_c
)
