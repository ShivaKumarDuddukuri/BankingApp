CREATE TABLE user (
  user_id  INT         NOT NULL AUTO_INCREMENT,
  name     VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  email    VARCHAR(50) NOT NULL,
  dob      TIMESTAMP   NOT NULL,
  city     VARCHAR(20) NOT NULL,
  state    VARCHAR(20) NOT NULL,
  country  VARCHAR(20) NOT NULL,
  pincode  INT         NOT NULL,
  phone    VARCHAR(20)         NOT NULL,
  PRIMARY KEY (user_id)
);

CREATE TABLE account_details (
  account_id    INT         NOT NULL AUTO_INCREMENT,
  user_id       INT         NOT NULL,
  balance       DECIMAL     NOT NULL,
  currency_type INT NOT NULL,
  PRIMARY KEY (account_id),
  FOREIGN KEY (user_id) REFERENCES user (user_id)
    ON UPDATE CASCADE
);


CREATE TABLE transaction_details (
  transaction_id   INT         NOT NULL AUTO_INCREMENT,
  payer_id         INT         NOT NULL,
  payee_id         INT         NOT NULL,
  amount           DECIMAL     NOT NULL,
  transaction_type INT  NOT NULL,
  description      VARCHAR(255),
  status           VARCHAR(20) NOT NULL,
  createdAt        DATE   ,
  updatedAt        DATE   ,
  PRIMARY KEY (transaction_id),
  FOREIGN KEY (payer_id) REFERENCES account_details (account_id)
    ON UPDATE CASCADE,
  FOREIGN KEY (payee_id) REFERENCES account_details (account_id)
    ON UPDATE CASCADE
);


CREATE TABLE beneficiary (
  account_id     INT NOT NULL,
  beneficiary_id INT NOT NULL,
  FOREIGN KEY (account_id) REFERENCES account_details (account_id)
    ON UPDATE CASCADE,
  FOREIGN KEY (beneficiary_id) REFERENCES account_details (account_id)
    ON UPDATE CASCADE
);



