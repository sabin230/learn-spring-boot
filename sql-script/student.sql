DROP TABLE IF EXISTS "student";

CREATE TABLE "student" (
  "id" SERIAL PRIMARY KEY,
  "first_name" varchar(45) DEFAULT NULL,
  "last_name" varchar(45) DEFAULT NULL,
  "email" varchar(45) DEFAULT NULL
);