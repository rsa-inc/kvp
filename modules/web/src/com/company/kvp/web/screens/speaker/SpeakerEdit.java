package com.company.kvp.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvp.entity.Speaker;

@UiController("kvp_Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
@LoadDataBeforeShow
public class SpeakerEdit extends StandardEditor<Speaker> {
}