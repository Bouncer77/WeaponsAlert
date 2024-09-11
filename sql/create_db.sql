--
SELECT pg_terminate_backend(pid) FROM pg_stat_activity WHERE datname = 'db_weapons_alert';
REVOKE CONNECT ON DATABASE db_weapons_alert FROM postgres;

DROP DATABASE IF EXISTS db_weapons_alert;
DROP ROLE IF EXISTS weapons_alert_ta;

CREATE USER weapons_alert_ta WITH PASSWORD '<CHANGEME>' NOCREATEDB NOCREATEROLE NOSUPERUSER;
CREATE DATABASE db_weapons_alert WITH OWNER=weapons_alert_ta ENCODING='UTF8' LC_COLLATE='ru_RU.utf8' LC_CTYPE='ru_RU.utf8' TEMPLATE='template0' CONNECTION LIMIT = -1;
COMMENT ON DATABASE db_weapons_alert IS 'База данных Реестр оружия';


