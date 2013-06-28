
import java.lang.Character.isUpperCase as isUpper
import java.lang.Character.toUpperCase as toUpper
import java.lang.Character.toLowerCase as toLower

String.metaclass.swapCase {
	def sb = new StringBuffer()
	delegate.each { 
		char c = it as char
		sb << (isUpper(c) ? toLower(c) : toUpper(c))
	}
	sb.toString()
}

"CiAo".swapCase()