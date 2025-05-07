# 📧 Microsserviços: User e Email

Este projeto é uma aplicação de estudo baseada no vídeo da Michelli Brito sobre microsserviços. A aplicação consiste em dois microsserviços, **User** e **Email**, que trabalham juntos para cadastrar usuários e enviar e-mails de forma assíncrona utilizando filas do RabbitMQ.

---

## 🛠️ Tecnologias Utilizadas

- **Java + Spring Framework**:
  - Spring Boot
  - Spring Web
  - Spring Data JPA
  - Spring Validator
  - Spring AMQP
  - Spring Mail
- **RabbitMQ** para comunicação assíncrona entre os microsserviços.
- **SMTP** para envio de e-mails.
- Banco de dados relacional (PostgreSQL).
- Docker (opcional, para o RabbitMQ ou banco de dados).

---

## 🏗️ Arquitetura da Aplicação

A aplicação é composta por dois microsserviços principais:

### **1. User Service**
- Permite o cadastro de usuários.
- Após cadastrar um usuário no banco de dados, dispara um evento para uma fila no **RabbitMQ**.

### **2. Email Service**
- Consome as mensagens da fila **RabbitMQ**.
- Realiza o envio de e-mails utilizando o protocolo **SMTP**.

---

## ⚙️ Funcionalidades

### **User Service**
- Cadastro de usuários com validação de dados.
- Integração com RabbitMQ para envio de mensagens.

### **Email Service**
- Consumo de mensagens enviadas pelo **User Service**.
- Envio de e-mails utilizando configuração **SMTP**.

---
