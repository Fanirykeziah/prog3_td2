create table sponsor {
   id_player  serial primary key,
   name varchar(500),
   id_team int references team(id_team)
}