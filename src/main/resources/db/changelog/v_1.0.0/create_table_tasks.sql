CREATE TABLE if NOT EXISTS tasks(
    id bigserial primary key,
    type VARCHAR(255),
    content bytea NULL,
    time_stamp DATE
);