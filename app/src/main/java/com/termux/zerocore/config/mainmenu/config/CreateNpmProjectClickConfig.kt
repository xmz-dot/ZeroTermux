package com.termux.ai.zerocore.config.mainmenu.config

import com.termux.ai.R
import com.termux.ai.zerocore.editor.EditorHelloProjectType

class CreateNpmProjectClickConfig : CreateEditorProjectClickConfig(
    EditorHelloProjectType.NPM,
    R.drawable.ic_project_npm,
    R.string.menu_create_project_npm
)
