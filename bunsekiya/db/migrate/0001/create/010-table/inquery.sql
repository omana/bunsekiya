create table INQUERY (
    INQUERY_ID int not null,
    INQUERY_DATE varchar(255),
    NAME_KANJI varchar(255),
    NAME_KANA varchar(255),
    COMPANY varchar(255),
    DIVISION varchar(255),
    ADDRESS text,
    INQUERY_KIND varchar(255),
    INQUERY_TEXT text,
    DEAD_FLG int,
    constraint INQUERY_PK primary key(INQUERY_ID)
);
