CREATE TABLESPACE ts01
OWNER postgres
LOCATION '/tablespace/data';

CREATE TABLESPACE tsi01
OWNER postgres
LOCATION '/tablespace/index';

CREATE EXTENSION IF NOT EXISTS pgcrypto;

select pg_reload_conf();