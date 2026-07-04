package com.termux.ai.ai.zerocore.config.mainmenu.config

import com.termux.ai.ai.R
import com.termux.ai.ai.zerocore.editor.EditorHelloProjectType

class CreatePythonProjectClickConfig : CreateEditorProjectClickConfig(
    EditorHelloProjectType.PYTHON,
    R.drawable.ic_project_python,
    R.string.menu_create_project_python
)
