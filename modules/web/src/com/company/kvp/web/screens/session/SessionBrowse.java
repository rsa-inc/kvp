package com.company.kvp.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvp.entity.Session;

@UiController("kvp_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {
}