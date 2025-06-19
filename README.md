# 📋 Cadastro de Pessoas em Java

Este é um projeto simples feito em Java que permite ao usuário cadastrar, listar e remover pessoas utilizando um menu interativo no terminal. As pessoas são armazenadas em uma lista (`ArrayList`) e ordenadas por nome automaticamente após cada cadastro.

## 💻 Funcionalidades

- ✅ Cadastrar uma nova pessoa (nome e idade)
- 📄 Listar todas as pessoas cadastradas (em ordem alfabética)
- ❌ Remover uma pessoa pelo nome
- 🚪 Sair do programa

## 🧠 Conceitos Utilizados

- Orientação a Objetos (POO)
- Estrutura de repetição (`do-while`)
- Coleções (`ArrayList`)
- Ordenação com `Collections.sort` e `Comparator`
- Leitura de dados com `Scanner`

## 🗃️ Estrutura do Projeto

```
project/
│
├── application/
│   └── Program.java       // Classe principal com o menu
│
└── entities/
    └── People.java        // Classe que representa uma pessoa
```

## ✅ Exemplo de Uso

```
Escolha uma opção:
[1] - Cadastrar pessoa
[2] - Listar pessoas
[3] - Remover pessoa
[4] - Sair

> 1
Nome: João
Idade: 30
Pessoa cadastrada com sucesso!

> 2
Nome: João, Idade: 30
```
