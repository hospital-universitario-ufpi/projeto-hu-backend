# projeto-hu

Sistema de gestão hospitalar - Backend

## 🚨 SEGURANÇA - LEIA ANTES DE USAR

**ATENÇÃO:** Este sistema foi recentemente auditado e várias vulnerabilidades críticas de segurança foram corrigidas. Antes de usar em produção, consulte o arquivo [SECURITY.md](SECURITY.md) para configurações essenciais de segurança.

### Configurações Críticas Necessárias

1. **Altere o JWT Secret** - O valor atual é apenas para desenvolvimento
2. **Configure variáveis de ambiente** - Não use credenciais hardcoded em produção
3. **Ative HTTPS** - Necessário para cookies seguros
4. **Configure rate limiting** - Para prevenir ataques de força bruta

## 🚀 Setup

### Banco de Dados
Comando para criar o banco de dados MySQL:
```bash
docker run -d --name mysql_hu \
  -e MYSQL_ROOT_PASSWORD=admin \
  -e MYSQL_USER=admin \
  -e MYSQL_PASSWORD=admin \
  -e MYSQL_DATABASE=db \
  -p 3306:3306 \
  mysql:8.0
```

### Configuração da Aplicação
1. Copie o arquivo `.env.example` para `.env`
2. Configure as variáveis de ambiente necessárias
3. **IMPORTANTE:** Altere o JWT_SECRET para um valor forte e aleatório

### Execução
```bash
cd backend
./gradlew bootRun
```

## 📚 Documentação

- **API Documentation:** http://localhost:8095/swagger-ui.html
- **Security Guide:** [SECURITY.md](SECURITY.md)
- **Health Check:** http://localhost:8095/actuator/health

## 🛡️ Segurança

Este sistema lida com dados médicos sensíveis. Sempre siga as políticas de segurança da sua organização e regulamentações aplicáveis (LGPD, HIPAA, etc.).

Para detalhes completos de segurança, consulte [SECURITY.md](SECURITY.md).
