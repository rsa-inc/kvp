package com.company.kvp.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvp.entity.Session;

@UiController("kvp_Session.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {
}