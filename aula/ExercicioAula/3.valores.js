
function Verificacao(valueA,valueB){
    if (valueA === valueB){
        operation = valueA + valueB
    }

    if (valueA !== valueB){
        operation = valueA * valueB
    }
    return operation
}

Verificacao(5,5)
console.log(operation)