CREATE KEYSPACE IF NOT EXISTS product_keyspace
WITH replication = {'class':'SimpleStrategy', 'replication_factor':'2'}
AND durable_writes = TRUE;

CREATE TABLE IF NOT EXISTS product_keyspace.product (
id timeuuid,
description text,
price decimal,
imageUrl text,
PRIMARY KEY (id));