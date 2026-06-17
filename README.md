# Wells Fargo Task 2 – Portfolio Management Data Model

## Overview

This project implements a data model for a portfolio management system used by financial advisors to manage customer investment portfolios. The model is implemented using Spring Boot and JPA entities.

## Entities

### Advisor

Represents a financial advisor responsible for managing client relationships.

Attributes:

* advisorId
* firstName
* lastName
* address
* phone
* email

### Client

Represents a customer whose investments are managed by an advisor.

Attributes:

* clientId
* firstName
* lastName
* email
* phone

### Portfolio

Represents a collection of investments owned by a client.

Attributes:

* portfolioId
* portfolioName
* client

Relationship:

* Many portfolios can belong to one client.

### Account

Represents an investment account within a portfolio.

Attributes:

* accountId
* accountNumber
* balance
* portfolio

Relationship:

* Many accounts can belong to one portfolio.

### Security

Represents a tradable financial asset.

Attributes:

* securityId
* ticker
* name
* currentPrice

### Holding

Represents ownership of a security within a portfolio.

Attributes:

* holdingId
* portfolio
* security
* quantity

Relationships:

* Many holdings belong to one portfolio.
* Many holdings can reference one security.

### Transaction

Represents a buy or sell operation performed on a security.

Attributes:

* transactionId
* account
* security
* transactionType
* quantity

Relationships:

* Many transactions belong to one account.
* Many transactions can reference one security.

## Entity Relationship Summary

Advisor

* Manages clients

Client

* Owns portfolios

Portfolio

* Contains accounts
* Contains holdings

Account

* Records transactions

Security

* Appears in holdings
* Appears in transactions

## Technologies Used

* Java
* Spring Boot
* Jakarta Persistence API (JPA)
* Maven

## Author

Arya Jain

Created as part of the Wells Fargo Software Engineering Virtual Experience Program.
