create table team {
   id_player  serial primary key,
   name varchar(500),
   id_player int references player(id_player),
   id_sponsor int references sponsor(id_sponsor)
}