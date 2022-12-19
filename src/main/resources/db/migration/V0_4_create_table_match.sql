create table playagainst {
  id_team int,
  id_player int,
  datetime timestamp,
  stadium varchar(200),
  primary key(id_player,id_team)
}