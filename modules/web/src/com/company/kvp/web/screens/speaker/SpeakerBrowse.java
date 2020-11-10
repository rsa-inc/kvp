package com.company.kvp.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvp.entity.Speaker;

@UiController("kvp_Speaker.browse")
@UiDescriptor("speaker-browse.xml")
@LookupComponent("speakersTable")
@LoadDataBeforeShow
public class SpeakerBrowse extends StandardLookup<Speaker> {
}