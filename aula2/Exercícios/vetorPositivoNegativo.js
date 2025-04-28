const listaDeNumeros = [2, 2, 2,-2,-2]

const numerosPositivos = listaDeNumeros.filter(n => n > 0).reduce((soma, total) => soma + total, 0)
const numerosNegativos = listaDeNumeros.filter(n => n < 0).length


console.log('Quantidade de negativos: ', numerosNegativos)
console.log('Soma de positivos: ', numerosPositivos)
