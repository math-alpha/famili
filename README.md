# Famili

Multi-tenant SaaS platform for alumni, community and diaspora organizations.

## Tech Stack

- React
- Spring Boot
- PostgreSQL
- Redis
- Docker
- Nginx

## Architecture

Modular Monolith

Database per Tenant

Event Driven

DDD

## Configuration & Secrets

Configuration uses 12-factor/environment variables by default. Key points:

- Runtime config (DB URL, credentials, JWT secrets) is read from environment variables.
- Development: copy backend/.env.example -> backend/.env and don't commit it. .env is ignored by git.
- Production: inject secrets from a secrets manager (Vault, AWS Secrets Manager, or GitHub Actions secrets) or via your platform's env config.
- The project includes a typed AppConfig (com.famili.config.AppConfig) to centralize application settings.

Optional integrations: add Spring Cloud Vault or a cloud secrets provider if you need automated secret rotation.
