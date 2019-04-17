package com.bihe0832.android.gradle;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class StartCheckAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showMessageDialog("Hello, zixie !", "blog.bihe0832.com", Messages.getInformationIcon());
    }
}
