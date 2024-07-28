package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sabores")
public class SaboresController {

    @Autowired
    private SaboresService saboresService;

    @GetMapping()
    public List<Sabores> getSabores() {
        return saboresService.getAllSabores();
    }

    @GetMapping("/{id}")
    public Sabores getSaborById(@PathVariable String id){
        return saboresService.getSaborById(id);
    }

    @PostMapping()
    public String addSabor(@RequestBody Sabores sabor){
        return saboresService.addSabor(sabor);
    }

    @PutMapping("/{id}")
    public void updateSabor(@PathVariable String id, @RequestBody Sabores sabor){
        saboresService.updateSabor(id, sabor);
    }

    @DeleteMapping("/{id}")
    public void deleteSabor(@PathVariable String id){
        saboresService.deleteSabor(id);
    }

}
