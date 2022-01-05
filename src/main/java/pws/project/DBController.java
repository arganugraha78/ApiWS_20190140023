/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws.project;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/mobilelegend")
public class DBController {
     @Autowired
  private JokiMLRepo mobilelegend ;
 
  @GetMapping("/mobilelegend")
  public List<JokiML> getAllJokiML(){
      return mobilelegend.findAll();
  }
   @GetMapping ("/mobilelegend/{ID}")
    public JokiML getJokiMLById(@PathVariable Long ID){
        return mobilelegend.findById(ID).get();
    }
    
    @PostMapping ("/mobilelegend")
    public JokiML saveJokiMLDetails(@RequestBody JokiML s){
        return mobilelegend.save(s);
    }
    
    @PutMapping("/mobilelegend")
    public JokiML updateJokiML(@RequestBody JokiML s){
        return mobilelegend.save(s);
    }
    
    @DeleteMapping("/mobilelegend/{Tier}")
    public ResponseEntity<HttpStatus> getJokiMLById(@PathVariable long Tier){
        mobilelegend.deleteById(Tier);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}