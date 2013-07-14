create table TBL_RES (
    THREAD_ID int not null,
    RES_ID int not null,
    R_DATE varchar(255) not null,
    R_WRITER varchar(255) not null,
    R_ADDRESS varchar(255) not null,
    R_CONTEXT text not null,
    R_ALLOW_FLG smallint,
    constraint TBL_RES_PK primary key(THREAD_ID, RES_ID)
);
