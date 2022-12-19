create table player {
   id_player  serial primary key,
   name varchar(500),
   number int,
   id_team int references team(id_team)
}