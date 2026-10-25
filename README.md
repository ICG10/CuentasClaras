# CuentasClaras

REST API for shared group expenses (Splitwise-style) and personal finance tracking.

> 🚧 Work in progress. v1.0 planned for January 2027.

## What it does
- Groups, members and shared expenses (equal, percentage and exact splits)
- Member balances and simplified debts
- Settlements between members
- JWT authentication with group-level access rules
- Personal income/expense tracking with categories and monthly summary

## Tech stack
Java 21 · Spring Boot · Spring Data JPA · PostgreSQL 16 · Flyway · Spring Security (JWT) ·
JUnit 5 · Mockito · Testcontainers · Docker Compose · GitHub Actions

## Roadmap
| Phase | Scope | Tag |
|---|---|---|
| 1 | Users, groups, members, equal-split expenses | v0.1 |
| 2 | Balances and simplified debts | v0.2 |
| 3 | JWT security and group access rules | v0.3 |
| 4 | Settlements, percentage and exact splits | v0.4 |
| 5 | Personal finances and monthly summary | v0.5 |
| 6 | Integration tests, Docker, CI, docs | v1.0 |

## Running locally
_Coming soon: `docker compose up`._