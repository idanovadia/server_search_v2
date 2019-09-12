package com.example.demo.api;


import com.example.demo.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RequestMapping("/solveMaze")
@RestController
public class SearchController {
    private final SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @RequestMapping("/AStar")
    @PostMapping
    public @ResponseBody
    String solveAStar(@RequestBody String obj){
        return searchService.solveAstar(obj);
    }

    @RequestMapping("/BFS")
    @PostMapping
    public @ResponseBody
    String solveBFS(@RequestBody String obj){
        return searchService.solveBfs(obj);
    }

    @RequestMapping("/DFS")
    @PostMapping
    public @ResponseBody
    String solveDFS(@RequestBody String obj){
        return searchService.solveDfs(obj);
    }
}
