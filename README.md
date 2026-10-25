# CuentasClaras

API REST para gestionar gastos compartidos en grupo (tipo Splitwise) y llevar las cuentas personales de cada usuario.

> ?? En desarrollo. Versi車n 1.0 prevista para enero de 2027.

## Qu谷 hace
- Grupos, miembros y gastos compartidos (reparto a partes iguales, por porcentajes o por importes)
- Balance de cada miembro y deudas simplificadas
- Liquidaciones entre miembros
- Autenticaci車n con JWT y reglas de acceso por grupo
- Ingresos y gastos personales con categor赤as y resumen mensual

## Tecnolog赤as
Java 21 ﹞ Spring Boot ﹞ Spring Data JPA ﹞ PostgreSQL 16 ﹞ Flyway ﹞ Spring Security (JWT) ﹞
JUnit 5 ﹞ Mockito ﹞ Testcontainers ﹞ Docker Compose ﹞ GitHub Actions

## Hoja de ruta
| Fase | Alcance | Etiqueta |
|---|---|---|
| 1 | Usuarios, grupos, miembros y gastos a partes iguales | v0.1 |
| 2 | Balances y deudas simplificadas | v0.2 |
| 3 | Seguridad con JWT y acceso por grupo | v0.3 |
| 4 | Liquidaciones y repartos por porcentajes e importes | v0.4 |
| 5 | Cuentas personales y resumen mensual | v0.5 |
| 6 | Tests de integraci車n, Docker, CI y documentaci車n | v1.0 |

## Ejecuci車n en local
_Pr車ximamente: `docker compose up`._