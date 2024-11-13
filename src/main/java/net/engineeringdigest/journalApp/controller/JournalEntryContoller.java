package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryContoller {


    private Map<Long, JournalEntry> journalentity = new HashMap<>();

    @GetMapping("/getAll")
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalentity.values());
    }
}
