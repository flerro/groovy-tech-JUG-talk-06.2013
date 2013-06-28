import groovy.util.logging.*

@Log(value = 'LOGGER')
class Event {
    String name
    Boolean started
    
    void start() {
        LOGGER.info "Event $name is started"
        started = true
    }
}

final Event event = new Event(name: 'gr8Conf')
event.start()