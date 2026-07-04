package com.tarmux.zerocore.config.mainmenu.config

import com.tarmux.R
import com.tarmux.zerocore.editor.EditorHelloProjectType

class CreateNpmProjectClickConfig : CreateEditorProjectClickConfig(
    EditorHelloProjectType.NPM,
    R.drawable.ic_project_npm,
    R.string.menu_create_project_npm
)
