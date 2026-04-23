# DevOps Governance Platform

Plataforma de CI/CD com governança de mudanças, deploy automatizado e geração de evidências auditáveis.

## 🎯 Objetivo

Simular um ambiente corporativo moderno onde pipelines de entrega contínua respeitam regras de governança antes da implantação em produção.

Esta plataforma centraliza automação operacional, integração entre serviços e documentação técnica.

---

## 🧩 Ecossistema Integrado

### Repositórios relacionados

- change-governance-service  
API responsável pelo workflow de mudanças, aprovações e auditoria.

- payment-service  
Aplicação de negócio utilizada como alvo de build e deploy automatizado.

---

## 🚀 Fluxo Operacional

1. Solicitação de mudança  
2. Aprovação gerencial  
3. Commit no GitHub  
4. Pipeline Jenkins iniciada  
5. Validação da aprovação  
6. Build + Testes  
7. Deploy automatizado  
8. Health Check  
9. Atualização para DEPLOYED  
10. Geração de evidence.json

---

## 🛠️ Stack Tecnológica

- Jenkins
- Docker
- GitHub
- Spring Boot
- Maven
- Shell Script

### Roadmap

- PostgreSQL
- Prometheus
- Grafana
- Kubernetes
- Terraform
- ArgoCD

---

## 📁 Estrutura do Repositório

```text
jenkins/      Pipelines e templates
docker/       Ambiente local
scripts/      Automação operacional
docs/         Arquitetura e processos
config/       Variáveis e mapeamentos
```

## 📚 Documentação

Consulte a pasta /docs para detalhes de arquitetura, fluxo operacional e roadmap evolutivo.

## 🧠 Conceitos Aplicados

```text
CI/CD Governance
Change Management
Audit Trail
Deployment Safety Gates
Platform Engineering
Reusable Pipelines
```