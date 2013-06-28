def xmlFile = new File('customers.xml')
def xml = new XmlSlurper().parse(xmlFile)

xml.customer.each {
  println it.'@name'.text()
}
