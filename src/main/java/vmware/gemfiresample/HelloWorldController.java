package vmware.gemfiresample;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	  private CustomerRepository repository;
	@Autowired
	  private ErrorCatRepository ecrepo;
	
	 
    @RequestMapping("/")
    public String helloWorld(){
        return "Hello world";
    }
    
//    @PostMapping("/sentiment")
//    public Iterable<Sentiment> sentiment(@RequestBody String s){
//    	Sentiment sentiment = new Sentiment(s);
//    	repository.save(sentiment);
//        return repository.findByName(s);
//    }
    
    @PostMapping("/errorcats")
    public Optional<ErrorCat> errorcat(@RequestBody ErrorCat ec){
//    	Sentiment sentiment = new Sentiment(s);
    	ecrepo.save(ec);
        return ecrepo.findById(ec.getId());
    }
    
    @GetMapping("/errorcats") 
    public Iterable<ErrorCat> allErrorCats() {
    	return ecrepo.findAll();
    }
    
    @GetMapping("/errorcats/{id}")
    public Optional<ErrorCat> getErrorCat(@PathVariable String id) {
    	return ecrepo.findById(id);
    }

    
}