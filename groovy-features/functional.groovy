def multiply = { x, y -> return x * y }    

Closure triple = multiply.curry(3)            
// triple = { y -> return 3 * y }

def quadruple = multiply.curry(4) 
// quadruple = { y -> return 4 * y }

def composition = { f, g, x -> return f(g(x)) }

def twelveTimes = composition.curry(triple, quadruple)

def threeDozen = twelveTimes(3)

println "threeDozen: ${threeDozen}"  // threeDozen: 36