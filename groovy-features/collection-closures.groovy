def numbers = [ 5, 7, 9, 12 ]
assert numbers.any { it % 2 == 0 }                        
            //ritorna true, 12 è pari

assert numbers.every { it > 4 }                           
            //ritorna true, sono tutti > 4

assert numbers.findAll { it in 6..10 } == [7,9]           
            //ritorna i numeri tra 5 e 11

assert numbers.collect { ++it } == [6, 8, 10, 13]         
            //ritorna una lista gli elementi incrementati

assert numbers.findAll { it % 2 == 0 }
              .collectEntries{ [(it): (it/2)] } == [12: 6]         
            //composizione di metodi
            // findAll ritorna una lista di elementi pari
            // collectEntries mappa ciascun elemento con la sua metà

numbers.eachWithIndex{ num, idx -> println "$idx: $num" } 
            //output:
            //  0: 5
			//  1: 7
			//  2: 9
			//  3: 12
