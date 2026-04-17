# 🚀 CI/CD Governance Pipeline with Jenkins + Spring Boot

Projeto prático focado em CI/CD moderno, automação de deploy, governança de mudanças e boas práticas DevOps.

Este repositório demonstra como construir um pipeline profissional usando:

- Jenkins
- Docker
- Spring Boot
- Maven
- Pipeline as Code
- Evidências de deploy
- Roadmap evolutivo para DevSecOps e Kubernetes

---

## 🎯 Objetivo

Simular um ambiente corporativo real onde o processo de entrega de software exige:

- Build automatizado
- Testes automatizados
- Deploy contínuo
- Rastreabilidade
- Evidência de execução
- Qualidade e confiabilidade

---

## 🏗️ Arquitetura

```text
GitHub Repository
       ↓
    Jenkins
       ↓
 Build + Test
       ↓
 Docker Build
       ↓
 Container Deploy
       ↓
 Health Check
       ↓
 Evidence JSON

```

## 📂 Estrutura do Projeto

```console
ci-cd-governance-pipeline/
│
├── README.md
├── Jenkinsfile
├── docker-compose.yml
├── Dockerfile
├── plugins.txt
├── casc.yaml
│
├── docs/
│   ├── roadmap.md
│   ├── pipeline-stages.md
│   ├── local-setup.md
│   ├── governance.md
│   └── future-evolution.md
│
└── app/
    └── springboot-service
```

## 🚀 Como Executar

1. Subir Jenkins

```bash
docker compose up -d --build
```

Acessar:

```console
http://localhost:8080
```

Usuário:

```console
admin
```

Senha:

```console
admin123
```

2. Criar Pipeline no Jenkins

```console
New Item
Pipeline
Pipeline script from SCM
Apontar para este repositório
```

3. Executar Pipeline

O Jenkins irá:

```console
Checkout do código
Build Maven
Testes
Build Docker
Subir aplicação
Validar /health
Gerar evidence.json
```

## 📄 Documentação Complementar

Para manter este README limpo, detalhes adicionais estão separados:

- [📌 Roadmap do Projeto](./docs/roadmap.md)
- [⚙️ Etapas do Pipeline](./docs/pipeline-stages.md)
- [🖥️ Setup Local](./docs/local-setup.md)
- [🛡️ Governança e Evidências](./docs/governance.md)
- [🚀 Próximas Evoluções](./docs/future-evolution.md)

## 🔥 Diferenciais Técnicos

- Jenkins provisionado via Docker
- Plugins instalados automaticamente
- Jenkins Configuration as Code
- Pipeline declarativo
- Build reproduzível
- Deploy automatizado
- Health check real
- Evidência de auditoria

## 📈 Roadmap Futuro

- SonarQube
- Trivy Security Scan
- GitHub Actions Trigger
- Docker Hub Push
- Kubernetes Deploy
- ArgoCD GitOps
- Métricas DORA


## ✍️ Artigo no Medium

Este projeto servirá como base para artigo técnico demonstrando:

Como construir um pipeline CI/CD profissional com Jenkins e Spring Boot