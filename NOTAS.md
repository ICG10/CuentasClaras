# NOTAS

- 2026-10-25: repo creado. Siguiente: generar proyecto en Spring Initializr (S1 D1).
- 2026-10-25: proyecto generado con Initializr (Boot 4.1.x, Java 21). Siguiente (S1 D1): docker-compose.yml con PostgreSQL 16 y application.yml; arrancar la app.
- 2026-10-25: PostgreSQL 16 en Docker (puerto 5433, el 5432 lo ocupa un PostgreSQL local) y app arrancando. Siguiente (S1 D1): migración Flyway V1 con users, expense_groups y group_members.
- 2026-10-26 (S1 D1): migración V1 aplicada por Flyway; módulo user con POST /users (email normalizado a minúsculas, validación con Bean Validation); módulo group con entidades ExpenseGroup y GroupMember y POST /groups (creador como OWNER en la misma transacción). Pendiente: confirmar POST /groups con un usuario existente; UserNotFoundException y email duplicado dan 500, pasar a 404/409 con ProblemDetail. Siguiente (S1 D2): GET /groups/{id} con miembros y POST /groups/{id}/members.
- 