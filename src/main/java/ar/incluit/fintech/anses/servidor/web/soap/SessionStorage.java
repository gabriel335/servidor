package ar.incluit.fintech.anses.servidor.web.soap;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class SessionStorage {

    public HashMap<String, Session> sessions = new HashMap<>();

    public HashMap<String, Session> getSessions() {
        return sessions;
    }

    public void setSessions(HashMap<String, Session> sessions) {
        this.sessions = sessions;
    }
}
