create table playagainst {
  id serial primary key,
  team1_id int,
  team2_id int,
  datetime timestamp,
  stadium varchar(200)
}