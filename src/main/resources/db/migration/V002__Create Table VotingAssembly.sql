create table ntconsult.voting_assembly(
id bigint not null auto_increment,
id_user bigint not null,
vote varchar(1) not null,
assembly_date timestamp(6) not null,

primary key (id)
);