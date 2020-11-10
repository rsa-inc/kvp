alter table KVP_SESSION add constraint FK_KVP_SESSION_ON_SPEAKER foreign key (SPEAKER_ID) references KVP_SPEAKER(ID);
create index IDX_KVP_SESSION_ON_SPEAKER on KVP_SESSION (SPEAKER_ID);
