package gt.edu.umg.ingenieria.sistemas.segundo_parcial.service;

import gt.edu.umg.ingenieria.sistemas.segundo_parcial.dao.EventDao;
import gt.edu.umg.ingenieria.sistemas.segundo_parcial.model.EventEntity;
import java.util.*;

/**
 * 
 */
public class EventService {

    /**
     * Default constructor
     */
    public EventService() {
    }

    /**
     * @param id 
     * @return
     */
    public EventEntity getEvent(int id) {
        EventDao dao = new EventDao();
       EventEntity event=dao.readEvent(id);
        return event;
    }

    /**
     * @param event 
     * @return
     */
    public void createEvent(EventEntity event) {
       EventDao dao = new EventDao();
       dao.createEvent(event);
    }

    /**
     * @param event 
     * @return
     */
    public void updateEvent(EventEntity event) {
        EventDao dao = new EventDao();
       dao.createEvent(event);
    }

    /**
     * @param id 
     * @return
     */
    public void deleteEvent(int id) {
        EventDao dao = new EventDao();
       dao.deleteEvent(id);
    }

}