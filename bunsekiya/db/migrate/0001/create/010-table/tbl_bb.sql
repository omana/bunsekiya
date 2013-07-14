create table TBL_BB (
    THREAD_ID int not null,
    T_CAT varchar(255) not null,
    T_TITLE varchar(255) not null,
    T_DATE varchar(255) not null,
    T_ADMIN_FLG smallint,
    constraint TBL_BB_PK primary key(THREAD_ID)
);
