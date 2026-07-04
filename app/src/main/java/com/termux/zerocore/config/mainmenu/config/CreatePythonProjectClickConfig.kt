package com.tarmux.zerocore.config.mainmenu.config

import com.tarmux.R
import com.tarmux.zerocore.editor.EditorHelloProjectType

class CreatePythonProjectClickConfig : CreateEditorProjectClickConfig(
    EditorHelloProjectType.PYTHON,
    R.drawable.ic_project_python,
    R.string.menu_create_project_python
)
