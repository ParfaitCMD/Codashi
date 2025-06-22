# 🌟 Codashi – Plataforma Colaborativa de Microprojetos de Programação

Codashi é uma plataforma voltada para o desenvolvimento criativo de micro e mini projetos de programação. Com foco em **aprendizado rápido**, **colaboração** e **impacto com poucas linhas de código**, ela estimula programadores a construírem juntos, de forma leve e divertida.

---

## 🚀 Visão Geral

- Ciclos curtos e interativos incentivam a contribuição constante
- Rankings baseados em impacto, criatividade e inovação
- Desafios temáticos com tempo limitado aumentam o engajamento
- Perfis personalizados e badges por conquistas

---

## 🔧 Tecnologias Utilizadas

| Camada         | Ferramenta / Linguagem                        |
|----------------|-----------------------------------------------|
| **Backend**    | Java 17 + Spring Boot                         |
| **Frontend**   | HTML, CSS, JavaScript (Puro / Alpine.js / Futuro uso de React) |
| **Banco**      | MySQL (gerenciado via (a decidir) - futuramente outro) |
| **IDE**        | Visual Studio Code (VSCode)                   |
| **Autenticação**| JWT com senhas criptografadas (BCrypt)       |
| **Hospedagem** | Render (backend) + (frontend)                 |
| **Versionamento** | Git + GitHub [Repositório Oficial](https://github.com/ParfaitCMD/Codashi) |

---

## 🏗 Arquitetura do Sistema

- Separação clara entre frontend e backend via REST API  
- Requisições autenticadas com JWT

---

## 🔐 Sistema de Autenticação

- Registro/Login com senhas criptografadas (BCrypt)
- Geração de token JWT após login
- Tokens enviados em `Authorization Header` para acesso seguro às rotas protegidas

---

## 💡 Base de Ideias – Inteligência Coletiva da Comunidade

A **Base de Ideias** é um espaço criativo onde a comunidade pode:

- Explorar e votar em ideias por categoria
- Comentar e sugerir melhorias
- Criar projetos diretamente a partir das ideias mais votadas

Essa funcionalidade fortalece a **inteligência coletiva** e incentiva a criação de projetos relevantes.

