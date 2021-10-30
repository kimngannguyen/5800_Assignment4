
CREATE TABLE Users (
                userID INTEGER DEFAULT NULL NOT NULL,
                name VARCHAR(40) NOT NULL,
                CONSTRAINT id PRIMARY KEY (userID)
);


CREATE TABLE Comments (
                ID INTEGER NOT NULL,
                id_user INTEGER DEFAULT NULL NOT NULL,
                text VARCHAR(400) NOT NULL,
                CONSTRAINT comments_id PRIMARY KEY (ID, id_user)
);


ALTER TABLE Comments ADD CONSTRAINT users_comments_fk
FOREIGN KEY (id_user)
REFERENCES Users (userID)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
