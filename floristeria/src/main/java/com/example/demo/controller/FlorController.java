package com.example.demo.controller;

import com.example.model.Flor;
import com.example.service.FlorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flor")
public class FlorController {

    @Autowired
    private FlorService florService;

    @GetMapping
    public ResponseEntity<List<Flor>> getAllFlores() {
        List<Flor> flores = florService.getAllFlores();
        return ResponseEntity.ok(flores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flor> getFlorById(@PathVariable Long id) {
        Flor flor = florService.getFlorById(id);
        return ResponseEntity.ok(flor);
    }

    @PostMapping
    public ResponseEntity<Flor> createFlor(@RequestBody Flor flor) {
        Flor createdFlor = florService.createFlor(flor);
        return ResponseEntity.status(201).body(createdFlor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Flor> updateFlor(@PathVariable Long id, @RequestBody Flor flor) {
        Flor updatedFlor = florService.updateFlor(id, flor);
        return ResponseEntity.ok(updatedFlor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlor(@PathVariable Long id) {
        florService.deleteFlor(id);
        return ResponseEntity.noContent().build();
    }
}
