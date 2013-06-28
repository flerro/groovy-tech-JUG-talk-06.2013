
def numbers = []
assert !numbers 		// lista vuota

def numbersMap = ['one':1]
assert numbersMap 		// mappa non vuota

assert ('Hello World' =~ /World/)  
						// almeno un match

Integer i = null
assert !i

int j = i ?: 0
assert !j 				// 0 è false (come in Perl)

String s = i?.toString()
assert !s 				// s è null
