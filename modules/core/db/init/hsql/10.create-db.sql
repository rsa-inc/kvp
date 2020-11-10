-- begin KVP_SESSION
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
    START_DATE timestamp,
    SPEAKER_ID varchar(36) not null,
    DURATION integer not null,
    DESCRIPTION varchar(2000),
    --
    primary key (ID)
)^
-- end KVP_SESSION
-- begin KVP_SPEAKER
create table KVP_SPEAKER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255),
    EMAIL varchar(1024),
    --
    primary key (ID)
)^
-- end KVP_SPEAKER
