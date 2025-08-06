# 🧮 Análise Combinatória em Java

Projeto acadêmico da disciplina de Matemática Discreta que implementa **permutação com e sem repetição** usando linguagem Java e entrada interativa no terminal.

---

## 🔍 Visão geral

O sistema pede dois valores inteiros do usuário:

- `r` → quantidade de elementos por combinação
- `n` → intervalo dos números disponíveis (de 1 até `n`)

Depois, imprime todas as combinações possíveis de acordo com o tipo de permutação:

---

## 🔁 Permutação com Repetição (`md1/MD1.java`)

- Gera todas as sequências possíveis de `r` elementos, onde os valores podem se repetir.
- Valida limites de entrada:
  - `r` entre 2 e 10
  - `n` entre 1 e 20
- Utiliza a função `ProximoNumero()` para gerar as próximas combinações.
- Exemplo de entrada: 4 2
- Saída:

1 1  
1 2  
...  
4 4  

---

## 🚫 Permutação sem Repetição (`md2/MD2.java`)

- Gera sequências de `r` elementos **sem repetir valores**.
- Usa a função `confereImprime()` para verificar se há elementos repetidos.
- Apenas imprime combinações únicas.
- Exemplo de entrada: 3 5
- Saída (apenas sequências únicas, sem repetições como `1 1 2`)

---

👨‍🎓 Autor
Samuel Oliveira Ferraz Porto
CEFET-MG – Engenharia de Computação
Ano: 2022

✅ Status
✔️ Finalizado e funcional
