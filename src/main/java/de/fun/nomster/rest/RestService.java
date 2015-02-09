package de.fun.nomster.rest;

import de.fun.nomster.model.Attendee;
import de.fun.nomster.model.Suggestion;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.LinkedList;
import java.util.List;

/**
 * REST service for Nomster.
 * <p/>
 * User: dominik.heimstaedt
 * Date: 05.02.2015
 * Time: 14:43
 */
@Path("/")
public class RestService
{
    @GET
    @Path("test")
    @Produces({"application/json"})
    public Suggestion test()
    {
        List<Attendee> attendees = new LinkedList<>();
        Attendee tobbo = new Attendee();
        tobbo.setName("Tobbo");
        attendees.add(tobbo);
        Attendee domi = new Attendee();
        domi.setName("Domi");
        attendees.add(domi);
        Suggestion suggestion = new Suggestion();
        suggestion.setName("Dönerstag!");
        suggestion.setDescription("Auf gehts!");
        suggestion.setAttendees(attendees);
        return suggestion;
    }
}
