CREATE TABLE user (
  id          INT         NOT NULL AUTO_INCREMENT,
  name        VARCHAR(50) NOT NULL,
  designation VARCHAR(15) NOT NULL,
  address     VARCHAR(50) NOT NULL,
  city        VARCHAR(20) NOT NULL,
  state       VARCHAR(20) NOT NULL,
  country     VARCHAR(20) NOT NULL,
  pincode     INT         NOT NULL,
  phone       INT         NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE account_details (
  account_id INT NOT NULL AUTO_INCREMENT,
  user_id    INT NOT NULL,
  PRIMARY KEY (account_id),
  FOREIGN KEY (user_id) REFERENCES user (id)
    ON UPDATE CASCADE
);

CREATE TABLE transaction (
  id                INT         NOT NULL AUTO_INCREMENT,
  payer_id          INT         NOT NULL,
  payee_id          INT         NOT NULL,
  amount            DECIMAL     NOT NULL,
  transaction_type  VARCHAR(20) NOT NULL,
  description       VARCHAR(255),
  status            VARCHAR(20) NOT NULL,
  timestamp_created TIMESTAMP   NOT NULL,
  timestamp_updated TIMESTAMP   NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (payer_id) REFERENCES account (id)
    ON UPDATE CASCADE,
  FOREIGN KEY (payee_id) REFERENCES account (id)
    ON UPDATE CASCADE
);

CREATE TABLE beneficiary (
  id             INT NOT NULL AUTO_INCREMENT,
  account_id     INT NOT NULL,
  beneficiary_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (payer_id) REFERENCES account (id)
    ON UPDATE CASCADE,
  FOREIGN KEY (payee_id) REFERENCES account (id)
    ON UPDATE CASCADE
);



