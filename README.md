# Prova-1

Classes:
1. JavaLar (main)
2. Sistema
3. Grade
4. Astro (abstrata)
4.1. Planeta (abstrata)
4.1.1-4.1.7 - Planetas
4.2. Bugs
4.3. Devs
6. Coord

Ideia das classes:
- JavaLar: manter somente os do...while que compõem o menu.
- Sistema: instanciar os planetas, bugs e devs & criar funções que executassem partes da partida.
- Grade: um plano 15x15 onde cada planeta, bug e dev pudesse registrar suas posições para evitar sobreposições fora dos momentos desejados.
- Astro: implementar metodos e caracteristicas comuns a planetas, bugs e devs. Principalmente a forma com que interagem com a grade e entre si.
- Planeta: implementar metodos e caracteristicas comuns a todos os planetas. Fazer com que a construção de planetas especificos esteja resumido em alguns poucos inteiros.
- Bugs e Devs: modificar velocidade dos planetas.
- Coord: padronizar o uso de coordenadas.

Do mais creio que o proprio código esteja bem comentado sobre o que cada parte registra ou executa. Apenas a função das orbitas e do cálculo da área são obscuras.

A função das orbitas quebra a orbita quadrada em quatro arestas e utiliza o operador módulo para saber onde colocar o planeta ao fim de um instante.

O cálculo da área é feita com um dispositivo da geometria analítica, no entanto é preciso ordenar os vertices em ordem horária ou anti-horária. Pra isso calculei o centro do polígono e o angulo
que o segmento CENTRO-VERTICE faz com a linha horizontal que passa pelo centro. Depois ordenei os angulos do menor para o maior junto com um indice associado a cada planeta, de onde extraí as coordenadas.
