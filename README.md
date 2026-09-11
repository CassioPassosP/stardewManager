# Stardew Manager

Projeto Java desenvolvido como atividade de Programação Orientada a Objetos (POO), com foco em conceitos como herança, polimorfismo, encapsulamento e uso de interfaces.

O sistema simula um curral com diferentes animais, incluindo galinhas, vacas, ovelhas, bezerros e pintinhos, e exibe um menu interativo para visualizar os animais cadastrados.

## Objetivo da atividade

Praticar os seguintes conceitos de POO:

- Herança
- Encapsulamento
- Polimorfismo
- Interfaces
- Classes e subclasses
- Manipulação de listas de objetos

## Estrutura do projeto

```text
stardewManager/
├── src/
│   ├── Main.java
│   ├── classes/
│   │   ├── Animal.java
│   │   ├── GalinhaMae.java
│   │   ├── VacaMae.java
│   │   ├── Ovelha.java
│   │   └── subclasses/
│   │       ├── Bezerro.java
│   │       └── Pintinho.java
│   └── interfaces/
│       └── Animal.java
├── stardewManager.iml
├── README.md
└── out/ (gerado após compilação)
```

## Como funciona

A aplicação inicia com uma lista de animais já cadastrados no curral e exibe um menu principal com as opções:

1. Ver animais do curral
2. Comércio (em manutenção)
3. Sair

Ao selecionar a opção 1, os dados dos animais são impressos no console, incluindo:

- ID
- Nome
- Tipo
- Raça
- Idade
- Status
- Som emitido pelo animal

## Classes principais

- `Animal` — classe base do sistema
- `GalinhaMae` — herda de `Animal`
- `VacaMae` — herda de `Animal`
- `Ovelha` — herda de `Animal`
- `Pintinho` — herda de `GalinhaMae`
- `Bezerro` — herda de `VacaMae`

A interface `interfaces.Animal` define os métodos que cada tipo de animal deve implementar, como coleta de produto e emissão de som.

## Observações

Este projeto é uma implementação simples de gerenciamento de animais em Java, voltada para o aprendizado de orientação a objetos. A parte de comércio está marcada como "em manutenção", mas a estrutura do código já demonstra bem os pilares da POO.

## Autor

Atividade desenvolvida para estudo de Java e Programação Orientada a Objetos.
