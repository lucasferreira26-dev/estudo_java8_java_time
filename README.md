# 📅 Java 8 - Nova API de Datas (java.time)

Este repositório contém uma série de exercícios práticos desenvolvidos com base no **Capítulo 10 - Nova API de Datas** do Java 8.  
O objetivo foi aplicar conceitos da API `java.time` em cenários próximos do mundo real, utilizando **Programação Orientada a Objetos (POO)** e **boas práticas de lógica**.

---

## 🚀 Objetivos do Projeto

- Explorar a API `java.time` de forma prática
- Trabalhar com diferentes tipos de datas e horários
- Aplicar regras de negócio reais (dias úteis, fusos horários, cálculos de tempo)
- Reforçar conceitos de POO
- Melhorar a organização e legibilidade do código

---

## 🧠 Conceitos Utilizados

- `LocalDate`
- `LocalTime`
- `LocalDateTime`
- `ZonedDateTime`
- `ZoneId`
- `Duration`
- `Period`
- `YearMonth`
- `MonthDay`
- `ChronoUnit`
- `TemporalAdjusters`

---

## 📂 Estrutura dos Exercícios

### ✅ Desafio 1: Agendamento de Consultas
- Um paciente só pode marcar consultas em **dias úteis**
- A consulta deve ter **mínimo de 2 dias de antecedência**
- Caso caia no fim de semana, é ajustada para a **segunda-feira**

---

### ✈️ Desafio 2: Controle de Voos Internacionais
- Um voo sai de Fortaleza às 22h  
- Duração de 7 horas  
- Conversão automática para o **fuso horário de Lisboa**

---

### 🎂 Desafio 3: Sistema de Aniversário
- Cálculo de quantos dias faltam para o **próximo aniversário**
- Ajuste automático para o próximo ano, caso já tenha passado

---

### ⏱️ Desafio 4: Relógio de Ponto
- Cálculo de:
  - Horas trabalhadas
  - Minutos extras
  - Total de minutos
- Utilização de `Duration`

---

### 📦 Desafio 5: Entrega de Encomenda
- Cálculo da data de entrega com base em **dias úteis**
- Ajuste automático para evitar finais de semana

---

### 🎓 Desafio 6: Sistema Acadêmico
- Cálculo de quantos **semestres** um aluno completou
- Baseado na data de matrícula (`YearMonth`)

---

### 💰 Desafio 7: Investimento com Rendimentos Mensais
- Um investimento rende todo dia 5
- Geração das **próximas 12 datas de rendimento**

---

### 🌍 Desafio 8: Evento com Fusos Diferentes
- Uma live ocorre às 20h em São Paulo  
- Conversão para o horário correspondente em **Nova York**

---

## 🧩 Estrutura de Classes

O projeto foi organizado utilizando classes que representam entidades do mundo real:

- `Paciente` / `Consulta`
- `Voo`
- `Usuario`
- `Funcionario`
- `Pedido`
- `Aluno`
- `Investimento`
- `Live`

---

## 💡 Aprendizados

Durante o desenvolvimento, foi possível:

- Entender como manipular datas de forma segura e moderna
- Trabalhar com fusos horários corretamente
- Evitar erros comuns com datas usando a API `java.time`
- Aplicar lógica de negócio com datas e horários
- Melhorar a modelagem orientada a objetos

---

## 🏁 Conclusão

Este projeto vai além de exemplos simples e demonstra como a API `java.time` pode ser aplicada em situações reais do dia a dia de sistemas.

A prática com esses exercícios fortalece a base para desenvolvimento backend, especialmente em aplicações que envolvem:

- Agendamentos
- Sistemas financeiros
- Controle de eventos
- Aplicações distribuídas com fusos horários
