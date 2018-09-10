create table if not exists team (
  id   serial primary key,
  name varchar(255) not null
);

create table if not exists tournament (
  id         serial primary key,
  name       varchar(255) not null,
  type       varchar(255) not null,
  season     varchar(255) not null,
  start_time timestamptz,
  end_time   timestamptz
);

create table if not exists event (
  id            serial primary key,
  name          varchar(255) not null,
  home_team_id  integer      not null references team,
  away_team_id  integer      not null references team,
  start_time    timestamptz,
  tournament_id integer      not null references tournament,
  round         integer,
  status        varchar(32)  not null
);

create table if not exists event_result (
  event_id        integer primary key references event,
  home_team_score integer     not null,
  away_team_score integer     not null,
  creation_time   timestamptz not null
);

create table if not exists user_player (
  id         serial primary key,
  login      varchar(255),
  email      varchar(255),
  first_name varchar(255),
  last_name  varchar(255)
);

create table if not exists prediction (
  id              serial primary key,
  user_player_id       integer     not null references user_player (id),
  event_id        integer     not null references event (id),
  home_team_score integer     not null,
  away_team_score integer     not null,
  creation_time   timestamptz not null
);