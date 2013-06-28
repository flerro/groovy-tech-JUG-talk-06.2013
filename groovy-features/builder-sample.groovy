def writer = new FileWriter('markup.html')
def builder = new groovy.xml.MarkupBuilder(writer) 
builder.html {
  head {
    title 'Constructed by MarkupBuilder'
  }
  body {
    h1 'What can I do with MarkupBuilder?' 
    form (action:'whatever') {
        for (line in ['Produce HTML', 'Have some fun']){ 
            input(type:'checkbox',checked:'checked', id:line, '') 
            label(for:line, line)
            br('')
        }
    }
  }
}