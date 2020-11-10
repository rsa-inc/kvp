create table KVP_SESSION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TOPIC varchar(255) not null,
    START_DATE timestamp,
    END_DATE timestamp,
    SPEAKER_ID varchar(36) not null,
    DURATION integer not null,
    DESCRIPTION varchar(2000),
    --
    primary key (ID)
);